import java.util.ArrayList;

public class KeyTesting {

    public static void main(String[] args) {

        ArrayList<String> key = new ArrayList<String>();

        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");

        ArrayList<String> s1 = new ArrayList<String>();

        s1.add("A");
        s1.add("B");
        s1.add("D");
        s1.add("E");
        s1.add("A");
        s1.add("C");
        s1.add("?");
        s1.add("B");
        s1.add("D");
        s1.add("C");

        StudentAnswerSheet student1 = new StudentAnswerSheet("Bob", s1);

        ArrayList<String> s2 = new ArrayList<String>();

        s2.add("A");
        s2.add("C");
        s2.add("D");
        s2.add("?");
        s2.add("A");
        s2.add("E");
        s2.add("C");
        s2.add("B");
        s2.add("?");
        s2.add("A");

        StudentAnswerSheet student2 = new StudentAnswerSheet("Emily", s2);

        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();

        sheets.add(student1);
        sheets.add(student2);

        TestResults test1 = new TestResults(sheets);

        System.out.printf("Answer Key: %s%n", key.toString());
        System.out.println(student1);
        System.out.println(student2);
        //                                          // manual scoring:
        System.out.println(student1.getScore(key)); // Bob:   5.25
        System.out.println(student2.getScore(key)); // Emily: 3.0

        System.out.println(test1.highestScoringStudent(key)); // Bob

    }

}