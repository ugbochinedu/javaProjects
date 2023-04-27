package GradeBook;

public class GradeBookMain {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68,94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook gradeBook = new GradeBook("CSC 101", gradesArray);
        gradeBook.processGrades();
    }
}
