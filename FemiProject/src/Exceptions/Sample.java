package Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 4-digit number");
        String number = scanner.next();
        for (int index = 0; index < number.length(); index++) {
            try{
                validateNumber(number,index);
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
            }catch (Throwable exception){
                System.out.println(exception);
            }
        }
        System.out.println("You entered::" + number);
    }

    private static void validateNumber(String number, int index)throws IOException, Throwable {
        if (number.length() != 4) throw new Throwable();
        if (number.charAt(index) < 48 || number.charAt(index) > 57)
            throw new RuntimeException("Favour have sense");
    }

}
