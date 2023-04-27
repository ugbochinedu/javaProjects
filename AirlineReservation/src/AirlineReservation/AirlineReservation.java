package AirlineReservation;

import java.util.Scanner;

public class AirlineReservation {
    Scanner userInput = new Scanner(System.in);
    boolean[] airlineSeats = new boolean[10];
    private int wishToContinue;
    private int firstClassSeatsCounter;
    private int economySeatCounter = 6;

    public void bookSeats(){
        System.out.println("Enter 1 for first Class or 2 for Economy");
        int enteredNumber = userInput.nextInt();

        if (enteredNumber == 1){
           bookFirstClass();
       } else if (enteredNumber == 2) {
            bookEconomy();
        }
    }

    public void wishToContinue(){
        System.out.println("Do you wish to continue? Press 1 or 0 to exit");
        wishToContinue = userInput.nextInt();
    }
    public void bookFirstClass(){

        while (firstClassSeatsCounter < 5) {
            airlineSeats[firstClassSeatsCounter] = true;
            System.out.println("Congratulations, your seat number is " + (firstClassSeatsCounter + 1)
                    + " in the first class section");
            firstClassSeatsCounter++;

            wishToContinue();

            if (wishToContinue == 1) {
                if (firstClassSeatsCounter != 5) {
                    bookSeats();
                } else {
                    System.out.println("Sorry the seats in the first class section have been booked.");
                    System.out.println();
                    System.out.println("Will you like to have a seat in the economy section? Press 1 or 0 to exit");
                    int willYouLikeEconomy = userInput.nextInt();
                    if (willYouLikeEconomy == 1) {
                        bookEconomy();
                    } else {
                        System.out.println("Thanks for checking up on us");
                    }
                }
            }else {
                System.exit(0);
            }
        }
    }

    public void bookEconomy(){

        while (economySeatCounter <= 10) {
            airlineSeats[economySeatCounter] = true;
            System.out.println("Congratulations, your seat number is " + economySeatCounter +
                    " in the economy section");
            economySeatCounter++;

            wishToContinue();

            if (wishToContinue == 1) {
                if (economySeatCounter != 10) {
                    bookSeats();
                } else {
                    System.out.println("Sorry the seats in the economy section have been booked.");
                    System.out.println();
                    System.out.println("Will you like to have a seat in the first class section? Press 1 or 0 to exit");
                    int willYouLikeFirstClass = userInput.nextInt();
                    if (willYouLikeFirstClass == 1) {
                        bookFirstClass();
                    } else {
                        System.out.println("Thanks for checking up on us");
                    }
                }
            }else {
                System.exit(0);
            }
        }
    }
}
