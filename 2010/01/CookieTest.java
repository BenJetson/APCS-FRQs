public class CookieTest {
    
    public static void main(String[] args) {
        
        MasterOrder goodies = new MasterOrder();

        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread",     5));
        goodies.addOrder(new CookieOrder("Macaroon",       2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

        System.out.println();
        System.out.println(goodies);
        
        goodies.removeVariety("Chocolate Chip");
        
        System.out.println();
        System.out.println(goodies);
        
        System.out.println();
        
    }

}