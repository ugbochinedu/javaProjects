package StudentGrade;

import java.util.Scanner;

public class StudentGrade {
    Scanner userInput = new Scanner(System.in);
    private int[][] studentDetails;
    int numberOfSubjects;
    int grade;

    public StudentGrade(int[][] studentDetails, int numberOfSubjects){
        this.studentDetails = studentDetails;
        this.numberOfSubjects = numberOfSubjects;
    }
    public void setGrade(int[][] studentDetails){
        this.studentDetails = studentDetails;

        int studentDetailsCounter;
        int studentGradeCounter;

        for (studentDetailsCounter = 0; studentDetailsCounter < studentDetails.length; studentDetailsCounter++) {
            for (studentGradeCounter = 0; studentGradeCounter < studentDetails[studentDetailsCounter].length; studentGradeCounter++) {
                System.out.printf("""
                        %s %d %s %d %s
                        """, "Enter student", studentDetailsCounter + 1, "subject", studentGradeCounter + 1,"grade");
                grade = userInput.nextInt();

                if (grade > 0 && grade <= 100) {
                    studentDetails[studentDetailsCounter][studentGradeCounter] = grade;
                }else{
                    //throw new ArithmeticException("invalid grade input");
                    System.out.println("invalid grade input");
                }
            }
        }
    }

    public void displayHeader(){

        int[] subjectHeader = new int[numberOfSubjects];

        System.out.printf("%s", "STUDENT ");

        for (int subjectCounter = 0; subjectCounter < subjectHeader.length; subjectCounter++) {
            System.out.printf("%9s%d","SUB", subjectCounter + 1);
        }

        System.out.printf("%9s%7s%7s%n", "TOTAl", "AVE", "POS");
    }
    public void processGrade() {

        displayHeader();

        int average;
        int scores;
        int sum = 0;

        int student;
        for (student = 0; student < studentDetails.length; student++) {

            System.out.printf("%s %d" , "student" , student + 1);
            for (scores = 0; scores < studentDetails[student].length; scores++) {
                System.out.printf("%9d" , studentDetails[student][scores]);
            }
            sum += grade;
            average = sum / studentDetails[student].length;
            System.out.printf("""
                %10d%7d
                """, sum, average);
        }


//        for (int[] studentDetail : studentDetails) {
//            int sum = 0;
//            int average = 0;
//            for (int scores : studentDetail) {
//                System.out.print(scores);
//                sum += scores;
//                average = sum / studentDetail.length;
//            }
//            System.out.print("student " + studentDetailsCounter + 1);
//            System.out.print("the sum is " + sum);
//            System.out.println("the average is " + average);
//        }
    }
}

