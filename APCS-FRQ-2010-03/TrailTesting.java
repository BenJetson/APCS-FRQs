
/**
 * Write a description of class TrailTesting here.
 *
 * @author Ben Godfrey
 * @version 14 NOV 2017
 */
public class TrailTesting
{
    public static void main(String[] args) {
        Trail bestTrailEver = new Trail(new int[] {100, 150, 105, 120, 90, 80, 50, 75, 70, 80, 90, 100});
        
        System.out.println(bestTrailEver);
        
        System.out.printf("Is level from marker 0 to 3?  %b%n", bestTrailEver.isLevelTrailSegment(0, 3));
        System.out.printf("Is level from marker 8 to 9? %b%n", bestTrailEver.isLevelTrailSegment(8, 9));
        
    }
}
