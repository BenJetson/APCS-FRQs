/**
 * Provides useful methods for manipulating an
 * array of College objects.
 * 
 * @author Ben Godfrey
 * @version 28 NOV 2017
 */
public class CollegeGroup {

    /** Holds the array of colleges to be dealt with. */
    private College[] myColleges;

    /** 
     * Constructs a new CollegeGroup object given an array of colleges.
     * 
     * @param myColleges The array of colleges to be stored in this group.
     */
    public CollegeGroup(College[] myColleges) {
        this.myColleges = myColleges;
    }

    /**
     * Updates the tuition for the college with the given name.
     * 
     * @param collegeName The name of the college to be updated.
     * @param tuition The new tuition value.
     */
    public void updateTuition(String collegeName, int tuition) {

        findByName(collegeName).setTuition(tuition);

    }

    /**
     * Finds a College object in the group given its name, 
     * or null if no college exists by that name.
     * 
     * @param searchQuery The name to search for.
     * @return The college object with the given name, or null if nonexistant.
     */
    private College findByName(String searchQuery) {
        int index = 0;
        boolean found = false;

        while (!found && index < myColleges.length) {
            String name = myColleges[index].getName();

            if (name.equals(searchQuery)) {
                found = true;
            } else {
                index++;
            }
        }

        if (found) {
            return myColleges[index];
        }
        return null;
    }

    /**
     * Returns the string representation of the college
     * with the name given.
     * 
     * @param collegeName The name of the college to search for. 
     * @return The string representation of the found college object.
     */
    public String getCollegeString(String collegeName) {
        return findByName(collegeName).toString();
    }

    /**
     * Finds colleges suited to requested conditions given
     * the desired region, lowest tuition, and highest tuition.
     * 
     * @param region The desired region, as a string.
     * @param low The lowest tuition possible, inclusive.
     * @param high The highest tuition possible, inclusive.
     * 
     * @return Array of colleges suited to the conditions.
     */
    public College[] getCollegeList(String region, int low, int high) {

        boolean[] isSelected = new boolean[myColleges.length];
        int counter = 0;

        for (int i=0; i < myColleges.length; i++) {
            String collegeRegion = myColleges[i].getRegion();

            if (collegeRegion.equals(region)) {
                int tuition = myColleges[i].getTuition();

                if (tuition >= low && tuition <= high) {
                    isSelected[i] = true;
                    counter++;
                } else {
                    isSelected[i] = false;
                }
            } else {
                isSelected[i] = false;
            }
        }

        College[] myList = new College[counter];
        int finalCounter = 0;

        for (int i=0; i < myColleges.length; i++) {
            if (isSelected[i]) {
                myList[finalCounter] = myColleges[i];
                finalCounter++;
            }
        }

        return myList;
    }

    /**
     * Generates a string representation of this object. 
     * 
     * @return String representation of this object.
     */
    public String toString() {
        String out = "\n--- COLLEGE GROUP BEGIN ---\n";
        for (College c: myColleges) {
            out += c.toString() + "\n";
        }
        out += "--- COLLEGE GROUP END ---\n";
        
        return out;
    }

}