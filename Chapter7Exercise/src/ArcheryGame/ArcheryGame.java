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
                Players    First Score    Second Score    Third Score     Sum Of Scores
                """);

        for (counter = 0; counter < playerScores.length; counter++) {
            for(randomScore = 0; randomScore < playerScores[counter].length; randomScore++){
                playerScores[counter][randomScore] = secureRandom.nextInt(10);
                sum[counter]+= playerScores[counter][randomScore];
            }
            //Optimize the code here with counter
            System.out.printf("%s%2d%10d%15d%15d%15d%n","Player", counter + 1, playerScores[counter][0], playerScores[counter][1], playerScores[counter][2], sum[counter]);
        }
    }
}
