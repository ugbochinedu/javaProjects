package RandomNumbers;

import java.security.SecureRandom;

public class RandomNumbers {
    SecureRandom randomValues = new SecureRandom();
    public void randomValues(){
        for (int numberOfTimes = 1; numberOfTimes <=20 ; numberOfTimes++) {
            int faceValues = 1 + randomValues.nextInt(6);
            System.out.printf("%4d", faceValues);

            if (numberOfTimes % 5 == 0) System.out.println();
        }
    }
}
