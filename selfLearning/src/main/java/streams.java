import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streams {
    public static void main(String[] args) {
//        int answer = IntStream.range(1,10).sum();
//        System.out.println(answer);

        int result = IntStream.rangeClosed(1,10).map((int x) -> x * 2).sum();
        System.out.println(result);

        int answer = IntStream.rangeClosed(1,10).filter(x -> x % 2 == 0).map(x-> x * 2).sum();
        System.out.println(answer);

      int[] arr = {1,2,3,4,5,6,7,4};
        System.out.println( IntStream.of(arr).mapToObj(String::valueOf).collect(Collectors.joining("")));
        System.out.println(IntStream.of(arr).sorted().mapToObj(String::valueOf).collect(Collectors.joining("")));
        System.out.println(Arrays.stream(arr).sorted().collect(Collectors.toList()));
    }
}
