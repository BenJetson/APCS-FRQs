public class BatteryCharger {

    private int[] rateTable = new int[] 
        {50, 60, 160, 60, 80, 100, 100, 120, 150, 
            150, 150, 200, 40, 240, 220, 220, 200, 
            200, 180, 180, 140, 100, 80, 60};

    public BatteryCharger() {}
    
    public int getChargingCost(int startHour, int chargeTime) {
        int sum = 0;
        int finalHour = startHour + chargeTime;

        for (int hour=startHour; hour<finalHour; hour++) {
            sum += rateTable[hour % 24];
        }

        return sum;
    }

    public int getChargeStartTime(int chargeTime) {
        int lowestCost = getChargingCost(0, chargeTime);
        int lowestStart = 0;

        for (int i=0; i<24; i++) {
            int cost = getChargingCost(i, chargeTime);

            if (Math.max(cost, lowestCost) == cost) {
                lowestCost = cost;
                lowestStart = i;
            }
        }

        return lowestCost;
    }

}