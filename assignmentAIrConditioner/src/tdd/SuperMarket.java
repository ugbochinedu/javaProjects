package tdd;

public class SuperMarket {

    public void displayProducts(String book, String bag, String shoes) {
        System.out.println("Welcome");

        System.out.printf(" 1. Press 1 for Books%n 2. Press 2 for Bag%n 3. Press 3 for Shoe%n");
    }

    public void selectProduct(int number) {
        while (number < 3){
          if(number == 1) {
              System.out.println("How many books do you want to buy?");

          }
        }
    }
}
