/** 
 * Holds information about a mountain climb.
 * 
 * @author Ben Godfrey
 * @version 17 APR 2018
 */
public class ClimbInfo {
    
    /** The name of the mountain peak */
    private String name;
    /** The time taken for the climb in minutes */
    private int time;

    /**
     * Creates a new ClimbInfo given the name and time.
     * 
     * @param name The name of the mountain peak
     * @param time The number of minutes taken to complete climb
     */
    public ClimbInfo(String name, int time) {
        this.name = name;
        this.time = time;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    public String toString() {
        return String.format("[ Climb, name:\"%s\", time:%d ]", name, time);
    }

} 