
/**
 * Dummy class that makes calls to Trail for testing purposes.
 *
 * @author Ben Godfrey
 * @version 14 NOV 2017
 */
public class TrailTesting
{
    public static void main(String[] args) {
                                         // Index: 0    1    2    3    4   5   6   7   8   9   10  11
        Trail bestTrailEver = new Trail(new int[] {100, 150, 105, 120, 90, 80, 50, 75, 70, 80, 90, 100});
        
        System.out.println();
        System.out.println(bestTrailEver);
        
        System.out.printf("Is level from marker 0 to 3? %b%n", bestTrailEver.isLevelTrailSegment(0, 3));
        System.out.printf("Is level from marker 7 to 8? %b%n", bestTrailEver.isLevelTrailSegment(7, 8));
        
                                       // Index: 0   1   2   3   4   5   6    7    8    9    10  11  12  13
        Trail betterTrail = new Trail(new int[] {50, 70, 66, 81, 86, 89, 100, 107, 111, 118, 97, 91, 71, 52}); 
        
        System.out.println(betterTrail);

        System.out.printf("Is level from marker 0 to 3? %b%n", betterTrail.isLevelTrailSegment(0, 3));
        System.out.printf("Is level from marker 5 to 6? %b%n", betterTrail.isLevelTrailSegment(5, 6));
        System.out.printf("Is level from marker 3 to 5? %b%n", betterTrail.isLevelTrailSegment(3, 5));
    }
}
