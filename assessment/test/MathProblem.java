import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathProblem {

    IntegersOneToThirty numbers = new IntegersOneToThirty();


    @Test
    public void dividendsOfThreeCanBeAddedTest(){
        int number = 10;
        assertEquals(18, numbers.sumTheDividends(number));
    }
}
