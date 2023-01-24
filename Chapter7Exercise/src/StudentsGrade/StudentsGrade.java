package StudentsGrade;

import java.util.Scanner;

public class StudentsGrade {
    Scanner scanner = new Scanner(System.in);

    private int[] studentGrades;
    int studentsGradeCounter;
    int grade;

    public void setStudentsGrade(int[] studentGrades) {
       this.studentGrades = studentGrades;
        for (studentsGradeCounter = 0; studentsGradeCounter < studentGrades.length; studentsGradeCounter++) {
            System.out.printf("%s%d%n", "Enter the students grade for subject ", studentsGradeCounter + 1);
            grade = scanner.nextInt();
            if (grade > 0 && grade <= 100){
                studentGrades[studentsGradeCounter] =  grade;
            }else{
                System.out.println("invalid input");
            }
            System.out.println(studentGrades[studentsGradeCounter]);
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

    public int getMaximumGrade(int[] studentGrades){
       int maximumGrade = studentGrades[0];
        for (int grade:studentGrades) {
            if(grade > maximumGrade)
                maximumGrade = grade;
        }
        return maximumGrade;
    }

    public int getMinimumGrade(int[] studentGrades){
        int minimumGrade = studentGrades[0];
        for (int grade:studentGrades) {
            if(grade < minimumGrade){
                minimumGrade = grade;
            }
        }
        return minimumGrade;
    }
}
