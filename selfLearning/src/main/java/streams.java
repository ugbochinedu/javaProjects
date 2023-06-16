import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streams {
    public static void main(String[] args) {
//        int answer = IntStream.range(1,10).sum();
//        System.out.println(answer);
//
//        int result = IntStream.rangeClosed(1,10).map((int x) -> x * 2).sum();
//        System.out.println(result);
//
//        int answer = IntStream.rangeClosed(1,10).filter(x -> x % 2 == 0).map(x-> x * 2).sum();
//        System.out.println(answer);
//
//      int[] arr = {1,2,3,4,5,6,7,4};
//        System.out.println( IntStream.of(arr).mapToObj(String::valueOf).collect(Collectors.joining("")));
//        System.out.println(IntStream.of(arr).sorted().mapToObj(String::valueOf).collect(Collectors.joining("")));
        int[] arr = {10,9,8,2,1,7};
//        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                int temp = 0;
//                arr[i] = temp;
//                arr[j] = arr[i];
//                temp = arr[j];
//                if (arr[i] > arr[j]){
//                    int temp = 0;
//                     temp = arr[i];
//                    arr[j] = temp;
//                    arr[i] = arr[j];
//                }
//            }
//        }
        int max = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < max){
                max = arr[i];
//                counter = counter + 1;
            }
        }
        return arr;
    }
}
