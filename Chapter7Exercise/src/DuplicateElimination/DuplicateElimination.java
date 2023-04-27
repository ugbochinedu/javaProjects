package DuplicateElimination;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = -1;
            System.out.println(array[counter]);
        }

//        System.out.println("Enter the number of elements you want to store");
//        int numberOfElements = input.nextInt();

        for (int counter = 0; counter < array.length; counter++) {
            System.out.println("Enter numbers from 10 to 100");
            array[counter] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
