package DiceGame;

import java.security.SecureRandom;

public class DiceGame {
    SecureRandom secureRandom = new SecureRandom();
    private enum Status {Continue, Won, Lost};

    private final int rollTwo = 2;
    private final int rollThree = 3;
    private final int rollSeven = 7;
    private final int rollEleven = 11;
    private final int rollTwelve = 12;

    Status gameStatus;

    int sumOfDice = diceRolling();

    int pointCounter = 0;

    public int diceRolling(){
        int firstDie = 1 + secureRandom.nextInt(6);
        int secondDie = 1 + secureRandom.nextInt(6);

        int sumDice = firstDie + secondDie;

        System.out.printf("The player rolled %d%n", sumDice);

        return sumDice;
    }

    public void SwitchCase(){
        switch (sumOfDice) {
            case rollSeven, rollEleven -> gameStatus = Status.Won;
            case rollTwo, rollThree, rollTwelve -> gameStatus = Status.Lost;
            default -> {
                gameStatus = Status.Continue;
                pointCounter = sumOfDice;
                System.out.printf("The total sum %d%n", pointCounter);
            }
        }

        while (gameStatus == Status.Continue){
            sumOfDice = diceRolling();
            if (sumOfDice == pointCounter) {
                gameStatus = Status.Won;
            } else if (sumOfDice == 7) {
                gameStatus = Status.Lost;
            }
        }

        if(gameStatus == Status.Won){
            System.out.println("player wins");
        }else {
            System.out.println("player losses");
        }
    }
}
