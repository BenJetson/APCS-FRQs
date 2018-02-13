import java.util.Arrays;

public class CubeTest {

    public static void main(String[] args) {
        
        NumberCube cube = new NumberCube();

        int[] values1 = new int[] 
                {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
        
        int[] values2 = new int[] 
                {3, 6, 1, 4, 3, 6, 2, 4, 1, 3, 5, 6, 2, 1, 5, 2, 3, 4};

        int[] values3 = CubeStats.getCubeTosses(cube, 8);

        int[] values4 = CubeStats.getCubeTosses(cube, 45);

        System.out.println(Arrays.toString(values1));
        System.out.println(CubeStats.getLongestRun(values1));

        System.out.println(Arrays.toString(values2));
        System.out.println(CubeStats.getLongestRun(values2));

        System.out.println(Arrays.toString(values3));
        System.out.println(CubeStats.getLongestRun(values3));

        System.out.println(Arrays.toString(values4));
        System.out.println(CubeStats.getLongestRun(values4));
    }

}