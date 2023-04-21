package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassWork {

    int[] listOfNumbers;
    private int max;
    //private int min;

    public void multiplyByTwo(int[] listOfNumbers) {
        this.listOfNumbers = listOfNumbers;

        for (int i = 0; i < listOfNumbers.length; i++) {
            int newNumber = listOfNumbers[i] * 2;
            listOfNumbers[i] = newNumber;
        }
    }

    public int[] getListOfNumbers() {
        return listOfNumbers;
    }

    public void maximumInArray(int[] numbers) {
        Arrays.sort(numbers);
        max = numbers[numbers.length - 1];
    }

    public int getMaximumNumber() {
        return max;
    }

    public int minimumInArray(int[] arrayNumbers) {
       int min = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            if(arrayNumbers[i] < min) min = arrayNumbers[i];
        }
        return min;
    }



    public int addNumbersInsideArray(int[] array) {

        List<Integer> newList = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < array.length; i++) {

            int j;
            for (j = 0; i < array.length; i++) {
                total += array[j];
            }
            int secondSum = total - array[i];
            newList.add(secondSum);
        }
        return total;
    }

    public void reverseArray(){
       char[] name = {'s','e','m','i','c','o','l','o','n'};
        for (int i = name.length - 1; i >=0 ; i--) {
            char[] new = name[i];
            System.out.print(name[i]);
        }
//        for (int i = 0; i <name.length; i++) {
//            for (int j = 1; j < name.length-i; j++) {
//                int counter = j-1;
//                char tempChar = name[j];
//                name[j] = name[counter];
//                name[counter] = tempChar;
//            }
//        }
//        System.out.println(Arrays.toString(name));

        for (int i = name.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i - name.length; j++) {
                int k = j-1;
                char temp = name[j];
                name[j] = name[k];
                name[k] = temp;
            }
        }
        System.out.println(Arrays.toString(name));
    }




//    public void displayFibonacci() {
//        int numberOne = 0;
//        int numberTwo = 1;
//        int sum = 0;
//        for (int i = 0; i < 20; i++) {
//            System.out.println(sum);
//            numberOne = numberTwo;
//            numberTwo = sum;
//            sum = numberOne + numberTwo;
//        }
//    }
//    public int getMinimumNumber() {
//        return min;
//    }
}
