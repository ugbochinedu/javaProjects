package ArrayAssignment;

public class main {
    public static void main(String[] args) {
        ArrayNumber arrayNumber = new ArrayNumber();
        arrayNumber.displayArray();
        char[][] num = {{'O','X','X'},{'O','X','O'}};
        arrayNumber.inputArray(num);
        arrayNumber.replaceSymbols(num);
    }
}
