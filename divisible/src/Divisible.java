import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number % 3 == 0) System.out.println("Number is divisible by 3");
        if (number % 3 != 0) System.out.println("Number is not divisible by 3");
    }
}
