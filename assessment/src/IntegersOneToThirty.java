public class IntegersOneToThirty {

    public int sumTheDividends(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if ( i % 3 == 0) sum = sum + i;
        }
        return sum;
    }
}
