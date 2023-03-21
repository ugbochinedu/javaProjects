package ArrayAssignment;

import java.util.Arrays;

public class ArrayNumber {
    char[][] arrayNumbers = {{'O','X','O'},{'X','O','O'},{'X','O','X'}};

    public void displayArray(){
        for (char[] array:arrayNumbers) {
            for (char symbol:array) {
                //System.out.print(symbol);
                System.out.printf("%3s",symbol);;
            }
            System.out.println();
        }
    }

//    public void displayArray(){
//        for (int i = 0; i < arrayNumbers.length; i++) {
//            for (int j = 0; j < arrayNumbers[i].length; j++) {
//                System.out.print(arrayNumbers[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public String inputArray(char[][] arrayOfNumbers){
        return Arrays.deepToString(arrayOfNumbers);
    }

    public String replaceSymbols(char[][] arrayNumbers){
        System.out.println();
        for (char[] arrayNumber : arrayNumbers) {
            for (char c : arrayNumber) {
                if (c == 'O') System.out.printf("%3s", '0');
                if (c == 'X') System.out.printf("%3s", '1');
            }
            System.out.println();
        }
        return Arrays.deepToString(arrayNumbers);
    }
}
