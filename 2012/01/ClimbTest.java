public class ClimbTest {

    public static void main(String[] args) {
        
        ClimbingClub hikingClub = new ClimbingClub();
        
        System.out.println(hikingClub);
        hikingClub.addClimb("Monadnock", 274);
        
        System.out.println(hikingClub);
        hikingClub.addClimb("Whiteface", 301);
        
        System.out.println(hikingClub);
        hikingClub.addClimb("Algonquin", 225);
        
        System.out.println(hikingClub);
        hikingClub.addClimb("Monadnock", 344);

        System.out.println(hikingClub);

    }

}