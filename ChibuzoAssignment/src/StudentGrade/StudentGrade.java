package StudentGrade;

import java.util.Scanner;

public class StudentGrade {
    Scanner userInput = new Scanner(System.in);
    private int[][] studentDetails;
    int numberOfSubjects;
    public void setGrade(){
        System.out.println("How many students do you have?");
        int numberOfStudents = userInput.nextInt();

        System.out.println("How many subjects do they offer?");
        numberOfSubjects = userInput.nextInt();

        studentDetails = new int[numberOfStudents][numberOfSubjects];

        int grade;
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
                    System.out.println("invalid grade input");
                }
            }
        }
    }

    public void displayHeader(){

        int[] subjectHeader = new int[numberOfSubjects];

        System.out.printf("%s", "STUDENT ");

        for (int subjectCounter = 0; subjectCounter < subjectHeader.length; subjectCounter++) {
            System.out.printf("     %s%d","SUB", subjectCounter + 1);
        }

        System.out.printf("    %s    %s   %s%n", "TOTAl", "AVE", "POS");
    }
    public void processGrade(){

        displayHeader();

        int sum = 0;
        int average = 0;
        int scores;

        for (int student = 0; student < studentDetails.length ; student++) {

            System.out.printf("%s %d     ","student", student + 1);
            for (scores = 0; scores <studentDetails[student].length ; scores++) {
                System.out.printf("%d      ",studentDetails[student][scores]);
                sum += studentDetails[student][scores];
                average = sum / studentDetails[student].length;
            }

            System.out.printf("""
                      %d     %d
                    """, sum, average);
        }

//        for (int[] studentDetail : studentDetails) {
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

