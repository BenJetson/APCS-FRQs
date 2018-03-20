/**
 * Class that provides useful methods for representing 
 * a ticket to a show/performance/etc.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public abstract class Ticket {

    /** The serial number of the ticket. */
    private int serialNumber;

    /** Constructs a new Ticket. */
    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    /** 
     * Returns the price of the ticket.
     * 
     * @return The price of the ticket.
     */
    public abstract double getPrice();

    /**
     * Returns a string representation of this object.
     * 
     * @return A string representation of this object.
     */
    public String toString() {
        return String.format("Number: %f\nPrice: %d", serialNumber, getPrice());
    }

    /** 
     * Gets the next ticket serial number.
     * 
     * @return A serial number.
     */
    public static int getNextSerialNumber() {
        return (int)(Math.random() * 1000000 * Math.random());
    }

}