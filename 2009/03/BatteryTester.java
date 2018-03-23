public class BatteryTester {

    public static void main(String[] args) {
        
        int[] rateTable = new int[] 
            {50, 60, 160, 60, 80, 100, 100, 120, 150, 
                150, 150, 200, 40, 240, 220, 220, 200, 
                200, 180, 180, 140, 100, 80, 60};

        BatteryCharger batt = new BatteryCharger(rateTable);

        System.out.println(batt.getChargingCost(12, 1));
        System.out.println(batt.getChargingCost(0, 2));
        System.out.println(batt.getChargingCost(22, 7));
        System.out.println(batt.getChargingCost(22, 30));

        System.out.println(batt.getChargeStartTime(1));
        System.out.println(batt.getChargeStartTime(2));
        System.out.println(batt.getChargeStartTime(7));
        System.out.println(batt.getChargeStartTime(30));

    }

}