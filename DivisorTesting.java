import java.util.Arrays;

/**
 * Testing ground for self divisors.
 */
public class DivisorTesting {

    /**
     * Makes calls to the testing methods.
     */
    public static void main(String[] args) {
        printDivisorStatus(128);
        printDivisorStatus(26);
        printDivisorStatus(24);
        printDivisorStatus(100);

        printNextDivisors(10, 3);
        printNextDivisors(14, 5);
        printNextDivisors(20, 20);
    }

    /**
     * Prints out whether or not a number is a self divisor to the console
     * in a nicely formatted way.
     * 
     * @param number The number to check.
     */
    public static void printDivisorStatus(int number) {
        System.out.printf("Is %d a self divisor? %b%n", number, SelfDivisor.isSelfDivisor(number));
    }

    /**
     * Prints out the next self divisors after a number to the console
     * in a nicely formatted way.
     * 
     * @param start The number to start checking at.
     * @param instances The number of self divisors to look for.
     */
    public static void printNextDivisors(int start, int instances) {
        System.out.printf("What are the next %d self divisors after %d?%n%s%n", 
                          instances, start, Arrays.toString(SelfDivisor.firstNumDivisors(start, instances)));
    }

}