package VariableLength;

import java.util.Scanner;

public class VariableLength {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of figures to input");
//        int arrayLength = input.nextInt();
//        int[] array = new int[arrayLength];
//
//        for (int counter = 0; counter < array.length; counter++) {
//            System.out.println("Enter a number");
//            array[counter] = input.nextInt();
//        }
//
////         The both for statements are the same
////        for (int counter = 0; counter < array.length; counter++) {
////            System.out.println(array[counter]);
////        }
//
//        for (int j : array) {
//            System.out.println(j);
//        }
//
//        average(array);

//        VariableLength.average();

        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        average(d1,d2);
        average(d1,d2,d3);
    }

    private static double average;

    public static double average(double...array){
        double sum = 0;
        double average = 0;

        for (double value : array) {
            sum = sum + value;
            average = sum / array.length;
        }
        System.out.printf("The sum of the numbers is: %2f%nThe average of the numbers is: %2f%n",
                sum, average);
        return average;
    }
}
