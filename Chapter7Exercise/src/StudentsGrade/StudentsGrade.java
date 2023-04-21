package StudentsGrade;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsGrade {
    Scanner scanner = new Scanner(System.in);
    private int[] studentGrades;
    int studentGradeCounter;
    int grade;

    public void setStudentsGrade(int[] studentGrades) {
       this.studentGrades = studentGrades;
        for (studentGradeCounter = 0; studentGradeCounter < studentGrades.length; studentGradeCounter++) {
            System.out.printf("%s%d%n", "Enter the students grade for subject ", studentGradeCounter + 1);
            grade = scanner.nextInt();
            if (grade > 0 && grade <= 100){
                studentGrades[studentGradeCounter] =  grade;
            }else{
                System.out.println("invalid input");
            }
        }
    }

    public void Average(){
        int average = 0;
        int totalOfGrades =0;
        for (int grade:studentGrades) {
            totalOfGrades += grade;
            average = totalOfGrades / studentGrades.length;
        }
        System.out.println("The average of the scores is " + average);
    }

    public int getMaximumGrade(){
       int maximumGrade = studentGrades[0];
        for (int grade:studentGrades) {
            if(grade > maximumGrade)
                maximumGrade = grade;
        }
        System.out.println("The maximum score is " + maximumGrade);
        return maximumGrade;
    }

    public int getMinimumGrade(){
        int minimumGrade = studentGrades[0];
        for (int grade:studentGrades) {
            if(grade < minimumGrade){
                minimumGrade = grade;
            }
        }
        System.out.println("The minimum score is " + minimumGrade);
        return minimumGrade;
    }

    @Override
    public String toString() {
        return "StudentsGrade{" +
                "scanner=" + scanner +
                ", studentGrades=" + Arrays.toString(studentGrades) +
                ", studentGradeCounter=" + studentGradeCounter +
                ", grade=" + grade +
                '}';
    }
}
