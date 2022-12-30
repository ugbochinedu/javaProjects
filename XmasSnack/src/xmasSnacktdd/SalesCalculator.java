package xmasSnacktdd;

import java.util.Scanner;

public class SalesCalculator {

    private int productNumber;
    private int quantitySold;
    private double priceOfProduct;


    Scanner userInput = new Scanner(System.in);

    public void setProductNumber() {

           System.out.println("Enter product number");
           productNumber = userInput.nextInt();
           switch (productNumber) {
               case 1 -> priceOfProduct = 2.98;
               case 2 -> priceOfProduct = 4.50;
               case 3 -> priceOfProduct = 9.98;
               case 4 -> priceOfProduct = 4.49;
               case 5 -> priceOfProduct = 6.87;
               default -> System.out.println("Enter the correct product number");
           }
    }
    public int getProductNumber() {
        return productNumber;
    }

    public void setQuantitySold() {
        System.out.println("Enter quantity of product sold");
        quantitySold = userInput.nextInt();
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public double getTotalSalesOfProduct() {
        return quantitySold * priceOfProduct;
    }

    public void loopSalesCalculator(){
        int answer;
        int counter = 0;

        System.out.println("Do you wish to continue? Yes, press any 1 to continue; N0, press -1 to exit");
        answer = userInput.nextInt();

        while (answer != -1){
            setProductNumber();
            setQuantitySold();
            System.out.printf("The total sales of products is %.2f%n%n", getTotalSalesOfProduct());
            counter = counter + 1;

            System.out.println("Do you wish to continue? Yes, press any 1 to continue; N0, press -1 to exit");
            answer = userInput.nextInt();
        }
        System.out.println("Thanks for patronizing us");
    }
}
