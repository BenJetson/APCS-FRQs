import java.util.ArrayList;

public class StudentAnswerSheet {

    private String name;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = answers; 
    }

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
    
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("---\nScoresheet\nName: %s\nAnswers: %s\n---\n", 
                              name, answers.toString());
    }
}