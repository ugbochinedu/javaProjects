package ArcheryGame;

import java.security.SecureRandom;

public class ArcheryGame {
    SecureRandom secureRandom = new SecureRandom();
    private final int[][] playerScores = new int[4][3];
    private final int[] sum = new int[4];
    int counter;
    int randomScore;
    public void processPlayerScores(){

        System.out.println();
        System.out.print("""
                Players    First Score    Second Score    Third Score     Sum Of Scores
                """);

        for (counter = 0; counter < playerScores.length; counter++) {
            for(randomScore = 0; randomScore < playerScores[counter].length; randomScore++){
                playerScores[counter][randomScore] = secureRandom.nextInt(10);
                sum[counter]+= playerScores[counter][randomScore];
            }
            //Optimize the code here with counter
            System.out.printf("%s%2d%10d%15d%15d%15d%n","Player", counter + 1, playerScores[counter][0],
                    playerScores[counter][1], playerScores[counter][2], sum[counter]);
        }
    }

    public void CalcMaximumSum(){
        int maximumSum = sum[0];
        int maximumSumCounter;

        for (maximumSumCounter = 0; maximumSumCounter < playerScores.length; maximumSumCounter++) {
            if (sum[maximumSumCounter] > maximumSum) {
                sum[maximumSumCounter] = maximumSum;
                System.out.printf("""
                        %s %d %s
                        """, "Player", maximumSumCounter + 1, "wins");
            }
        }
    }
}
