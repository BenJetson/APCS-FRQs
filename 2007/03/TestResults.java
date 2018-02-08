import java.util.ArrayList;

/**
 * Provides useful methods for manipulating a group
 *   of StudentAnswerSheets for a particular test.
 * 
 * @author Ben Godfrey 
 * @version 08 FEB 2018
 */
public class TestResults {

    /** The list of sheets. */
    private ArrayList<StudentAnswerSheet> sheets;

    /** 
     * Creates a new TestResults object given the answer sheets.
     * 
     * @param sheets The answer sheets from the test.
     */
    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        this.sheets = sheets;
    }

    /**
     * Finds the highest scoring student out of a group of
     *   answer sheets. In the event of a tie, only the name
     *   of the first sheet in the stack with the high score 
     *   is returned.
     * 
     * @param key The answer key for the test.
     * @return The name of the highest scoring student.
     */
    public String highestScoringStudent(ArrayList<String> key) {
        double highScore = key.size() * -1;
        String name = "";

        for (StudentAnswerSheet s: sheets) {
            double score = s.getScore(key);

            if (score > highScore) {
                highScore = score;
                name = s.getName();
            }
        }

        return name;
    }
}