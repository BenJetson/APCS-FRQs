public class Vehicle extends TaxableItem {

    private double dealerCost;
    private double dealerMarkup;

    public Vehicle(double dealerCost, double dealerMarkup, double taxRate) {
        super(taxRate);
        
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }

    public double getListPrice() {
        return dealerCost + dealerMarkup;
    }

    public void changeMarkup(double dealerMarkup) {
        this.dealerMarkup = dealerMarkup;
    } 

}