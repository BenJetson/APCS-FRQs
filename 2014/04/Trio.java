/**
 * A Trio is a special that consists of a Sandwich, 
 *  Salad, and Drink. Price is highest two items.
 * 
 * @author Ben Godfrey
 * @version 12 APRIL 2018
 */
public class Trio implements MenuItem {

    /** The Sandwich item. */
    private Sandwich mSandwich;
    /** The Salad item. */
    private Salad mSalad;
    /** The Drink item. */
    private Drink mDrink;

    /**
     * Creates a new Trio.
     * 
     * @param sandwich The sandwich item.
     * @param salad The salad item. 
     * @param drink The drink item.
     */
    public Trio (Sandwich sandwich, Salad salad, Drink drink) {
        mSandwich = sandwich;
        mSalad = salad;
        mDrink = drink;
    }

    public String getName() {
        return String.format("%s/%s/%s Trio", mSandwich.getName(),
                                              mSalad.getName(),
                                              mDrink.getName());
    }

    public double getPrice() {
        double[] prices = new double[] {
            mSandwich.getPrice(),
            mSalad.getPrice(),
            mDrink.getPrice()
        };

        double low = prices[0];

        for (double d: prices)
            if (Math.min(d, low) == d) 
                low = d;
        
        double price = 0;

        for (double d: prices)
            if (d != low)
                price += d;

        return price;
    }

    public String toString() {
        return String.format("%n[Trio: name:\"%s\"%n       price: $%d.%d]%n", 
                              getName(), (int)getPrice() / 1, (int)((getPrice() * 100) % 100));
    }
}