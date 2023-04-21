package ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array {
    List<Integer> maxAndMinArray = new ArrayList<>();
    public List<Integer> ReturnMaxAndMin(int[] arrayOfNumbers){
        int sum = addNumbersInArray(arrayOfNumbers);
        subtractEachIndexAfterSum(sum,arrayOfNumbers);
        return maxAndMinArray;
    }
    private int addNumbersInArray(int[] arrayOfNumbers){
        int sum = 0;
        for (int arrayOfNumber : arrayOfNumbers) sum += arrayOfNumber;

        return sum;
    }
    private void subtractEachIndexAfterSum(int sum, int[] arrayOfNumbers) {
        int[] tempArray = new int[arrayOfNumbers.length];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            tempArray[i] = sum - arrayOfNumbers[i];
        }
        System.out.println(Arrays.toString(tempArray));
        findMaximumAndMinimumInArray(tempArray);
    }

    private void findMaximumAndMinimumInArray(int[] tempArray){
       int max = getMaximumInArray(tempArray);
       int min = getMinimumInArray(tempArray);

        appendMinAndMax(min,max);
    }
    private int getMinimumInArray(int[] tempArray) {
        int min = tempArray[0];
        for (int number: tempArray) if (number < min) min = number;
        return min;
    }
    private int getMaximumInArray(int[] tempArray) {
        int max = tempArray[0];
        for (int number: tempArray) if (number > max) max = number;
        return max;
    }

    private void appendMinAndMax(int min, int max) {
        maxAndMinArray.add(min);
        maxAndMinArray.add(max);
    }
}