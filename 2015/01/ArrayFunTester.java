import java.util.Arrays;

public class ArrayFunTester {

    public static void main(String[] args) {
        
        int[] arr1 = new int[] {1, 3, 2, 7, 3};
        
        spacer(2);
        System.out.printf("arr1: %s%n", Arrays.toString(arr1));
        System.out.printf("arr1 sum: %d%n", ArrayFun.arraySum(arr1));

        int[][] mat1 = {
            { 1,  3,  2,  7,  3},
            {10, 10,  4,  6,  2},
            { 5,  3,  5,  9,  6},
            { 7,  6,  4,  2,  1}
        };

        int[] sums1 = ArrayFun.rowSums(mat1);

        spacer(2);
        System.out.println("mat1:");
        System.out.println(Arrays.deepToString(mat1));
        System.out.printf("mat1 sums: %s%n", Arrays.toString(sums1));
        
        System.out.printf("mat1 isDiverse? %b%n", 
        ArrayFun.isDiverse(mat1));
        
        int[][] mat2 = {
            { 1,  1,  5,  3,  4},
            {12,  7,  6,  1,  9},
            { 8, 11, 10,  2,  5},
            { 3,  2,  3,  0,  6}
        };
        
        int[] sums2 = ArrayFun.rowSums(mat2);
        
        spacer(2);
        System.out.println("mat2:");
        System.out.println(Arrays.deepToString(mat2));
        System.out.printf("mat2 sums: %s%n", Arrays.toString(sums2));

        System.out.printf("mat2 isDiverse? %b%n", 
                            ArrayFun.isDiverse(mat2));

        spacer(2);

    }

    /**
     * Prints n blank lines to space output.
     * 
     * @param n The number of blank lines.
     */
    public static void spacer(int n) {
        for (int i=0; i<n; i++) {
            System.out.println();
        }
    }

}