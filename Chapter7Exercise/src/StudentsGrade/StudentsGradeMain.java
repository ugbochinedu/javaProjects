package StudentsGrade;

import java.util.Scanner;
public class StudentsGradeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentsGrade studentsGrade = new StudentsGrade();
        System.out.println("How many subjects do you want to enter");
        int numberOfSubject = scanner.nextInt();
        int[] studentGrades = new int[numberOfSubject];
        studentsGrade.setStudentsGrade(studentGrades);
        studentsGrade.Average();
        studentsGrade.getMaximumGrade();
        studentsGrade.getMinimumGrade();
    }
}
