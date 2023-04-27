package ReadingPack;

import java.security.SecureRandom;
import java.util.Scanner;

public class Chapter6 {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(900.0));
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter values");
//        int value1 = input.nextInt();
//        System.out.println("enter values");
//        int value2 = input.nextInt();
//        System.out.println("enter values");
//        int value3 = input.nextInt();
//        int result = Math.max(value1,Math.max(value3, value2));
//        System.out.println(result);

//        int[] array = new int[10];
//
//        for (int counter = 0; counter < array.length; counter++) {
//            System.out.println(array[counter]);
//        }
//
//        int[] array1 = {13, 45, 56, 23, 67};
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }

//        int[] array = new int[10];
//        for (int counter = 0; counter < array.length; counter++) {
//            array[counter] = 2 + 2 * counter;
//        }
//        for (int counter = 0; counter < array.length; counter++) {
//            System.out.printf("%d%6d%n", counter, array[counter]);
//        }

//        int[] gradeArray = {56, 78, 67, 94, 78, 58};
//        int sum = 0;
//        for (int counter = 0; counter < gradeArray.length; counter++) {
//            sum = sum + gradeArray[counter];
//        }
//        System.out.printf("The total sum of the array is %d%n", sum);

//        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
//        for (int counter = 0; counter < array.length; counter++) {
//            for (int star = 0; star < array[counter]; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        SecureRandom secureRandom = new SecureRandom();
//        int[] frequency = new int[7];
//
//        for (int roll = 0; roll < 100; roll++) {
//            ++frequency[1 + secureRandom.nextInt(6)];
//        }
//
//        for (int face = 1; face < frequency.length; face++) {
//            System.out.printf("%d%9d  ", face, frequency[face]);
//
//            for (int star = 0; star <frequency[face]; star++) {
//                System.out.print(" *");
//            }
//            System.out.println();

//
//            int[] response = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
//
//            int[] frequency = new int[6];
//
//            for (int answer = 0; answer < response.length; answer++) {
//             try {
//                 ++frequency[response[answer]];
//             }
//             catch (ArrayIndexOutOfBoundsException e){
//                 System.out.println(e);
//                 System.out.printf("    responses[%d]  =  %d%n%n", answer, response[answer]);
//             }
//            }
//
//        System.out.printf("%s%10s%n", "Rating", "Frequency");
//
//        for (int rating = 1; rating < frequency.length; rating++) {
//            System.out.printf("%d%10d%n", rating, frequency[rating]);
//        }

//        int[] array3 = {87, 68, 94, 100, 83, 78, 85, 91, 76, 97};
//        int total = 0;
//
//        for (int number: array3) {
//            total += number;
//        }
//        System.out.printf("%d", total);

//        int[] array = {1, 2, 3, 4, 5};
//
//        for (int number: array) {
//            System.out.println(number);
//            System.out.println();
//        }
//        modifyArray(array);
//
//        modifyElement(array[4]);
//    }
//
//    public static void modifyArray(int[] array2) {
//        for (int counter = 0; counter < array2.length; counter++) {
//            array2[counter] *= 2;
//            System.out.println(array2[counter]);
//        }
//    }
//
//    public static void modifyElement(int element){
//        element *= 2;
//        System.out.printf("%d%n", element);
        int[][] b = {{1,2,3,4},{4,6,7}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%d", b[i][j]);
            }
            System.out.println();
        }


        // powerBike
//        int[] gear = new int[6];
//
//        int[] speed = {0, 20, 30, 40, 50, 60};
//
//        for (int count = 0; count < gear.length; count++) {
//            for (int i = 0; i < speed[count]; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
   }
}
