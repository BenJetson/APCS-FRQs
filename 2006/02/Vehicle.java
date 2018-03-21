public class Vehicle extends TaxableItem {

    /** The cost of the vehicle to the dealer. */
    private double dealerCost;

    /** The amount the dealer marks up the price. */
    private double dealerMarkup;

    /**
     * Constructs a new Vehicle, given dealer cost, dealer markup, and tax rate.
     * 
     * @param dealerCost The cost of the vehicle to the dealer.
     * @param dealerMarkup The amount the dealer marks up the price.
     * @param taxRate The rate at which the vehicle is taxed.
     */
    public Vehicle(double dealerCost, double dealerMarkup, double taxRate) {
        super(taxRate);
        
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }

    /** 
     * Returns the list price of an item.
     * 
     * @return The list price.
     */
    public double getListPrice() {
        return dealerCost + dealerMarkup;
    }

    /** 
     * Changes the dealer markup on a vehicle.
     * 
     * @param dealerMarkup The new dealer markup value.
     */
    public void changeMarkup(double dealerMarkup) {
        this.dealerMarkup = dealerMarkup;
    } 

    /**
     * Gets a String representation of this object.
     * 
     * @return A string representation of this object.
     */
    public String toString() {
        return String.format("Vehicle [dealerCost=%f, dealerMarkup=%f, " + 
                             "taxRate=%f, listPrice=%f, purchasePrice=%f]",
                             dealerCost, dealerMarkup, getTaxRate(),
                             getListPrice(), purchasePrice());
    }

}