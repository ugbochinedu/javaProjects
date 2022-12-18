package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitCalculatorTest {

    CreditLimitCalculator creditLimitCalculator;

    @BeforeEach

    void StartAllTestWith(){
        creditLimitCalculator = new CreditLimitCalculator("111777", 5000, 5,4, 6000,1000);
    }

    @Test

    void CustomersBalance(){
        creditLimitCalculator.setBalance(5000);
        //assertEquals(5000, creditLimitCalculator.getBalance());
    }

    @Test

    void CustomersCharges(){
       //creditLimitCalculator.charges(1000); I left this for easy comprehension
       assertEquals(1000, creditLimitCalculator.charges(1000));
    }

    @Test

    void CustomersCreditLimit(){
        assertEquals(6000, creditLimitCalculator.creditLimit(6000));
    }

    @Test

    void DisplayNewBalance(){
        assertEquals(0,creditLimitCalculator.getBalance());
    }
}
