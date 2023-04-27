public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Chinedu", 50.50);
        System.out.println(account.getName());
        System.out.println(account.getBalance());
        account.setName("Remigious");
        System.out.println(account.getName() );
    }
}
