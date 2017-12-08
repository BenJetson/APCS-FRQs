/**
 * Provides useful methods for manipulating a phrase.
 * 
 * @author Ben Godfrey
 * @version 08 DEC 2017
 */
public class Phrase {

    /** The phrase to be manipulated */
    private String currentPhrase;
    
    /** Constructs a new Phrase object. */  
    public Phrase(String p) {
        this.currentPhrase = p;
    }

    /** 
     * Returns the index of the nth occurrence of str in the current phrase.
     * 
     * @param str The string to search for.
     * @param n Which occurrence to search for. 
     * @return The index of the occurrence, -1 if nonexistant.
     */
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

    /**
     * Replaces the Nth occurrence of a string with something else.
     * 
     * @param str The string to be replaced.
     * @param n Which occurrence to replace.
     * @param repl The string to replace with.
     */
    public void replaceNthOccurrence(String str, int n, String repl) {
        int nthIndex = findNthOccurrence(str, n);
        
        if (nthIndex != -1) {
            String prefix = currentPhrase.substring(0, nthIndex);
            String suffix = currentPhrase.substring(nthIndex + str.length(), currentPhrase.length());
            currentPhrase = prefix + repl + suffix;
        }
    }

    /** 
     * Finds the last occurrence of a string in the phrase.
     * 
     * @param str The string to search for.
     * @return The index of the last occurrence.
     */
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

    /**
     * This object, as a String!
     * 
     * @return A String representation of this object.
     */
    public String toString() {
        return currentPhrase;
    }
}