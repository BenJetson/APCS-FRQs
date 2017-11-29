public class Testing {
    
    public static void main(String[] args) {
        
        StudentRecord student1 = new StudentRecord(new int[] {50, 50, 20, 80, 53});
        StudentRecord student2 = new StudentRecord(new int[] {20, 50, 50, 53, 80});
        StudentRecord student3 = new StudentRecord(new int[] {20, 50, 50, 80});
        
        System.out.printf("Student 1: %f%n", student1.finalAverage());
        System.out.printf("Student 2: %f%n", student2.finalAverage());
        System.out.printf("Student 3: %f%n", student3.finalAverage());
        
    }
}