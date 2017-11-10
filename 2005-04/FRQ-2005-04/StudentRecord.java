public class StudentRecord {
    
    private int[] scores;
    
    public StudentRecord(int[] scores) {
        this.scores = scores;
    }
    
    private double average(int first, int last) {
        double numScores = last - first + 1;
        int sum = 0;
        
        for (int i=first; i<=last; i++) {
            sum += scores[i];
        }
        
        return sum / numScores;            
    }
    
    private boolean hasImproved() {
        for (int i=0; i<scores.length - 1; i++) {
            if (scores[i+1] < scores[i]) {
                return false;
            }
        }
        return true;
    }
    
    public double finalAverage() {
        if (this.hasImproved()) { 
            return average(scores.length / 2, scores.length - 1);
        }
        return average(0, scores.length - 1);
    }
}