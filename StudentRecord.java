/** 
 * Student Record
 * Holds student grade data and provides useful methods for manipulating the data.
 * 
 * @author Ben Godfrey
 * @version 1.0
 */
public class StudentRecord {
    
    private int[] scores;
    
    /**
     * Basic constructor that imports grade data.
     * 
     * @param scores Array of student scores, as integers.
     */
    public StudentRecord(int[] scores) {
        this.scores = scores;
    }
    
    /**
     * Computes the average of the values in scores whose indices 
     * are between first and last, inclusive.
     * 
     * @param first The starting index for averaging. Included.
     * @param last The ending index for averaging. Included.
     * 
     * @return The average of the INCLUDED scores. 
     */
    private double average(int first, int last) {
        double numScores = last - first + 1;
        int sum = 0;
        
        for (int i=first; i<=last; i++) {
            sum += scores[i];
        }
        
        return sum / numScores;            
    }
    
    /**
     * Returns whether or not the student's scores have "improved"
     * over the period of scores. 
     * 
     * @return Improvement status (boolean). 
     */
    private boolean hasImproved() {
        for (int i=0; i<scores.length - 1; i++) {
            if (scores[i+1] < scores[i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Returns the final average of a student's scores, only returning the 
     * last half if the student's grades have improved. 
     * 
     * @return The final average of scores. 
     */
    public double finalAverage() {
        if (this.hasImproved()) { 
            return average(scores.length / 2, scores.length - 1);
        }
        return average(0, scores.length - 1);
    }
    
}