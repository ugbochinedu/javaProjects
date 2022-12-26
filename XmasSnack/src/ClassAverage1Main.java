import xmasSnacktdd.ClassAverage;

public class ClassAverage1Main {
    public static void main(String[] args) {
        ClassAverage classAverage = new ClassAverage();
        classAverage.setStudentGrade();
        classAverage.getStudentsAverageScore();
        System.out.printf("The class average of ten student is: %d%n",classAverage.getStudentsAverageScore());
    }
}
