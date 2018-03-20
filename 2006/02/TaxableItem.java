/**
 * Abstract class that provides useful helper methods
 * for representing a taxable item. 
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public abstract class TaxableItem implements Item {

    /** The rate at which the item is taxed. */
    private double taxRate;

    /**
     * Returns the actual list price of an item.
     * 
     * @return The list price.
     */
    public abstract double getListPrice();

    /** 
     * Constructs a new TaxableItem, given the tax rate. 
     * 
     * @param taxRate The rate at which the item is taxed.
     */
    public TaxableItem(double taxRate) {
        this.taxRate = taxRate;
    }

    /** 
     * Returns the list price of an item.
     * 
     * @return The list price.
     */
    public double purchasePrice() {
        return getListPrice() * (1 + taxRate);
    }

}