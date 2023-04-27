package RandomNumbers;

public class RandomNumbersMain {
    public static void main(String[] args) {
//        RandomNumbers randomNumbers = new RandomNumbers();
//        randomNumbers.randomValues();

        for (int number = 0; number <= 100; number++) {
            if (number % 3 != 0 || number % 5 != 0) System.out.println(number);
            if (number % 3 == 0) System.out.println("fizz");
            if (number % 5 == 0) System.out.println("buzz");;
            if (number % 3 == 0 && number % 5 == 0) System.out.println("fizzbuzz");
        }
    }
}
