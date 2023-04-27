package DiceRoll;

import java.security.SecureRandom;

public class DiceRoll {

    SecureRandom secureRandom = new SecureRandom();
    int frequencyOne = 0;
    int frequencyTwo = 0;
    int frequencyThree = 0;
    int frequencyFour = 0;
    int frequencyFive = 0;
    int frequencySix = 0;
    public void getSecureRandom(){
        for (int numberOfTimes = 1; numberOfTimes <= 10; numberOfTimes++) {
            int faceValue = 1 + secureRandom.nextInt(6);

            switch (faceValue) {
                case 1 -> frequencyOne++;
                case 2 -> frequencyTwo++;
                case 3 -> frequencyThree++;
                case 4 -> frequencyFour++;
                case 5 -> frequencyFive++;
                case 6 -> frequencySix++;
            }
        }
       System.out.printf("%4d%n%4d%n%4d%n%4d%n%4d%n%4d%n",frequencyOne,frequencyTwo,frequencyThree,frequencyFour,frequencyFive,frequencySix);
    }
}
