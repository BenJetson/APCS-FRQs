/**
 * An abstract class for representing a pet.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public abstract class Pet {

    /** The name of the pet. */
    private String myName;

    /**
     * Constructs a new Pet given its name.
     * 
     * @param name The pet's name.
     */
    public Pet(String name) {
        myName = name;
    }

    /** 
     * Gets the name of the pet.
     * 
     * @return The name of the Pet.
     */
    public String getName() {
        return myName;
    }

    /** Placeholder for a function that returns the Pet's sound. */
    public abstract String speak();
    
}