import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountTest account = new AccountTest();
        System.out.println("Enter your firstname");
        String firstName = input.nextLine();
        System.out.println("Enter your lastname");
        String lastName = input.nextLine();
        account.setName(firstName, lastName);
        System.out.println("Enter your age");
        int age = input.nextInt();
        account.setAge(age);
        System.out.println("Enter your next of kin");
        String nextOfKin = input.nextLine();
        account.setNextOfKin(nextOfKin);
        System.out.printf("My name is %s%n", account.getName());
        System.out.printf("Age: %d%n", account.getAge());
        System.out.printf("Next Of Kin: %s%n", account.getNextOfKin());
    }
}
