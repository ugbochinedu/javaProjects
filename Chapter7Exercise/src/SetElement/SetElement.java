package SetElement;

public class SetElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

//        for (int counter = 0; counter < array.length; counter++) {
//            array[counter] = 0;
//            System.out.printf("%d - %d%n", counter, array[counter]);
//        }

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = array[counter] * 2;
            System.out.println(array[counter]);
        }
    }
}
