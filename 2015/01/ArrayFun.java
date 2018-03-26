/**
 * Provides helper methods for working with
 *   single and two dimensional arrays.
 * 
 * @author Ben Godfrey
 * @version 26 MAR 2018
 */
public class ArrayFun {

    /**
     * Computes the sum of all items in an array.
     * 
     * @param arr The array to be summed.
     * @return The total sum of all items in arr.
     */
    public static int arraySum(int[] arr) {

        int sum = 0;

        for (int i: arr) {
            sum += i;
        }

        return sum;

    }

    /**
     * Computes the sum of all rows of a 2D array.
     * 
     * @param arr2D The 2D array to compute sums from.
     * @return An array containing the sum of each row.
     */
    public static int[] rowSums(int[][] arr2D) {

        int[] sums = new int[arr2D.length];

        for (int i=0; i<arr2D.length; i++) {
            int[] currentRow = arr2D[i];
            int currentSum = arraySum(currentRow);
            sums[i] = currentSum;
        }

        return sums;

    }

    /** 
     * Determines whether or not a 2D array's sums are 
     *   "diverse." Diversity is defined as no two rows
     *   having the exact same sum.
     * 
     * @param arr2D The 2D array for processing.
     * @return Whether or not the given 2D array is diverse.
     */
    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);

        for (int i=0; i<sums.length; i++) {
            int searchValue = sums[i];

            for (int j=0; j<sums.length; j++) {
                int currentValue = sums[j];

                if (i != j && searchValue == currentValue) return false;
            }
        }

        return true;
    }

}