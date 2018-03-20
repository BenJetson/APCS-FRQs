/** 
 * Like a Dog, just louder.
 * 
 * @author Ben Godfrey
 * @version 20 MAR 2018
 */
public class LoudDog extends Dog {

    /** 
     * Constructs a new Loud Dog given its name.
     * 
     * @param name The loud dog's name.
     */
    public LoudDog(String name) {
        super(name);
    }

    /**
     * Returns the sound of the loud dog.
     * 
     * @return The loud dog sound.
     */
    public String speak() {
        return super.speak() + super.speak();
    }

}