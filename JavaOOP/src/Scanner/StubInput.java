package Scanner;

public class StubInput implements Input{
    private final String stubValue;

    public StubInput(String stubValue) {
        this.stubValue = stubValue;
    }
    @Override
    public String fetch() {
        return stubValue;
    }
}
