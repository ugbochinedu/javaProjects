package bankApp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account;

    @BeforeEach
    public void setUp(){
       account = new Account(1, "Black favour", "1234");
    }

    @Test
    public void depositTest(){
        account.deposit(1500);
        assertEquals(1500,account.checkBalance("1234")) ;
    }

    @Test
    void  depositNegativeAmountReturnsBalanceTest(){
        account.deposit(-1500);
        assertEquals(0,account.checkBalance("1234"));
    }

    @Test
    public void checkBalanceWithWrongPinReturnZeroTest(){
        account.deposit(1500);
        assertEquals(0,account.checkBalance("1254"));
    }

    @Test
    public void withdrawMoneyTest(){
        account.deposit(8000);
        account.withdraw(4000,"1234");
        assertEquals(4000,account.checkBalance("1234"));
    }

    @Test
    public void withdrawNegativeAmountDoesNOtWorkTest(){
        account.deposit(4000);
        account.withdraw(-2000, "1234");
        assertEquals(4000,account.checkBalance("1234"));
    }

    @Test
    public void withdrawAboveBalanceDoesNotWorkTest(){
        account.deposit(4000);
        account.withdraw(6000,"1234");
        assertEquals(4000,account.checkBalance("1234"));
    }

    @Test
    public void withdrawWithWrongPinDoesNotWorkTest(){
        account.deposit(8000);
        account.withdraw(4000, "1254");
        assertEquals(8000, account.checkBalance("1234"));
    }
}
