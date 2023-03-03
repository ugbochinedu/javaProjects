import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Integer.sum;
import static sun.swing.MenuItemLayoutHelper.max;

public class LargestNumber {
    public static void main(String[] args) {
         // Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < 10; counter++) {
            SecureRandom secureRandom = new SecureRandom();
            int numbers= secureRandom.nextInt(10);
            System.out.printf("%4d", numbers);
        }
//        SecureRandom  randomNumber = new SecureRandom();
//
//        int[][] b = {{0,2},{2,3}}; //example of multiple array in a single array .....
//
//        int[] array = {46,83,74,76,84,63,74};
//        int total = 0;
//
//        for (int number: array){
//             total = total + number;
//        }
//        System.out.println(total);

//        IntStream.rangeClosed(1, 10)
//                        .sum();

//        int[] array1 = new int[5];
//
//        for (int value: array1) {
//            System.out.println("enter numbers of your choice");
//            array1[value]= input.nextInt();
//        }
//
//        Arrays.sort(array1);
//        int max = array1[array1.length - 1];
//        System.out.println(max);



//        int[] array = new int[10];
//        for (int counter = 0; counter < array.length; counter++) {
//            System.out.printf("%d%5s%n",counter, array[counter]);
//        }
//        final int ARRAY_LENGTH = 10;
//        int[] array = new int[ARRAY_LENGTH];
//        int number = 45;
//
//        for ( int counter = 0; counter < array.length; counter++) {
//            array[counter] = counter * 2 + number;
//            System.out.printf("%d%5d%n", counter, array[counter]);
//        }
//
//        int[] array1 = {45,82,82,64,56,75,45};
//        int total = 0;
//
//        for (int counter = 0; counter < array1.length; counter++) {
//            total += array1[counter];
//            System.out.println(total);
//        }



//        for (int counter = 1; counter <= 20; counter++) {
//            int face = 1 + randomNumber.nextInt(6);
//            System.out.printf("%4d",face);
//            if (counter % 5 == 0){
//            System.out.println(" ");
//            }
//        }

//
//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter numbers");
//            array[i] = input.nextInt();
//        }
//
//        Arrays.sort(array);
//
//        int max = array[array.length - 1];
//        int counter;
//
//      /*  int max = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] > max){
//                max = array[i];
//                counter = counter + 1;
//            }
//        } */
//
//        System.out.println("Max number is " + max);
//        //System.out.println("Number of digits input is " + counter);
//        Scanner data = new Scanner(System.in);
//        int[] array1= new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter series of numbers");
//            array1[i] = data.nextInt();
//        }
//
//        Arrays.sort(array1);
//
//        int min = array1[0];
//
//        System.out.println("The minimum of all the numbers is: " + min);
//
//
//        Scanner userInput = new Scanner(System.in);
//        int[] array2 = new int[5];
//
//        for (int i = 0; i < array2.length ; i++) {
//            System.out.println("enter numbers");
//            array2[i] = userInput.nextInt();
//        }
//
//        Arrays.sort(array2);
//
//        int secondMaxi = array2[array2.length - 2];
//        System.out.println(secondMaxi);

//
//        int[] array4 = new int[4];
//
//        for (int i = 0; i < array4.length; i++) {
//            System.out.println("Enter numbers");
//            array4[i] = input.nextInt();
//        }
//
//        Arrays.sort(array4);
//
//        int maxi = array4[array4.length-1];
//
//        int total = 0;
//        for (int number = 3; number <=21 ; number++) {
//            total +=number;
//        }
//
//        System.out.printf("sum is %d%n", total);
//        System.out.printf("%s%50s%n", "year", "amount of deposite");
//
//        int counter = 1;
//
//        do{
//            System.out.println("i am");
//            counter++;
//        }  while (counter <5);

//
//            int test = 3;
//
//            switch (test){
//                case 1:
//                    System.out.println("in");
//                    break;
//                case 2:
//                    System.out.println("out");
//                    break;
//                case 3:
//                    System.out.println("come");
//                    break;
//                default:
//                    System.out.println("yes");
//            }
//            return math.max(x, math.max(y, z));
//
//
    }
}
