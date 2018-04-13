/**
 * Represents a Salad item. 
 * 
 * @author Ben Godfrey
 * @version 12 APRIL 2018
 */
public class Salad implements MenuItem {
    
    /** The name of the Salad */
    private String mName;
    /** The price of the Salad */
    private double mPrice;

    /**
     * Creates a new Salad given the price and name
     * 
     * @param name The name of the Salad
     * @param price The price of the Salad
     */
    public Salad(String name, double price) {
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