import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayJonathan {
    static int[] array = {1,8,3,4,5};
    public static void main(String[] args) {

        int[] newArray =new int[5];
        ArrayList<Integer> newArray1 = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//               sum = array[i] + array[j];
//               if (sum == 7){
//                   System.out.printf("%d and %d%n", i, j);
//               }
//            }
        for (int i = array.length-1; i >= 0; i--) {
            newArray1.add(array[i] );
        }
        System.out.println(newArray1);

        for (int i = array.length-1; i >= 0; i--) {
            newArray[(newArray.length-1)-i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
