/**
 * A less fun version of Hangman!
 * 
 * @author Ben Godfrey
 * @version 06 DEC 2017
 */
public class HiddenWord {
    
    /** The "hidden word" */
    private String secret;

    /** 
     * Creates a new HiddenWord, given a word to hide.
     * 
     * @param secret The "hidden word"
     */
    public HiddenWord(String secret) {
        this.secret = secret;
    }

    /**
     * Checks to see if a char is in the secret somewhere.
     * 
     * @param c The character to search for.
     * @return If the char exists in the secret.
     */
    private boolean CharIsInSecret(char c) {
        for (int i=0; i<secret.length(); i++) {
            if (secret.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

    /** 
     * Returns a hint string, given a guess.
     * 
     * @param guess The guess at what the secret might be.
     * @return The hint string with symbols for missed chars.
     */
    public String getHint(String guess) {
        String result = "";

        for (int i=0; i<secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                result += "" + secret.charAt(i);
            } else if (CharIsInSecret(guess.charAt(i))) {
                result += "+";
            } else {
                result += "-";
            }
        }
        return result;
    }
}