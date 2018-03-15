import java.util.ArrayList;

public class Kennel {
    
    private ArrayList<Pet> petList;

    public Kennel(ArrayList<Pet> pets) {
        petList = pets;
    }

    public void allSpeak() {
        for (Pet p: petList) {
            System.out.println(p.speak());
        }
    }

}