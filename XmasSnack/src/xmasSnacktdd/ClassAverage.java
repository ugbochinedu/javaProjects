package xmasSnacktdd;

import java.util.Scanner;

public class ClassAverage {
    private int totalStudentsGrade;
    int studentGrade;
    int gradeCounter;
    Scanner scanner = new Scanner(System.in);
    public void setStudentGrade() {

        while (gradeCounter < 10){
            System.out.println("Enter Student Grade");
            studentGrade = scanner.nextInt();
            totalStudentsGrade += studentGrade;
            gradeCounter = gradeCounter + 1;
        }
    }
    public int getStudentGrade() {
        return totalStudentsGrade;
    }

    public int getStudentsAverageScore(){
        int studentsAverageScore;
        studentsAverageScore = totalStudentsGrade / gradeCounter;
        return studentsAverageScore;
    }
}
