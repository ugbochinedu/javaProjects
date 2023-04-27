import java.util.Scanner;

public class Nokia {
    private String textMessage;
    Scanner input = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("""
                Welcome !!!
                Enter 1 -> Phonebook
                2 -> Messages
                3 -> Call register
                4 -> Extras
                5 -> Games
                6 -> Tones
                7 -> Settings
                """);
        String selectFromDisplayMenu = input.next();

        switch (selectFromDisplayMenu){
            case "1": phonebook();
            break;
            case "2": messageMenu();
            break;
            case "3": callRegister();
            break;
            case "4": extras();
            break;
            case "5": games();
            break;
            case "6": tones();
            break;
            case "7": settingsMenu();
            break;
            default:
                System.out.println("Enter a valid number");
                goBackToMainMenu();
                //displayMenu();
        }
    }

    public void phonebook(){
        System.out.println("""
                Enter 1: Search
                2 -> Service Nos.
                3 -> Add name
                4 -> Erase
                5 -> Edit
                6 -> Assign tone
                7 -> Send business card
                8 -> Speed dials
                9 -> Voice tags
                0 -> Back
                """);
       // returnToMainMenu();
        goBackToMainMenu();
    }

//    public void returnToMainMenu(){
//        int returnToMainMenu = input.nextInt();
//        if (returnToMainMenu == 0) displayMenu();
//    }

    public void messageMenu(){
        System.out.println("""
                1 -> Create message
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                5 -> Message settings
                0 -> Back
                """);

        String selectOptionsInMessageMenu = input.next();

        switch (selectOptionsInMessageMenu){
            case "1":createMessage();
            break;
            case "2":inbox();
            break;
            case "3":outbox();
            break;
            case "4":draft();
            break;
            case "5":messageSettings();
            break;
            case "0": displayMenu();
            break;
            default:
                System.out.println("Enter valid number");
                goBackToMainMenu();
                //messageMenu();
        }
    }

    public void createMessage(){
        System.out.println("Type your message here");
        textMessage = input.next();
        returnToMessageMenuOrMainMenu();
    }

    public void returnToMessageMenuOrMainMenu(){
        //System.out.println("Enter 0 to return to message Menu or 1 to Main Menu");
        //System.out.println("Do you want to continue? type 0");

        int returnToMessageMenuOrMainMenu = input.nextInt();

        if (returnToMessageMenuOrMainMenu == 0){
           // messageMenu();
            goBackToMainMenu();
        }else{
            displayMenu();
        }
    }

    public String getTextMessage(){
        return textMessage;
    }

    public void inbox(){

    }

    public void outbox(){

    }

    public String draft(){
        return getTextMessage();
    }
    public void messageSettings(){
        System.out.println("""
                1 -> Set
                2 -> Common
                """);
    }

    public void callRegister(){
        System.out.println("""
                1 -> Dialed calls
                2 -> Missed Calls
                3 -> Received Calls             
                """);
    }

    public void extras(){
        System.out.println("""
                Enter 1 -> Call divert
                2 -> Calculator
                3 -> Clock
                
                """);
    }
    public void games() {
        System.out.println("""
                1 -> Snake game
                2 -> Danger Dash
                3 -> Ninja Up
                4 -> Bubble bash 2
                0 -> 
                """);
    }

    public void tones(){
        System.out.println("""
                1 -> Ringing tone
                2 -> Ringing volume
                3 -> Incoming call alert
                4 -> Composer
                5 -> Message alert tone
                6 -> Keypad tones
                7-> Warning tones
                8 -> Vibrating alert 
                9 -> Screen saver
                0 -> Back
                """);
    }
    public void settingsMenu(){
        System.out.println("""
                1 -> Tone settings
                2 -> Profile settings
                3 -> Received Calls             
                """);
    }

    public void goBackToMainMenu(){
        System.out.println("Do you want to continue? Yes or No");
        String userName = input.next();
        do {
            if (userName.equalsIgnoreCase("yes")){
                displayMenu();
            }else {
                System.out.println("Thanks");
                System.exit(0);
            }

        } while (userName.equalsIgnoreCase("yes"));
    }
}
