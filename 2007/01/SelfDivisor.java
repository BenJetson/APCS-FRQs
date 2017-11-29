
/**
 * Provides useful methods for identifying 
 * self divisors.
 * 
 * @author Ben Godfrey
 * @version 17 NOV 2017
 */
public class SelfDivisor {

    /**
     * Determines whether or not a number is a self divisor.
     * 
     * @param number The number to be tested.
     * @return Self divisor status.
     */
    public static boolean isSelfDivisor(int number) {
        String numAsString = Integer.toString(number);
        int numDigits = numAsString.length();

        for (int digit=0; digit < numDigits; digit++) {
            int divisor = Integer.parseInt(numAsString.substring(digit, digit+1));

            if (divisor == 0 || number % divisor != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Finds the first num self divisors after the starting number.
     * 
     * @param start The number to start checking at.
     * @param num The number of self divisors to search for.
     * 
     * @return Array of found self divisors.
     */
    public static int[] firstNumDivisors(int start, int num) {
        int[] divisors = new int[num];
        int counter = 0;
        int testNum = start;

        while (counter < num) {
            if (isSelfDivisor(testNum)) {
                divisors[counter] = testNum;
                counter++;
            }
            testNum++;
        }

        return divisors;
    }
}