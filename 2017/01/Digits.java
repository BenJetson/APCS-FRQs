import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {

        digitList = new ArrayList<Integer>();

        if (num == 0) digitList.add(new Integer(0));

        while (num > 0) {
            Integer digit = new Integer(num % 10);
            digitList.add(0, digit);
            num /= 10;
        }

    }

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