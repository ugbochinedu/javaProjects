package EnhancedFor;

public class EnhancedFor {
    public static void main(String[] args) {
        int numbers = 0;
        for (String arg : args) {
            numbers = Integer.parseInt(arg);
        }
        System.out.printf("The numbers from command line is/are: %d", Math.abs(numbers));
    }
}
