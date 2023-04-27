import java.util.Scanner;

public class Grade {
    private int total = 0;
    int gradeCounter = 0;
    int grade;
    Scanner userInput = new Scanner(System.in);

    public void studentGrade(){

        System.out.println("Enter grade or -1 to exit");
        grade = userInput.nextInt();

        while (grade != -1) {
        total += grade;
        gradeCounter++;
        System.out.println("Enter grade or -1 to exit");
        grade = userInput.nextInt();
        }
    }

    public void average(){
        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.println(average);
        } else {
            System.out.println("No grades were entered");
        }
    }
}
