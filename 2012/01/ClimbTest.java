public class ClimbTest {

    public static void main(String[] args) {
        
        ClimbingClub hikingClub = new ClimbingClub();
        hikingClub.addClimb("Monadnock", 274);
        hikingClub.addClimb("Whiteface", 301);
        hikingClub.addClimb("Algonquin", 225);
        hikingClub.addClimb("Monadnock", 344);

        System.out.println(hikingClub);
        int numNames = hikingClub.distinctPeakNames();

    }

}