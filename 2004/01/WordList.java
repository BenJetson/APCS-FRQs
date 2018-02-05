import java.util.ArrayList;

/**
 * Provides useful methods for manipulating an
 *   ArrayList of words. 
 * 
 * @author Ben Godfrey
 * @version 05 FEB 2018
 */
public class WordList {

    /** Stores the list of words. */
    private ArrayList<String> myList;

    /** 
     * Creates a new WordList given an ArrayList of words.
     * 
     * @param myList An ArrayList of strings; the words to be manipulated.
     */
    public WordList(ArrayList<String> myList) {
        this.myList = myList;
    }

    /**
     * Counts the number of words in the list that are a given length.
     * 
     * @param len The length to search for.
     * @return The number of words that are len length.
     */
    public int numWordsOfLength(int len) {
        int counter = 0;

        for (String s: myList) {
            if (s.length() == len) counter++;
        }

        return counter;
    }

    /**
     * Removes words from the list that are a given length. 
     * 
     * @param len The exact length of words to be removed.
     */
    public void removeWordsOfLength(int len) {
        for (int i=0; i<myList.size(); i++) {
            if (myList.get(i).length() == len) {
                myList.remove(i);
                i--;
            }
        }
    } 

    /**
     * Returns a String representation of this object.
     * 
     * @return A String representation of this object. 
     */
    public String toString() {
        return myList.toString();
    }

}