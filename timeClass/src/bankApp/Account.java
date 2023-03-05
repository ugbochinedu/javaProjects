package bankApp;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;
    private String accountName;
    public Account(int accountNumber, String accountName, String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public void deposit(int amount){
        boolean amountIsInvalid = amount < 0;
        if(amountIsInvalid)throw new IllegalArgumentException("Invalid amount deposit");
        else balance += amount;
    }

    public int checkBalance(String pin){
        if(pinIsCorrect(pin)) return balance;
        else throw new IllegalArgumentException("Invalid Pin");
    }

    private boolean pinIsCorrect(String pin){
        return this.pin.equals(pin);
    }
    public void withdraw(int amount, String pin){
        boolean amountIsValid = amount > 0 && amount < balance;
        if (pinIsCorrect(pin) && amountIsValid) balance -= amount;
        else throw new IllegalArgumentException("You can't withdraw the amount you imputed");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

