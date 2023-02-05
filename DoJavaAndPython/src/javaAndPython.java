import java.util.Arrays;

public class javaAndPython {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8};

        // NO 1
//        int max = array[0];
//        for (int arr:array) {
//           if (arr > max){
//               max = arr;
//           }
//        }
//        System.out.println(max);

//        No 2
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }

//        No 3
//        int num = 9;
//        for (int element:array) {
//            if (num == element){
//                System.out.println("True");
//            }else {
//                System.out.println("False");
//            }
//        }
//
//        int check = Arrays.binarySearch(array,9);
//
//        boolean verify = check >= 0;
//        System.out.println(verify);

//        // No 4
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) System.out.println(array[i]);
//        }
//
//        // No 5
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) System.out.println(array[i]);
//        }
        //No 6
//        int sum = 0;
//        for (int arr:array) {
//            sum += arr;
//        }
//        System.out.println(sum);
        //NO 7
        String name = "mum";
        String reversed = "";
        for (int i = name.length() -1; i >= 0 ; i--) {
            reversed += name.charAt(i);
            System.out.println(reversed);
        }

        //No 8



        if (name.equals(reversed)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
