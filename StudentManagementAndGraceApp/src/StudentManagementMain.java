import studentManagementApp.School;

import javax.swing.*;

public class StudentManagementMain {
    private static School school = new School("globetty");
    public static void main(String[] args) {
        optionMenu();
    }

    public static void optionMenu(){
        String optionMenu = """
                1 -> Create a student account
                2 -> Update student details
                3 -> Get all students
                4 -> Delete a student
                """;

        String selectOption = input(optionMenu);

        switch (selectOption.charAt(0)) {
            case '1' -> createNewStudent();
            case '2' -> updateStudentDetails();
        }
    }

    private static void updateStudentDetails() {
        String updateDetails = """
                1 -> update FirstName
                2 -> update LastName
                3 -> update Address
                4 -> update age
                """;

        String updateOptions = input(updateDetails);
        switch (updateOptions.charAt(0)){
            case '1' :updateFirstName();
        }
    }

    private static void updateFirstName() {
        String firstName = input("Enter firstName");
        school.updateFirstName(firstName);
        display("firstname updated successfully");
        updateStudentDetails();
    }

    private static void createNewStudent() {
        String firstName = input("Enter firstName");
        String lastName = input("Enter lastName");
        String address = input("Enter Address");
        int age = Integer.parseInt(input("Enter your age"));

        school.createStudentDetails(firstName,lastName,address,age);
        display("Student account created successfully");
        optionMenu();
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null,message);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
