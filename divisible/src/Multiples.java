import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = input.nextInt();
        System.out.println("Enter second number");
        int secondNum = input.nextInt();
        int tripleFirst = firstNum * 3;
        int doubleSecond = secondNum * 2;
        if (doubleSecond % tripleFirst == 0) System.out.println(doubleSecond / tripleFirst);
        if (doubleSecond % tripleFirst != 0) System.out.printf("%d is not a multiple of %d%n", tripleFirst, doubleSecond);
    }
}
