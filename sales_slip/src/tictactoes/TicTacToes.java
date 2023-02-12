package tictactoes;

import java.util.*;
import java.util.List;

public class TicTacToes {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {
        char[][] gameBoard = {{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };
        printGameBoard(gameBoard);

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your position: (1 - 9)");
            int playerPosition = scanner.nextInt();
            System.out.println(playerPosition);
            while (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)){
                playerPosition = scanner.nextInt();
            }

            placePiece(gameBoard, playerPosition,"player");

            String result = checkWinner();
            if (result.length() > 0){
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int cpuPosition = 1 + random.nextInt(9);
            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)){
                //System.out.println("position taken! Enter correct Position");
                cpuPosition = 1 + random.nextInt(9);
            }
            placePiece(gameBoard, cpuPosition,"cpu");

            printGameBoard(gameBoard);

            result = checkWinner();
            if (result.length() > 0){
                System.out.println(result);
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameBoard){
        for (char[] row: gameBoard) {
            for (char column: row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int position, String user){
        char symbol = ' ';

        if(user.equalsIgnoreCase("player")){
            symbol = 'X';
            playerPositions.add(position);
        }else if(user.equalsIgnoreCase("cpu")){
            symbol = 'O';
            cpuPositions.add(position);
        }

        switch (position){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    public static String checkWinner(){

        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List win: winning) {
            if (playerPositions.containsAll(win)){
                //printGameBoard(g);
                return "Congratulations you won!";
            } else if (cpuPositions.contains(win)) {
                return "CPU wins! Sorry: (" ;
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "CAT!";
            }
        }
        return "";
    }
}
