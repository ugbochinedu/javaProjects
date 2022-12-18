package tdd;

public class CreditLimitCalculator {
    private String accountNumber;
    private int balance;
    private int allItem;
    private int totalCreditApplied;
    private int creditLimit;
    private int charges;

    public CreditLimitCalculator(String accountNumber,
                                 int balance,
                                 int allItems,
                                 int totalCreditApplied,
                                 int creditLimit,
                                 int charges) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.allItem = allItems;
        this.totalCreditApplied = totalCreditApplied;
        this.creditLimit = creditLimit;
        this.charges = charges;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        int newBalance = balance + charges;
        balance = balance + charges - creditLimit;
        if(newBalance > creditLimit) System.out.println("Credit limit exceeded");
        return balance;
    }

    public int charges(int charges) {
        this.charges = charges;
        return charges;
    }

    public int creditLimit(int creditLimit) {
        return creditLimit;
    }
}
