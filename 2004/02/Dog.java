/**
 * A dog as a Pet.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public class Dog extends Pet {

    /**
     * Constructs a new Dog, given its name.
     * 
     * @param name The dog's name.
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Makes the dog's sound.
     * 
     * @return The dog sound.
     */
    public String speak() {
        return "woof";
    }

}