package Exceptions;

import java.math.BigDecimal;
import java.util.List;

public class Customer {
    private String name;
    private BigDecimal balance;
    private List<Transaction> transactionHistory;

    public Customer (String name, BigDecimal balance){
        this.name = name;
        this.balance = balance;
    }

    public String withdraw(double amount) throws TrenchesException{
        if(balance.compareTo(BigDecimal.valueOf(amount)) < 1){
            throw new TrenchesException("sapa bi e merci");
        }
        balance = balance.subtract(BigDecimal.valueOf(amount));
        return "WITHDRAWAL SUCCESSFUL";
    }

    public String toString(){
        return "Customer[\n name: " + name + "\n" + "balance: " + balance +"\n]";
    }
}
