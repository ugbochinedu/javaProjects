import arraytest.ArrayNumbers;

import java.util.Arrays;

public class ArrayNumbersMain {
    public static void main(String[] args) {
        ArrayNumbers arrayNumbers = new ArrayNumbers();
        int[] array = {6,3,4,2,1,5};
        System.out.println(Arrays.toString(arrayNumbers.ascendingOrder(array)));
        System.out.println(Arrays.toString(arrayNumbers.descendingOrder(array)));
        System.out.println(Arrays.toString(arrayNumbers.multiplySelf(array)));
    }
}
