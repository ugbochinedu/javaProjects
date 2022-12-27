package xmasSnacktdd;

import java.util.Scanner;

public class ClassExamAnalysis {
    int passes = 0;
    int failures = 0;
    int studentCounter = 1;
    int result;
    Scanner input = new Scanner(System.in);

    public void setStudentResult(){
        while (studentCounter <= 10){
            System.out.println("Enter 1 for pass or enter 2 for fail");
            result = input.nextInt();
            if(result == 1){
                passes = passes + 1;
            } else if (result == 2){
                failures = failures + 1;
            } else {
                System.out.println("Enter 1 or 2");
                continue;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.printf("The number of passes is %d and the number of failure(s) is %d%n", passes, failures);

        if(passes > 8) System.out.println("Bonus to instructor");
    }
}
