package Scanner;

public class convertToUppercase{

    private final Input input;

    public convertToUppercase(final  Input input) {
        this.input = input;
    }

    public void convertToUpperCase() {
        String inputText = input.fetch();
        String upperCaseText = inputText.toUpperCase();
        System.out.println(upperCaseText);
    }
}
