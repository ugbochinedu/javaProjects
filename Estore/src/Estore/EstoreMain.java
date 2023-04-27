package Estore;

public class EstoreMain {
    public static void main(String[] args) {
        Admin admin = new Admin("chinedu",
                20,
                "o.ugbochinedu@yahoo.com",
                "6 Ademola street, Lagos.",
                "lagos12345",
                "07035137163");
        User user = new User("chinedu",
                20,
                "o.ugbochinedu@yahoo.com",
                "6 Ademola street, Lagos.",
                "lagos12345",
                "07035137163");

        //admin.setEmail("o.ugbochinedu@yahoo.com");
        //System.out.println(admin.email);
        System.out.println(admin.getEmail());
    }
}
