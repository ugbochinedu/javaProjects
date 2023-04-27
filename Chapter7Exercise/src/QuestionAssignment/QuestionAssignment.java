package QuestionAssignment;

import java.util.Random;
import java.util.Scanner;

public class QuestionAssignment {
    Random random = new Random(5);
    Scanner userInput = new Scanner(System.in);
    int userDecision;
    String selectedAnswer;
    int correctAnswer;

    public void question(){
        System.out.println("Will you like to play? Yes, press 1 or 0 to exit");

        userDecision = userInput.nextInt();

        while (userDecision == 1){
            int randomQuestion = random.nextInt();

            if (randomQuestion == 1){
                System.out.println("Question 1: What is the difference between of 5 and 3? a)2 (b)20 (c)15");
                selectedAnswer = userInput.next();

                if(selectedAnswer.equals("a")){
                    System.out.println("correct");
                    correctAnswer ++;
                }else {
                    System.out.println("wrong");
                }
                break;
            }

            if (randomQuestion == 2){
                System.out.println("Question 2: What is the sum of 3 and 5? a)23 (b)8 (c)15");
                selectedAnswer = userInput.next();

                if(selectedAnswer.equals("b")){
                    System.out.println("correct");
                    correctAnswer ++;
                }else {
                    System.out.println("wrong");
                }
                break;
            }

            if (randomQuestion == 3){
                System.out.println("Question 3: What is the product of 3 and 5? a)23 (b)20 (c)15");
                selectedAnswer = userInput.next();

                if(selectedAnswer.equals("c")){
                    System.out.println("correct");
                    correctAnswer ++;
                }else {
                    System.out.println("wrong");
                }
                break;
            }

            if (randomQuestion == 4){
                System.out.println("Question 4: What is the product of 3 and 5? a)23 (b)20 (c)15");
                selectedAnswer = userInput.next();

                if(selectedAnswer.equals("c")){
                    System.out.println("correct");
                    correctAnswer ++;
                }else {
                    System.out.println("wrong");
                }
                break;
            }

            if (randomQuestion == 5){
                System.out.println("Question 5: Who is the president of Nigeria? a)Tinubu (b) Buhari (c) Chinedu");
                selectedAnswer = userInput.next();

                if(selectedAnswer.equals("b")){
                    System.out.println("correct");
                    correctAnswer ++;
                }else {
                    System.out.println("wrong");
                }
                break;
            }
            System.out.println("Do you wish to continue? yes, press 1 or 0 to exit");

            userDecision = userInput.nextInt();
        }
        System.out.println("You scored " + correctAnswer);
    }
}
