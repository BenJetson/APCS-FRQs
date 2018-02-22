/**
 * Provides useful methods for determining cost
 * and timing of battery charges.
 * 
 * @author Ben Godfrey
 * @version 21 FEB 2018
 */
public class BatteryCharger {

    /** Holds the charging rates by hour, indexed 0-23, repsectively. */
    private int[] rateTable = new int[] 
        {50, 60, 160, 60, 80, 100, 100, 120, 150, 
            150, 150, 200, 40, 240, 220, 220, 200, 
            200, 180, 180, 140, 100, 80, 60};

    /** Constructs a new BatteryCharger. */
    public BatteryCharger() {}
    
    /**
     * Gets the cost of charging the battery for a certain
     * number of hours starting at a certain time.
     * 
     * @param startHour The hour to start the charge.
     * @param chargeTime The amount of time ot charge the battery..
     * 
     * @return The cost of charging the battery for the given parameters.
     */
    public int getChargingCost(int startHour, int chargeTime) {
        int sum = 0;
        int finalHour = startHour + chargeTime;

        for (int hour=startHour; hour<finalHour; hour++) {
            sum += rateTable[hour % 24];
        }

        return sum;
    }

    /**
     * Finds the optimal time to charge the battery 
     * (lowest cost), given the number of hours that
     * the battery needs to charge.
     * 
     * @param chargeTime The amount of time to charge the battery.
     * 
     * @return The optimal start hour for the charge.
     */
    public int getChargeStartTime(int chargeTime) {
        int lowestCost = getChargingCost(0, chargeTime);
        int lowestStart = 0;

        for (int i=0; i<24; i++) {
            int cost = getChargingCost(i, chargeTime);

            if (Math.min(cost, lowestCost) == cost) {
                lowestCost = cost;
                lowestStart = i;
            }
        }

        return lowestCost;
    }

}