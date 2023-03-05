package bankApp;

import javax.swing.*;
import java.util.Scanner;

public class ATMmachine {
    private static Bank gtBank = new Bank("GTbank");
    public static void main(String[] args) {
     displayMainMenu();
    }

    private static void displayMainMenu(){
        String mainMenu = """
                Welcome to GTB bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                """;

        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transferMoney();
            case '5' -> checkBalance();
            case '6' -> System.exit(0);
            default -> {
                display("Incorrect Entry");
                displayMainMenu();
            }
        }
    }

    private static void transferMoney() {
        int yourRubbishAccountNumber = Integer.parseInt(input("What is your account number"));
        int receiverAccountNumber = Integer.parseInt(input("Enter receiver account number"));
        int amountToTransfer = Integer.parseInt(input("Enter amount you want to transfer"));
        String pin = input("Enter your pin");

        gtBank.transfer(amountToTransfer,yourRubbishAccountNumber,receiverAccountNumber,pin);
        display("Transfer was successful");
        displayMainMenu();
    }

    private static void withdraw() {
        int yourRubbishAccountNumber = Integer.parseInt(input("What is your account number"));
        int amountToWithdraw = Integer.parseInt(input("How much do you want to withdraw?"));
        String pin = input("Enter your pin");

        try{
            gtBank.withdraw(amountToWithdraw,yourRubbishAccountNumber,pin);

        }catch (IllegalArgumentException ex){
            display(ex.getMessage());
            displayMainMenu();
        }
        display("withdraw successfully");
        displayMainMenu();
    }

    private static void checkBalance() {
        int yourRubbishAccountNumber = Integer.parseInt(input("What is your account number"));
        String pin = input("Type your pin");

        try {
            int balance = gtBank.checkBalanceFor(yourRubbishAccountNumber,pin);
            display(""+balance);
        } catch (IllegalArgumentException ex){
            display(ex.getMessage());
            displayMainMenu();
        }
        displayMainMenu();
    }

    private static void deposit(){
        int yourRubbishAccountNumber = Integer.parseInt(input("What is your account number"));
        int yourMoney = Integer.parseInt(input("How much do you want to deposit"));

        try{
            gtBank.deposit(yourMoney, yourRubbishAccountNumber);
        }catch (IllegalArgumentException ex){
            display(ex.getMessage());
            displayMainMenu();
        }
        display("Deposited successfully");
        displayMainMenu();
    }

    private static void createAccount() {
        String accountName = input("What is the account Name");
        String accountPin = input("What is the account pin");
        // collect account name
        //collect account pin

        gtBank.createAccountFor(accountName,accountPin);
        display("Account created successfully");
        displayMainMenu();
    }

    private static void display(String message){
        JOptionPane.showMessageDialog(null,message);
//        System.out.println(message);
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(prompt);
//        return scanner.nextLine();
    }

//    private static void print(String message){
//        System.out.println(message);
//    }
}
