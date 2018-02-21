public class BatteryCharger {

    private int[] rateTable = new int[] 
        {50, 60, 160, 60, 90, 100, 100, 120, 150, 
            150, 150, 200, 40, 240, 220, 220, 200, 
            200, 180, 180, 140, 100, 80, 60};

    public BatteryCharger() {}
    
    public int getChargingCost(int startHour, int chargeTime) {
        int sum = 0;
        int finalHour = (startHour + chargeTime - 1) % 23;
        boolean dayBreak = startHour < 24 && finalHour < 0;
        boolean done = false;
        int hour = startHour;

        while (!done) {
            if ((dayBreak && hour < 24) || (!dayBreak && hour <= finalHour)) {
                sum += rateTable[hour];
                hour++; 
                if (hour == 24) {
                    hour = 0;
                    dayBreak = false;
                }
            } else done = true;
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