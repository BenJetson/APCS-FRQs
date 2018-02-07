import java.util.ArrayList;

public class TestResults {

    private ArrayList<StudentAnswerSheet> sheets;

    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        this.sheets = sheets;
    }

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