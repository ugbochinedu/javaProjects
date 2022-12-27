package tdd;

import java.util.Scanner;
public class PriceList {

    public int totalBookPrice;
    public int totalBagPrice;
    private int totalShoePrice;

    int totalPriceOfAllProducts;
    int bookQuantity;
    int shoeQuantity;
    int bagQuantity;

    Scanner scanner = new Scanner(System.in);
    public String displayMenu() {
        return ("""
                Press 1 for book
                Press 2 for shoe
                Press 3 for bag""");
    }

    public int setBookPrice(int bookQuantity) {
        this.bookQuantity = bookQuantity;
        totalBookPrice = 200 * bookQuantity;
        return totalBookPrice;
    }

    public int setBagPrice(int bagQuantity) {
        this.bagQuantity = bagQuantity;
        totalBagPrice = 400 * bagQuantity;
        return totalBagPrice;
    }

    public int setShoePrice(int shoeQuantity) {
        this.shoeQuantity = shoeQuantity;
        totalShoePrice = 700 * shoeQuantity;
        return totalShoePrice;
    }
    public void getUserInput() {
        int userInput;
        userInput = scanner.nextInt();

        if(userInput == 1){
            System.out.println("The price of each book is 200.\n" +
                    "How many books do you want?");
            int bookQuantity = scanner.nextInt();
            setBookPrice(bookQuantity);
            System.out.println("The total price of " + setBookPrice(bookQuantity) +" book(s) is " + totalBookPrice);
            System.out.println();
        } else if (userInput == 2) {
            System.out.println("The price of each shoe is 700.\n" +
                    "How many shoes do you want?");
            int shoeQuantity = scanner.nextInt();
            setShoePrice(shoeQuantity);
            System.out.println("The total price of " + setShoePrice(shoeQuantity) +" shoe(s) is " + totalShoePrice);
            System.out.println();
        }else if (userInput == 3){
            System.out.println("The price of each bag is 400.\n" +
                    "How many bags do you want?");
            int bagQuantity = scanner.nextInt();
            setBagPrice(bagQuantity);
            System.out.println("The total price of " + setBagPrice(bagQuantity) +" bag(s) is " + totalBagPrice);
            System.out.println();
        }else{
            System.out.println("invalid input");
        }
    }
    public void loopUserInput(){
        String usersChoice;
        do {
            System.out.println("Do you want to continue? Yes or No");
            usersChoice = scanner.next();

            if (usersChoice.equals("yes")) {
                System.out.println(displayMenu());
                getUserInput();
            } else if (usersChoice.equals("no")) {
                totalPriceOfAllProducts = totalBagPrice + totalShoePrice + totalBookPrice;
                System.out.println();
                System.out.println("The total price of your purchase is " + totalPriceOfAllProducts);
                System.out.println("Thanks for your patronage");
            } else {
                System.out.println("invalid selection");
            }
        } while (usersChoice.equals("yes"));
    }
}
