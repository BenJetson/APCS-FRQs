public class CubeStats {

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] results = new int[numTosses];

        for (int i=0; i<numTosses; i++) {
            results[i] = cube.toss();
        }

        return results;
    }

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