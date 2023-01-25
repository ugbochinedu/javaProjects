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
        System.out.printf("%s%d%n", "The maximum grade is ",  studentsGrade.getMaximumGrade(studentGrades));
        System.out.printf("%s%d%n", "The minimum grade is ",  studentsGrade.getMinimumGrade(studentGrades));
    }
}
