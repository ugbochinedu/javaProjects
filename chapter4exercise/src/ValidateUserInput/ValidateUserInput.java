package ValidateUserInput;

import java.util.Scanner;

public class ValidateUserInput {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = 0;

        while(input != -1){
            System.out.println("Enter 1 0r 2");
            input = userInput.nextInt();
            if(input == 1 || input == 2) {
                System.out.println("correct input");
                break;
            }
        }
    }
}
