package Estore;

public class Customer extends User{
private ShoppingCart shoppingCart;
private BillingInformation billingInformation;

    public Customer(String email,
                    int age,
                    String name,
                    String homeAddress,
                    String password,
                    String phoneNumber) {
        super(email, age, name, homeAddress, password, phoneNumber);
    }
}
