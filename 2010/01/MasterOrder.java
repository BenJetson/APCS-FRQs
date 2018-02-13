import java.util.List;
import java.util.ArrayList;

public class MasterOrder {

    private List<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int sum = 0;

        for (CookieOrder c: orders) {
            sum += c.getNumBoxes();
        }

        return sum;
    }

    public int removeVariety(String cookieVar) {
        int counter = 0;

        for (int i=0; i<orders.size(); i++) {
            CookieOrder c = orders.get(i);
            String type = c.getVariety();

            if (type.equals(cookieVar)) {
                counter += c.getNumBoxes();
                orders.remove(i);
                i--;
            }
        }

        return counter;
    }

    public String toString() {
        String output = "---MASTER ORDER---\n";

        for (CookieOrder c: orders) {
            output += c + "\n";
        }

        return output + "---END MASTER ORDER---";
    }

}