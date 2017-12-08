public class Phrase {

    private String currentPhrase;

    public Phrase(String p) {
        this.currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {

        int index = 0;
        int counter = 0;

        do {
            
            index = currentPhrase.indexOf(str, index);

            if (index == -1) {
                return -1;
            }

            counter++;
            index++;

        } while(counter < n);

        return index - 1;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        int nthIndex = findNthOccurrence(str, n);
        
        if (nthIndex != -1) {
            String prefix = currentPhrase.substring(0, nthIndex);
            String suffix = currentPhrase.substring(nthIndex + str.length(), currentPhrase.length());
            currentPhrase = prefix + repl + suffix;
        }
    }

    public int findLastOccurrence(String str) {
        int index = -1; 
        int counter = 1;
        boolean foundLast = false;

        do {
            int currentIndex = findNthOccurrence(str, counter);

            if (currentIndex == -1 || counter > 10) {
                foundLast = true;
            } else {
                counter++;
                index = currentIndex;
            }

        } while (!foundLast);

        return index;
    }

    public String toString() {
        return currentPhrase;
    }
}