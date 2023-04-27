package Estore;

public class Admin extends User{

    protected String email;

    public Admin(String name,
                 int age,
                 String email,
                 String  homeAddress,
                 String password,
                 String phoneNumber){
        super(email, age, name, homeAddress, password, phoneNumber);
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
