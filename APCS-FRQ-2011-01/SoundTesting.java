
/**
 * Dummy class to test the Sound class.
 *
 * @author Ben Godfrey
 * @version 13 NOV 2017
 */
public class SoundTesting
{
    public static void main(String[] args) {
        Sound sound1 = new Sound(new int[] {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223 });
        Sound sound2 = new Sound(new int[] {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0 });
        
        System.out.println("Sound 1:");
        System.out.println(sound1);
        sound1.limitAmplitude(2000);
        System.out.println(sound1);
        
        System.out.println();
        
        System.out.println("Sound 2:");
        System.out.println(sound2);
        sound2.trimSilenceFromBeginning(); 
        System.out.println(sound2);
    }
}