/**
 * Provides useful methods for calculating statistics
 *   from a number cube.
 * 
 * @author Ben Godfrey
 * @version 13 FEB 2018
 */
public class CubeStats {

    /**
     * Creates an array of random numbers, given a number cube and
     *   the number of tosses to perform.
     * 
     * @param cube The number cube object to be rolled.
     * @param numTosses The number of times to toss the number cube.
     * 
     * @return An array of the results from the number cube tosses. 
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] results = new int[numTosses];

        for (int i=0; i<numTosses; i++) {
            results[i] = cube.toss();
        }

        return results;
    }

    /**
     * Finds the longest streak of repeated values in an array
     *   of values.
     * 
     * @param values The values to be analyzed.
     * 
     * @return The starting index of the first longest streak.
     */
    public static int getLongestRun(int[] values) {

        int currentRunValue = values[0];
        int currentRunStart = 0;
        int currentRunLength = 0;

        int longestRunStart = -1;
        int longestRunLength = -1;

        for (int i=0; i<values.length; i++) {
            boolean match = false;
            int value = values[i];

            if (currentRunValue == value) {
                match = true;
                currentRunLength++;
            }

            if (currentRunLength > 1 && currentRunLength > longestRunLength) {
                longestRunLength = currentRunLength;
                longestRunStart = currentRunStart;
            }

            if (!match) {
                currentRunValue = value;
                currentRunLength = 1;
                currentRunStart = i;
            }

        }

        return longestRunStart;

    }

}