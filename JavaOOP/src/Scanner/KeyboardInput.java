package Scanner;

import java.util.Scanner;

public class KeyboardInput implements Input {
    @Override
    public String fetch() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
