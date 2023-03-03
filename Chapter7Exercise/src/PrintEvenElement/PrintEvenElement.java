package PrintEvenElement;

import java.security.SecureRandom;

public class PrintEvenElement {
//    int[] array = {0,3,5,7,4,2,5,6,8,8,2};
//
//    public void grade(){
//        System.out.println("Grade Distribution");
//        for (int counter = 0; counter < array.length; counter++) {
//           if (counter == 10){
//               System.out.printf("%7d ", 100);
//           }else{
//               System.out.printf("%d - %d ", counter * 10, (counter * 10 +9));
//           }
//
//            for (int star = 0; star < array[counter]; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    int[] array = {1,2,3,2,3,4,5,6,2,3,1};

    public void grade(){
//        System.out.println("Grade distribution");
//
//        for (int counter = 0; counter < array.length; counter++) {
//           if (counter == 10){
//               System.out.print("    100 ");
//           }else {
//               System.out.print((counter * 10) + " - " + (counter * 10 + 9) + (" "));
//           }
//
//            for (int star = 0; star < array[counter]; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int[] frequency = new int[7];
//
       SecureRandom secureRandom = new SecureRandom();
//
//        for (int frequencyCounter = 0; frequencyCounter < 30; frequencyCounter++) {
//            ++frequency[1 + secureRandom.nextInt(6)];
//        }
//
//        for (int face = 1; face <frequency.length ; face++) {
//            System.out.printf("""
//                    %d  %d
//                    """, face, frequency[face]);
//        }

        int[] scale = new int[6];

        for (int scaleCounter = 0; scaleCounter < 20; scaleCounter++) {
            ++scale[1 + secureRandom.nextInt(5)];
        }

        for (int scaleValue = 1; scaleValue < scale.length; scaleValue++) {
            System.out.println( scaleValue + " " + scale[scaleValue]);
        }





    }










}
