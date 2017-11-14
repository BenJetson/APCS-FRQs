
import java.util.Arrays;

/**
 * Holds a sound and provides useful methods to manipulate it.
 *
 * @author Ben Godfrey
 * @version 13 NOV 2017
 */
public class Sound
{
    // instance variables - replace the example below with your own
    private int[] samples;

    /**
     * Makes a new Sound object, given the array of values.
     * 
     * @param samples Array of integers that represents the sound.
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }
    
    /**
     * Changes values in this sound that have amplitude greater than the limit.
     * 
     * @param limit The maximum absolute amplitude.
     * @return The number of values changed.
     */
    public int limitAmplitude(int limit) {
        int counter = 0;
        
        for (int i=0; i<samples.length; i++) {
            boolean isTooMuch = Math.abs(samples[i]) > limit;
            boolean isNegative = samples[i] < 0;
            
            if (isTooMuch) {
                if (isNegative) {
                    samples[i] = -1 * limit;
                } else {
                    samples[i] = limit;
                }
                counter++;
            }
        }
        return counter;
    }
    
    /**
     * Removes all silence from the beginning of this sound. 
     */
    public void trimSilenceFromBeginning() {
        int numZeroes = 0;
        
        for (int i: samples) {
            if (i != 0) {
                break;
            }
            numZeroes++;
        }
        
        int[] trimmedAudio = new int[samples.length - numZeroes];
        int counter = 0;
        
        for (int i=numZeroes; i<samples.length; i++) {
            trimmedAudio[counter] = samples[i];
            counter++;
        }
        
        samples = trimmedAudio;
    }
    
    
    /**
     * A representation of this object, as a String.
     * 
     * @return This object represented as a String. 
     */
    public String toString() {
        return String.format("Sound { samples: %s }", Arrays.toString(samples));
    }
}
