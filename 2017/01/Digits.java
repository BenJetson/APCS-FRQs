import java.util.ArrayList;

/**
 * Provides a useful way to represent the digits of a number.
 * 
 * @author Ben Godfrey
 * @version 22 FEB 2018
 */
public class Digits {

    /** Holds the digits of the number. */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a new digits object given a number.
     * 
     * @param num The number to be stored as digits.
     */
    public Digits(int num) {

        digitList = new ArrayList<Integer>();

        if (num == 0) digitList.add(new Integer(0));

        while (num > 0) {
            Integer digit = new Integer(num % 10);
            digitList.add(0, digit);
            num /= 10;
        }

    }

    /**
     * Determines if a number's digits are strictly increasing.
     * 
     * @return Whether the number's digits are strictly increasing.
     */
    public boolean isStrictlyIncreasing() {
        int previous = -1;

        for (Integer i: digitList) {
            int current = i.intValue();

            if (current <= previous) return false;
            previous = current;
        }

        return true;
    }

}