public class NewAccount{
    private double balance;
    private String name;
    //private String accountNumber;

   /* public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double cash) {
        if(cash > 0) this.balance += cash;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("insufficient fund");
        } else if (amount > 0 && amount < balance)
            balance -= amount;
        else {
           System.out.println("invalid transaction, you can't withdraw " + amount);
        }
    }
}
