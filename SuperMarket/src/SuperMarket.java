import java.util.Scanner;

public class SuperMarket {

        private  int  totalBookAmount;
        Scanner userInput = new Scanner(System.in);

        public void displayOption(){
            System.out.println("Welcome");
            System.out.println(" Press 1 for book\n Press 2 for bag\n Press 3 for Shoe\n");
        }

        public int userOption(){
            int userOption = userInput.nextInt();
            if (userOption == 1){
                System.out.println("Book Quantity");
                int bookQuantity = userInput.nextInt();
               int totalBookAmount = bookQuantity * 200;
            }
            return totalBookAmount;
        }


//
//
//    public void menuSelection() {
//        System.out.println("Welcome");
//        System.out.println(" Press 1 for book\n Press 2 for bag\n Press 3 for Shoe\n");
//        int selectMenu = userInput.nextInt();
//
//        if (selectMenu == 1) {
//            int priceOfBook = 200;
//            System.out.println("How many books do you want to buy");
//            int numberOfBooks = userInput.nextInt();
//            int totalAmountOfBooks = numberOfBooks * priceOfBook;
//            System.out.printf("Total Amount  %d books is %d%n", numberOfBooks, totalAmountOfBooks);
//
//        } else if (selectMenu == 2) {
//            int priceOfBag = 150;
//            System.out.println("How many bags do you want to buy?");
//            int numberOfBags = userInput.nextInt();
//            int totalAmountOfBags = numberOfBags * priceOfBag;
//            System.out.printf("Total Amount for %d bags is %d%n", numberOfBags, totalAmountOfBags);
//
//        } else if (selectMenu == 3) {
//            int priceOfShoe = 120;
//            System.out.println("How many shoes do you want to buy?");
//            int numberOfBags = userInput.nextInt();
//            int totalAmountOfShoes = numberOfBags * priceOfShoe;
//            System.out.printf("Total Amount for %d shoe is %d%n", numberOfBags, totalAmountOfShoes);
//
//        } else {
//            System.out.println("Invalid input");
//
//        }
//
//    }
//    public void replayMenu(){
//        System.out.println("Do you wish to continue? if yes press 1");
//        int replayMenu = userInput.nextInt();
//        for (int i = 0; i < replayMenu; i++) {
//            if (replayMenu == 1) {
//                menuSelection();
//            }else {
//                System.out.println("Thanks for shopping");
//            }
//        }
////        do{
////            menuSelection();
////        }while (replayMenu == 1);
////        System.out.println("thanks for shopping");
//    }
}
