/**
 * Helper class that provides structure for a cookie order.
 * 
 * @author Ben Godfrey
 * @version 13 FEB 2018
 */
public class CookieOrder {

    /** The variety of cookies in the order. */
    private String variety;
    /** The number of boxes ordered. */
    private int numBoxes;

    /**
     * Creates a new CookieOrder object.
     * 
     * @param variety The variety of cookies to order.
     * @param numBoxes The number of boxes to order.
     */
    public CookieOrder(String variety, int numBoxes) {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    /**
     * Returns the variety of cookies ordered.
     * 
     * @return The variety of cookies ordered.
     */
    public String getVariety() {
        return variety;
    }

    /**
     * Returns the number of boxes ordered.
     * 
     * @return The number of boxes ordered.
     */
    public int getNumBoxes() {
        return numBoxes;
    }

    /**
     * Returns a representation of this object as a string. 
     * 
     * @return String representation of this object. 
     */
    public String toString() {
        return String.format("{ CookieOrder - variety: %s,  numBoxes: %d }",
                                variety, numBoxes);
    }

}