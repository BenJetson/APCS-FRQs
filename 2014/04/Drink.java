/**
 * Represents a Drink item. 
 * 
 * @author Ben Godfrey
 * @version 12 APRIL 2018
 */
public class Drink implements MenuItem {
    
    /** The name of the Drink */
    private String mName;
    /** The price of the Drink */
    private double mPrice;

    /**
     * Creates a new Drink given the price and name
     * 
     * @param name The name of the Drink
     * @param price The price of the Drink
     */
    public Drink(String name, double price) {
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