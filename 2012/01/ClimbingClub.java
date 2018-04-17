import java.util.List;
import java.util.ArrayList;

/**
 * Represents a climbing club and provides
 * useful methods for management.
 * 
 * @author Ben Godfrey
 * @version 17 APR 2018
 */
public class ClimbingClub {

    /** Holds the climbs done by members. */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub */
    public ClimbingClub() {
        climbList = new ArrayList<ClimbInfo>();
    }

    /** 
     * Adds a climb to the climb list.
     * 
     * @param name The name of the mountain peak.
     * @param time The time in minutes taken to climb
     */
    public void addClimb(String name, int time) {
        ClimbInfo c1 = new ClimbInfo(name, time);
        String n1 = name;

        boolean added = false;
        int i=0;

        while(!added && i < climbList.size()) {
            ClimbInfo c2 = climbList.get(i);
            String n2 = c2.getName();

            if (n2.compareTo(n1) < 1) {
                climbList.add(i, c1);
                added = true;
            }

            i++;
        }

        if (!added) climbList.add(c1);
    }

    /** 
     * Determines the number of distinct peak names in the
     * climb list.
     * 
     * @return The number of distinct peak names
     */
    public int distinctPeakNames() {
        if (climbList.size() == 0) return 0;

        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;

        for (int k=1; k<climbList.size(); k++) {
            currInfo = climbList.get(k);
            currName = currInfo.getName();

            if (prevName.compareTo(currName) != 0) {
                numNames++;
                prevName = currName;
            }
        }

        return numNames;
    }

    /**
     * @return this object as a string
     */
    public String toString() {
        String climbs = "";

        for (ClimbInfo c: climbList) {
            climbs += "\n  " + c.toString() ;
        }

        return String.format("{ ClimbingClub%n%s%n%n  distinctPeakNames: %d }%n", 
                             climbs, distinctPeakNames());

    }
}