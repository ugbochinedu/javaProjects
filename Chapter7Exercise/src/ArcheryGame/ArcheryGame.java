package ArcheryGame;

import java.security.SecureRandom;

public class ArcheryGame {
    SecureRandom secureRandom = new SecureRandom();

    int[][] playerScores = new int[4][3];
    public void processPlayerScores(){
        int[] sum = new int[4];
        int counter;
        int randomScore;

        System.out.println();
        System.out.print("""
                Players     First Score    Second Score    Third Score     Sum Of Scores
                """);

        for (counter = 0; counter < playerScores.length; counter++) {
            for(randomScore = 0; randomScore < playerScores[counter].length; randomScore++){
                playerScores[counter][randomScore] = secureRandom.nextInt(10);
                sum[counter]+= playerScores[counter][randomScore];
            }
        }
        System.out.printf("%s%10d%15d%15d%15d%n","Player 1", playerScores[0][0], playerScores[0][1], playerScores[0][2], sum[0]);
        System.out.printf("%s%10d%15d%15d%15d%n","Player 2", playerScores[1][0], playerScores[1][1], playerScores[1][2], sum[1]);
        System.out.printf("%s%10d%15d%15d%15d%n","Player 3", playerScores[2][0], playerScores[2][1], playerScores[2][2], sum[2]);
        System.out.printf("%s%10d%15d%15d%15d%n","Player 4", playerScores[3][0], playerScores[3][1], playerScores[3][2], sum[3]);
    }
}
