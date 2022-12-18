package ClassAverage;

import java.util.Scanner;

public class ClassAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade or -1 to quit");
        int grade = input.nextInt();
        int total = 0;
        int gradeCounter = 0;
        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.println("Enter grade or -1 to quit");
            grade = input.nextInt();
        }

        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else {
            System.out.println("no grades were entered");
        }
    }
}
