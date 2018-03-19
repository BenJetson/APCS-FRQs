public abstract class TaxableItem implements Item {

    private double taxRate;

    public abstract double getListPrice();

    public TaxableItem(double taxRate) {
        this.taxRate = taxRate;
    }

    public double purchasePrice() {
        return getListPrice() * (1 + taxRate);
    }

}