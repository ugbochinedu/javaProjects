package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    //private final int[] numbers = new int[5];
    //int sum = 0;

//    public void setNumbers(){
//        int[] numbers = {2,4,5,7,9};
//
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 14;
//        numbers[3] = 2;
//        numbers[4] = 4;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        int average = sum / numbers.length;
//        System.out.println(sum);
//        System.out.println(average);
//
//        for (int number: numbers) {
//            sum += number;
//        }
//        System.out.println(sum);
//    }



    public  void practice(){

        String[] colors = new String[7];

       try {
           colors[0] = "Red";
           colors[1] = "Orange";
           colors[2] = "Yellow";
           colors[3] = "Green";
           colors[4] = "Blue";
           colors[5] = "Indigo";
           colors[6] = "Violet";
           colors[7] = "White";
       }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
           System.out.println(e.getMessage());
       }


        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();

        for (String color: colors) {
            System.out.println(color);
        }
    }
}
