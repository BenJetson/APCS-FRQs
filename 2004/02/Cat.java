/**
 * A cat as a Pet.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public class Cat extends Pet {

    /**
     * Constructs a new Cat, given its name.
     * 
     * @param name The cat's name.
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Makes the cat's sound.
     * 
     * @return The cat sound.
     */
    public String speak() {
        return "meow";
    }

}