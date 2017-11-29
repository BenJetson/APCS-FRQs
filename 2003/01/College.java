/**
 * Object representation of a college and useful methods.
 * 
 * @author Ben Godfrey
 * @version 28 NOV 2017
 */
public class College {

    /** The college name */
    private String name;

    /** The college region */
    private String region;

    /** The college tuition  */ 
    private int tuition; 

    /**
     * Constructs a new College object given the college name, 
     * region, and cost of tuition.
     * 
     * @param name The college name.
     * @param region The college region.
     * @param tuition The tuition, to the nearest dollar.
     */
    public College(String name, String region, int tuition) {
        this.name = name;
        this.region = region; 
        this.tuition = tuition;
    }

    /**
     * Get the college name.
     * 
     * @return The college name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get the college region. 
     * 
     * @return The college region.
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return The college tuition.
     */
    public int getTuition() {
        return tuition; 
    }

    /**
     * Sets the tuition for this college object to a new value.
     * 
     * @param newTuition The new tuition.
     */
    public void setTuition(int newTuition) {
        this.tuition = newTuition;
    }

    /**
     * Generates a string representation of this object. 
     * 
     * @return String representation of this object.
     */
    public String toString() {
        return String.format("[ College name=%s%n          region=%s%n          tuition=$%d ]", 
                             name, region, tuition);
    }
}