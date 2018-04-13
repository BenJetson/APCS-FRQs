public class CashRegister {
    
    public static void main(String[] args) {
        Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
        Sandwich clubSandwich = new Sandwich("Club Sandwich", 2.75);
    
        Salad spinachSalad = new Salad("Spinach Salad", 1.25);
        Salad coleslaw = new Salad("Coleslaw", 1.25);
    
        Drink orangeSoda = new Drink("Orange Soda", 1.25);
        Drink cappuccino = new Drink("Cappuccino", 3.50);
    
        Trio csoTrio = new Trio(cheeseburger, spinachSalad, orangeSoda);
        Trio cccTrio = new Trio(clubSandwich, coleslaw, cappuccino);
    
        System.out.println(csoTrio);
        System.out.println(cccTrio);
    }

}