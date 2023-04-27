package DiceRolling;

import java.security.SecureRandom;

public class DiceRolling {
    SecureRandom random = new SecureRandom();
    int[] sum = new int[100];
    int[] frequency = new int[13];

    public void getSum(){

        for (int counter = 0; counter < sum.length; counter++) {
            int randomNumberOne = 1 + random.nextInt(5);
            int randomNumberTwo = 1 + random.nextInt(5);

            sum[counter] = randomNumberOne + randomNumberTwo;
            ++frequency[sum[counter]];
            System.out.println(sum[counter]);
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);
        }

    }
}
