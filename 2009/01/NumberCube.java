/**
 * Virtual dice for Java!
 * 
 * @author Ben Godfrey
 * @version 13 FEB 2018
 * 
 */
public class NumberCube {

    /** Empty constructor -- just creates a new number cube. */
    public NumberCube() {}

    /**
     * Throws the virtual number cube and returns the result. 
     * 
     * @return A random number between 1 and 6, inclusive. 
     */
    public int toss() {
        return (int)(Math.random() * (5) + 1);
    }

}