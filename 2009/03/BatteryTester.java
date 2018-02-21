public class BatteryTester {

    public static void main(String[] args) {
        BatteryCharger batt = new BatteryCharger();

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