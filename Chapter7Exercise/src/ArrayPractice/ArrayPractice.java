package ArrayPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
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



//    public  void practice(){
//
//        String[] colors = new String[7];
//
//       try {
//           colors[0] = "Red";
//           colors[1] = "Orange";
//           colors[2] = "Yellow";
//           colors[3] = "Green";
//           colors[4] = "Blue";
//           colors[5] = "Indigo";
//           colors[6] = "Violet";
//           colors[7] = "White";
//       }catch (ArrayIndexOutOfBoundsException e){
//           e.printStackTrace();
//           System.out.println(e.getMessage());
//       }
//
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }
//
//        System.out.println();
//
//        for (String color: colors) {
//            System.out.println(color);
//        }

    public void InitArray(){
//        int[] array = new int[10];
//
//        System.out.printf("""
//                %s%8s
//                """, "index", "value");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("""
//                    %d%8d
//                    """,i, array[i]);
//        }

//        int[] array = {1,2,3,4,5,6,7,8,9};
//
//        System.out.printf("""
//                %s%10s
//                """, "index", "value");
//
//        for (int arrayCounter = 0; arrayCounter < array.length; arrayCounter++) {
//            System.out.printf("""
//                    %d%10d
//                    """, arrayCounter, array[arrayCounter]);
//        }

          //int[] array = new int[10];

        int[] array = {3,4,5,45,3,5,6,7,4,};
        int total = 0;

        System.out.printf("""
                %s%10s
                """, "index", "value");

        for (int arrayCounter = 0; arrayCounter < array.length; arrayCounter++) {
            total += array[arrayCounter];
            System.out.printf("""
                    %d%10d
                    """, arrayCounter, total);
        }

        ArrayList<String> list;

        ArrayList<String> names = new ArrayList<>();
    }
}
