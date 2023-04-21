package ArrayAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumbers {
//    ArrayList<Integer> returnedNumbers = new ArrayList<>();
//    public void collectNumbers(int[] arrayList) {
//        for (int i = 0; i < arrayList.length; i++) {
//            if(i % 2 != 0) returnedNumbers.add(arrayList[i]);
//        }
//        System.out.println(returnedNumbers);
//    }

//   public void number(){
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Enter a number");
//       int number = scanner.nextInt();
//       if (number < 0){
//           System.out.println("negative number");
//       } else {
//           System.out.println("positive number");
//       }
//   }
//
//    public static void ClassWork.main(String[] args) {
//        ArrayNumbers arrayNumber = new ArrayNumbers();
//        arrayNumber.number();
//    }
//    public int getArrayList() {
//        return returnedNumbers;
//    }

    ArrayList<Integer>evenNumbers = new ArrayList<>();
    public void listOfNumber(int[] numbers){
        for (int number : numbers) {
            if (number % 2 == 0) evenNumbers.add(number);
        }
    }

    public ArrayList<Integer> getEvenNumbers(){
        return evenNumbers;
    }
}
