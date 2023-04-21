import java.util.Arrays;

public class ArrayNumber {
    public int[] reverseArray(int[] numbers) {
        for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {
            for (int secondIndex = 1; secondIndex < numbers.length - firstIndex; secondIndex++) {
                int counter = secondIndex-1;
                int tempNumber = numbers[secondIndex];
                numbers[secondIndex] = numbers[counter];
                numbers[counter] = tempNumber;
            }
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
