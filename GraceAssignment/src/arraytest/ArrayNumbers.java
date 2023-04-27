package arraytest;

public class ArrayNumbers {
    int[] multiple;
    int ascendingOrder = 0;
    int counter;
    public int[] multiplySelf(int[] numbers) {
        multiple = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            multiple[i] = numbers[i] * numbers[i];
        }
        return multiple;
    }


    public int[] ascendingOrder(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    ascendingOrder = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = ascendingOrder;
                }
            }
        }
        return numbers;
    }

    public int[] descendingOrder(int[] numbers) {
        for (counter = 0; counter < numbers.length; counter++) {
            for (int j = counter+1; j < numbers.length; j++) {
                if (numbers[counter]<numbers[j]){
                    ascendingOrder = numbers[counter];
                    numbers[counter] = numbers[j];
                    numbers[j] = ascendingOrder;
                }
            }
        }

        return numbers;
    }
}
