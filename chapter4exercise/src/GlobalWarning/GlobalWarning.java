package GlobalWarning;

import java.util.Scanner;

public class GlobalWarning {
    Scanner input = new Scanner(System.in);
    private int answer;
    private int correctAnswer = 0;
    private int wrongAnswer = 0;

    public void question1(){
        System.out.println("""
                A) Global warming also refers to as?
                                
                (1) Climate change
                                
                (2) Ecological change
                                
                (3) Atmosphere change
                                
                (4) None of the above
                """);

        answer = input.nextInt();

        if(answer == 1){
            correctAnswer++;
        }else {
            wrongAnswer++;
        }
    }

    public void question2(){
        System.out.println("""
                B) Global warming is observed century-scale rise in the _______ of the Earth’s climate system.
                (1) Maximum temperature
                                
                (2) Minimum temperature
                                
                (3) Average temperature
                                
                (4) Temperature
                """);

        answer = input.nextInt();

        if(answer == 3){
            correctAnswer++;
        }else {
            wrongAnswer++;
        }
    }

    public void question3(){
        System.out.println("""
                C) Which of the following is not a greenhouse gas?
                (1) Carbon di-oxide
                                
                (2) Methane
                                
                (3) Nitrous oxide
                                
                (4) Carbon monoxide
                """);

        answer = input.nextInt();

        if(answer == 4){
            correctAnswer++;
        }else {
            wrongAnswer++;
        }
    }

    public void question4(){
        System.out.println("""
                D) Which of the following is (are) the anticipated effect(s) of Global warming?
                (1) Rising sea levels
                                
                (2) Changing precipitation
                                
                (3) Expansion of deserts
                                
                (4) All of the above
                """);

        answer = input.nextInt();

        if(answer == 4){
            correctAnswer++;
        }else {
            wrongAnswer++;
        }
    }

    public void question5(){
        System.out.println("""
                E-The El-Nino Phenomenon occurs in?
                                
                (1) Atlantic Ocean
                                
                (2) Pacific Ocean
                                
                (3) Indian Ocean
                                
                (4) Arctic Ocean
                """);

        answer = input.nextInt();

        if(answer == 2){
            correctAnswer++;
        }else {
            wrongAnswer++;
        }
    }
    public void displayCorrectAnswers(){
        switch (correctAnswer) {
            case 5 -> System.out.println("Excellent");
            case 4 -> System.out.println("Very Good");
            default ->
                    System.out.println("You scored " + correctAnswer + " correct answers." + " Time to brush up on your knowledge of global warming.\n");
        }
    }
}
