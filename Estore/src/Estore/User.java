package Estore;

public class User {
    private String name;
    private int age;
    private String email;
    private String  homeAddress;
    private String password;
    private String phoneNumber;

    public User(String email,
                int age,
                String name,
                String homeAddress,
                String password,
                String phoneNumber) {
        this.age = age;
        this.name = name;
        this.password = password;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
