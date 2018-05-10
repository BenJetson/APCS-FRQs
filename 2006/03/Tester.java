import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        
        Customer[] list1 = new Customer[] {
            new Customer("Arthur", 4920),
            new Customer("Burton", 3911),
            new Customer("Burton", 4944),
            new Customer("Franz",  1692),
            new Customer("Horton", 9221), 
            new Customer("Jones",  5554),
            new Customer("Miller", 9360),
            new Customer("Nguyen", 4339)
        };

        Customer[] list2 = new Customer[] {
            new Customer("Aaron",   1729),
            new Customer("Baker",   2921),
            new Customer("Burton",  3911), 
            new Customer("Dillard", 6522),
            new Customer("Jones",   5554),
            new Customer("Miller",  9360),
            new Customer("Noble",   3335)
        };

        Customer[] result = new Customer[10];

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(result));

        prefixMerge(list1, list2, result);

        System.out.println(Arrays.toString(result));
        

    }

    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {

        int resultIndex = 0;
        int index = 0;

        while(resultIndex < result.length) {
            Customer c1 = list1[index];
            Customer c2 = list2[index];

            Customer first  = null;
            Customer second = null;

            if (c1.compareTo(c2) < 0) {
                first  = c1;
                second = c2;
            } else if (c1.compareTo(c2) > 0) {
                first  = c2;
                second = c1;
            } else {
                first = c1;
            }

            for (Customer c: result) {
                if (c != null) {
                    if (first != null && c.compareTo(first) == 0) first = null;
                    if (second != null && c.compareTo(second) == 0) second = null;
                }
            }

            if (resultIndex < result.length && first != null) {
                result[resultIndex] = first;
                resultIndex++;
            }

            if (resultIndex < result.length && second != null) {
                result[resultIndex] = second; 
                resultIndex++;
            }

            index++;
        }

    }

}