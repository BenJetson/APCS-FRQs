/**
 * Ticket that is purchased in advance of the performance/show/etc.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public class Advance extends Ticket {

    /** The number of days the ticket was purchased in advance. */
    private int daysAdvance;

    /** 
     * Constructs a new Advance ticket given the number 
     * of days purchased in advance.
     * 
     * @param daysAdvance The number of days purchased in advance.
     */
    public Advance(int daysAdvance) {
        super();
        this.daysAdvance = daysAdvance;
    }

    /** 
     * Gets the price of an Advance ticket.
     * 
     * @reutrn The price of the ticket.
     */
    public double getPrice() {
        if (daysAdvance > 9) return 30;
        else return 40;
    }

}