package StudentGrade;

import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int numberOfStudents = userInput.nextInt();
        System.out.println("How many subjects do they offer?");
        int numberOfSubjects = userInput.nextInt();
        int[][] studentDetails = new int[numberOfStudents][numberOfSubjects];
        StudentGrade studentGrade = new StudentGrade(studentDetails);
        studentGrade.setGrade(studentDetails);
        studentGrade.processGrade();
    }
}
