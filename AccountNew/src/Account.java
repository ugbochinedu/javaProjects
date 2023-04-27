public class Account {
    private String name;
    private double balance;

    private String accountNumber;

    public Account(String myName, double myBalance){
        name = myName;
        balance = myBalance;
    }

    public void setName(String myName) {
        name = myName;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double myBalance) {
        balance = myBalance;
    }
}
