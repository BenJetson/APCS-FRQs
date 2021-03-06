
import java.util.Arrays;

/**
 * Provides an object representation of a hiking trail
 * and useful methods for manipulating the data.
 *
 * @author Ben Godfrey
 * @version 14 NOV 2017
 */
public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;

    /**
     * Constructs a new Trail, given an array of markers.
     * 
     * @param markers An array of integers that represent the trail markers.
     */
    public Trail(int[] markers)
    {
        this.markers = markers;
    }
    
    /**
     * Checks if a trail is level between the start and end markers.
     * 
     * @param start The starting marker.
     * @param end The ending marker.
     * 
     * @return Whether or not segment is level.
     */
    public boolean isLevelTrailSegment(int start, int end) {
        int highest = markers[start];
        int lowest  = markers[start];
        
        for (int i=start; i <= end; i++) {
            highest = Math.max(highest, markers[i]);
            lowest  = Math.min(lowest,  markers[i]);
        }            
        
        int difference = Math.abs(highest - lowest);
        
        return difference < 10;
    }
    
    /**
     * Checks if a trail has more than 3 large chagnes in height.
     * 
     * @return Whether or not a trail is difficult.
     */
    public boolean isDifficult() {
        int numBigChanges = 0;
        
        for (int i=1; i < markers.length; i++) {
            int difference = Math.abs(markers[i-1] - markers[i]);
            
            if (difference >= 30) {
                numBigChanges++;
            }
        }
        
        return numBigChanges >= 3;
    }
    
    /**
     * Creates a representation of this object as a string.
     * 
     * @return This Trail as a formatted string.
     */
    public String toString() {
        return String.format("Trail { markers: %s,%n" +
                             "        isDifficult: %b }",
                             Arrays.toString(markers), this.isDifficult());
    }
}
