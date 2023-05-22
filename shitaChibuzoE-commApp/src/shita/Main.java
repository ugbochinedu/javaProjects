package shita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shita.controllers.UserController;
import shita.dto.requests.RegisterUserRequest;

import javax.swing.*;

@SpringBootApplication
public class Main {
    private static final UserController userController = new UserController();

    public static void main(String... params) {
        SpringApplication.run(Main.class, params);
//        String mainMenu = """
//                Hi,
//                What do you want to do?
//                1-> Register new User
//                2-> Find Registered User
//                """;
//        int userInput = collectUserInput(mainMenu);
//        switch(userInput){
//            case 1 -> registerUser();
//            case 2 -> findRegisteredUser();
//        }
    }

    private static void findRegisteredUser() {
        String userid = collectUserInput("Enter user id");
        display(userController.findUserId(userid).toString());
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static String collectUserInput(String mainMenu) {
        return (JOptionPane.showInputDialog(mainMenu));
    }

    private static void registerUser() {
        String firstName = collectStringInput("Enter first name");
        String lastName = collectStringInput("Enter last name");
        String address = collectStringInput("Enter Address");
        String email = collectStringInput("Enter Email");
        String phoneNumber = collectStringInput("Enter Phone Number");
        RegisterUserRequest request = new RegisterUserRequest();

        request.setAddress(address);
        request.setEmail(email);
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setPhoneNumber(phoneNumber);
        display(userController.registerNewUser(request).toString());
        main();
    }

    private static String collectStringInput(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

}
