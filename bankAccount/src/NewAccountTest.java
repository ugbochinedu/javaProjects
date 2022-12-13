import java.util.Scanner;

public class NewAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NewAccount account = new NewAccount();
        System.out.println("Enter your name");
        String name = input.nextLine();
        account.setName(name);
        /* System.out.println("Enter account number");
        String accountNumber = input.nextLine();
        account.setAccountNumber(accountNumber);*/
        System.out.printf("Welcome %s%n", account.getName());
        System.out.println("How much do you want to deposit?");
        int deposit = input.nextInt();
        account.deposit(deposit);
        System.out.printf("You deposited initial amount of %.2f%n", account.getBalance());
        System.out.println("How much do you want to withdraw?");
        int withdraw = input.nextInt();
        account.withdraw(withdraw);
        System.out.printf("Your remaining balance is %.2f%n", account.getBalance());
    }
}
