package tdd;

import tdd.CreditLimitCalculator;

public class CreditLimitCalculatorMain {
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator("111777", 6000, 5,4, 6000,1000);
        creditLimitCalculator.getBalance();
    }
}
