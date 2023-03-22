package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String bankName;
    private int lastAccountNumberGenerated;

    private List<Account> accounts;
    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }
    public void createAccountFor(String accountName, String accountPin){
        int accountNumber = generateAccountNumber();
        accounts.add(new Account(accountNumber,accountName,accountPin));
//        Account newAccount = new Account(accountNumber, accountName, accountPin);
//        accounts.add(newAccount);
    }
    private int generateAccountNumber() {
        return ++lastAccountNumberGenerated;
    }
    public int countNumberOfAccount() {
        return accounts.size();
    }
    public int checkBalanceFor(int accountNumber, String pin) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.checkBalance(pin);
    }

    public void deposit(int amount, int accountNumber){
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.deposit(amount);
    }

    public Account findAccountByAccountNumber(int accountNumber) {
        for (Account account:accounts) {
            boolean accountNumberMatches = account.getAccountNumber() == accountNumber;
            if(accountNumberMatches) return account;
        }
        throw new IllegalArgumentException("Account number not found");
    }

    public void transfer(int amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccountByAccountNumber(senderAccountNumber);
        Account receiverAccount = findAccountByAccountNumber(receiverAccountNumber);
        senderAccount.withdraw(amount,senderPin);
        receiverAccount.deposit(amount);
    }

    public void withdraw(int amount, int accountNumber, String pin) {
        Account account = findAccountByAccountNumber(accountNumber);
        account.withdraw(amount,pin);
    }
}