/**
 * Represents a Sandwich item. 
 * 
 * @author Ben Godfrey
 * @version 12 APRIL 2018
 */
public class Sandwich implements MenuItem {

    /** The name of the Sandwich */
    private String mName;
    /** The price of the Sandwich */
    private double mPrice;

    /**
     * Creates a new Sandwich given the price and name
     * 
     * @param name The name of the Sandwich
     * @param price The price of the Sandwich
     */
    public Sandwich(String name, double price) {
        mName = name;
        mPrice = price;
    }

    public double getPrice() {
        return mPrice;
    }

    public String getName() {
        return mName;
    }
}