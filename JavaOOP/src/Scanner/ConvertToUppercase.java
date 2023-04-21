package Scanner;

public class ConvertToUppercase {

    private Input input;
    private Output output;

    public ConvertToUppercase(final  Input input,final Output output) {
        this.input = input;
        this.output = output;
    }

    public void convertToUpperCase() {
        String inputText = input.fetch();
        String upperCaseText = inputText.toUpperCase();
        output.display(upperCaseText);
    }
}
