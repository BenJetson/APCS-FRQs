import java.util.ArrayList;

/**
 * A kennel holds multiple Pet objects.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public class Kennel {
    
    /** The list that holds the pets. */
    private ArrayList<Pet> petList;

    /** 
     * Creates a new Kennel given a list of pets.
     * 
     * @param pets The list of pets.
     */
    public Kennel(ArrayList<Pet> pets) {
        petList = pets;
    }

    /** Makes all pets in the Kennel print their sound. */
    public void allSpeak() {
        for (Pet p: petList) {
            System.out.println(p.speak());
        }
    }

}