import java.util.ArrayList;

/**
 * Class that provides useful methods for grading and 
 * manipulating student MC test answers.
 * 
 * @author Ben Godfrey
 * @version 08 FEB 2018
 */
public class StudentAnswerSheet {

    /** The student's name. */
    private String name;
    /** The student's answers. */
    private ArrayList<String> answers;

    /** 
     * Constructs a new StudentAnswerSheet given required info.
     * 
     * @param name The student's name.
     * @param answers The student's answers. 
     */
    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers; 
    }

    /**
     * Scores the answer sheet given the answer key. Each
     *   correct answer gets one point, each incorrect answer
     *   takes away 1/4 of a point, and blank answers are ingored.
     * 
     * @param key The answer key for the test.
     * 
     * @return The student's score.
     */
    public double getScore(ArrayList<String> key) {
        int numCorrect = 0;
        int numWrong   = 0;

        for (int i=0; i<key.size(); i++) {
            String studentAnswer = answers.get(i);
            String keyAnswer     = key.get(i);

            if (!studentAnswer.equals("?")) {
                if (studentAnswer.equals(keyAnswer)) numCorrect++;
                else numWrong++;
            } 
        }

        return numCorrect - (0.25 * numWrong);
    }

    /**
     * Gets the student's name. 
     * 
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a String representation of this object.
     * 
     * @return A string representation of this object.
     */
    public String toString() {
        return String.format("---\nScoresheet\nName: %s\nAnswers: %s\n---\n", 
                              name, answers.toString());
    }
}