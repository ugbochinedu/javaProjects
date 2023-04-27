import java.util.Arrays;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int smallest = 0;
//        int number = 0;
//        int largest = 0;
//        String prompt = "Enter a number > ";
//
//        System.out.print(prompt);
//        smallest = scan.nextInt();
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.print(prompt);
//            number = scan.nextInt();
//
//            if (number < smallest) {
//                smallest = number;
//            }
//
//            if (number > largest){
//                largest = number;
//            }
//
//        }
//        System.out.println("The minimum is " + smallest);
//        System.out.println("The maximum is " + largest);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);

        int max = array[array.length - 1];
        int min = array[0];
        System.out.println(max);
        System.out.println(min);
    }
}
