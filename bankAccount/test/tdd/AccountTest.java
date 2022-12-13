package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositFundTest(){
        //given that malik has an account
        Account malikAccount = new Account();
        //when I deposit 23
        malikAccount.deposit(23);
        //check that the balance is 23
        int balance = malikAccount.getBalance();
        assertEquals(23, balance);
    }

    @Test
    public void depositTwiceTest(){
        //given malik has an account
        Account malikAccount = new Account();
        //given there is 300 in the account;
        malikAccount.deposit(300);
        int balance = malikAccount.getBalance();
        assertEquals(300, balance);
        //when I try to deposit 200;
        malikAccount.deposit(200);
        //check that balance is 500;
        balance = malikAccount.getBalance();
        assertEquals(500, balance);
    }

    @Test

    public void depositNegativeAmountTest(){
        //giving i have an account with zero balance;
        Account malikAccount = new Account();
        //when i try to deposit negative amount (-2300);
        malikAccount.deposit(-2300);
        //check that balance is zero
        int balance = malikAccount.getBalance();
        assertEquals(0, balance);
    }

    @Test

    public void withdrawMoneyTest(){
        //given I have an account
        Account malikAccount = new Account();
        //given I have an initial deposit 3000;
        malikAccount.deposit(3000);
        // when I withdraw 2000
        malikAccount.withdraw(2000);
        //check that balance is 1000
        int balance = malikAccount.getBalance();
        assertEquals(1000, balance);
    }

    @Test

    public void withdrawNegativeMoneyTest(){
        //given I have an account
        Account malikAccount = new Account();
        //I have an initial balance of 1000
        malikAccount.deposit(1000);
        //when i withdraw negative amount of -500
        malikAccount.withdraw(-500);
        // check balance wasn't affected
        int balance = malikAccount.getBalance();
        assertEquals(1000, balance);
    }

    @Test

    public void withdrawAboveBalanceTest(){
        //given I have an account
        Account malikAccount = new Account();
        //I have initial balance of 500
        malikAccount.deposit(500);
        //I withdraw cash above balance of 1000
        malikAccount.withdraw(1000);
        //check balance wasn't affected
        int balance = malikAccount.getBalance();
        assertEquals(500, balance);
    }
}
