/**
 * An Advance ticket with a student discount.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public class StudentAdvance extends Advance {

    /**
     * Creates a new StudentAdvance ticket given the days
     * purchased in advance.
     * 
     * @param daysAdvance The number of days purchased in advance.
     */
    public StudentAdvance(int daysAdvance) {
        super(daysAdvance);
    }

    /** 
     * Gets the student price for this ticket.
     * 
     * @return The price of the ticket.
     */
    public double getPrice() {
        return super.getPrice() / 2;
    }

    /**
     * Returns a String representation of this Ticket, 
     * with a notation that a student ID is required.
     * 
     * @return A String representation of this object. 
     */
    public String toString() {
        return super.toString() + "\n**Student ID Required**";
    }
}