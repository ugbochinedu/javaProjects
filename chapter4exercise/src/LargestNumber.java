import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter numbers");
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        int max = array[array.length - 1];
        int counter;

      /*  int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                counter = counter + 1;
            }
        } */

        System.out.println("Max number is " + max);
        //System.out.println("Number of digits input is " + counter);
        Scanner data = new Scanner(System.in);
        int[] array1= new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter series of numbers");
            array1[i] = data.nextInt();
        }

        Arrays.sort(array1);

        int min = array1[0];

        System.out.println("The minimum of all the numbers is: " + min);


        Scanner userInput = new Scanner(System.in);
        int[] array2 = new int[5];

        for (int i = 0; i < array2.length ; i++) {
            System.out.println("enter numbers");
            array2[i] = userInput.nextInt();
        }

        Arrays.sort(array2);

        int secondMaxi = array2[array2.length - 2];
        System.out.println(secondMaxi);




    }
}
