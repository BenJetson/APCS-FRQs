public class ItemTester {

    public static void main(String[] args) {
        
        Vehicle car1 = new Vehicle(20000, 2500, 0.10);
        Vehicle car2 = new Vehicle(19785, 4723, 0.30);
        Vehicle car3 = new Vehicle(96412, 30212, 0.14);

        Vehicle[] vehicles = new Vehicle[] {car1, car2, car3};

        for (Vehicle v: vehicles) {
            System.out.println(v);
            
            v.changeMarkup(1000);
            
            System.out.println(v);
        }
    }

}