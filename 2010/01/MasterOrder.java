import java.util.List;
import java.util.ArrayList;

/**
 * Provides a structure for handling multiple orders of cookies.
 * 
 * @author Ben Godfrey
 * @version 13 FEB 2018
 */
public class MasterOrder {

    /** Holds the list of cookie orders. */
    private List<CookieOrder> orders;

    /** Constructs a new master order. */
    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    /**
     * Adds another order of cookies to the master order.
     * 
     * @param theOrder The order to be added.
     */
    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    /**
     * Calculates the total number of boxes in the master order.
     * 
     * @return The total number of boxes.
     */
    public int getTotalBoxes() {
        int sum = 0;

        for (CookieOrder c: orders) {
            sum += c.getNumBoxes();
        }

        return sum;
    }

    /**
     * Removes all orders for a particular variety of cookies
     *   from the master order. 
     * 
     * @param cookieVar The variety of cookies to be removed.
     * 
     * @return The number of boxes removed.
     */
    public int removeVariety(String cookieVar) {
        int counter = 0;

        for (int i=0; i<orders.size(); i++) {
            CookieOrder c = orders.get(i);
            String type = c.getVariety();

            if (type.equals(cookieVar)) {
                counter += c.getNumBoxes();
                orders.remove(i);
                i--;
            }
        }

        return counter;
    }

    /**
     * Returns a representation of this object as a string. 
     * 
     * @return String representation of this object. 
     */
    public String toString() {
        String output = "---MASTER ORDER---\n";

        for (CookieOrder c: orders) {
            output += c + "\n";
        }

        return output + "---END MASTER ORDER---";
    }

}