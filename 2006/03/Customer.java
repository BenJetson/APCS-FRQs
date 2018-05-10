public class Customer {

    private String name;
    private int ID;

    public Customer(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int GetID() {
        return ID;
    }

    public int compareTo(Customer other) {
        boolean namesEqual = this.name.equals(other.name);
        boolean IDsEqual = this.ID == other.ID;

        if (namesEqual && IDsEqual) return 0;
        else if (namesEqual) return this.ID - other.ID;
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return String.format("{name: \"%s\", id: %d }\n", name, ID);
    }

}