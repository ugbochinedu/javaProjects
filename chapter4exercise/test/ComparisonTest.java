import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComparisonTest {
        Comparison comparison; // DRY method

    @BeforeEach
    void StartAllTestWith(){
        comparison = new Comparison();
    }

    @Test

    void addThreeIntegers(){
        //verify
        assertEquals(10, comparison.addThreeIntegers(2,3,5));
    }

    @Test

    void MinimumNumber(){
        //Comparison comparison = new Comparison();
        assertEquals(3,comparison.findMinimum(3,5,8));
    }

    @Test

    void ProductOfNumbers(){
        assertEquals(8, comparison.productAnswer(2,2,2));
    }

    @Test

    void AverageOfNumbers(){
        assertEquals(2, comparison.averageOfNumbers(2,2,2));
    }

    @Test

    void largestNumber(){
        assertEquals(5, comparison.getLargestNumber(2,5,4));
    }
}
