package sales;

import java.util.Scanner;
public class Slip {
    Scanner scanner = new Scanner(System.in);
    private final int[][] productsTotal = new int[5][4];
    //private final int[][] salesPersonTotal = new int[4][5];
    public void displayHeader(){
        System.out.print("          ");
        int numberOfSalesPersons = 4;
        for (int i = 0; i < numberOfSalesPersons; i++) {
            System.out.print("    persons " + (i + 1));
        }
        System.out.println("      Total");
    }
    public void TotalPriceOfEachProduct(){
        for (int i = 0; i < productsTotal.length; i++) {
            int j;
            for (j = 0; j < productsTotal[i].length; j++) {
                System.out.println("Total amount of Product" + (i + 1) + " sold by sales person " + (j + 1) + " is:");
                int totalAmount = scanner.nextInt();
                productsTotal[i][j] = totalAmount;
            }
            System.out.println();
        }
    }

    public void displaySlip(){
        displayHeader();
        int total = 0;
        for (int i = 0; i < productsTotal.length; i++) {

            int sum = 0;
            System.out.print("Product" + (i+1));
            for (int j = 0; j < productsTotal[i].length; j++) {
                System.out.print("           ");
                System.out.print(productsTotal[i][j]);
                sum += productsTotal[i][j];

            }
            System.out.print("              ");
            System.out.println(sum);

        }
        for (int i = 0; i < productsTotal.length; i++) {
            total += productsTotal[i][0];
        }
        System.out.print("   Total");
//        System.out.print("          ");
//        System.out.print(total);
        System.out.printf("%12d",total);
        int total1 = 0;
        for (int i = 0; i < productsTotal.length; i++) {
            total1 += productsTotal[i][1];
        }

//        System.out.print("          ");
//        System.out.print(total1);
        System.out.printf("%12d",total1);
        int total2 = 0;
        for (int i = 0; i < productsTotal.length; i++) {
            total2 += productsTotal[i][2];
        }

//        System.out.print("          ");
//        System.out.print(total2);
        System.out.printf("%12d",total2);
        int total3 = 0;
        for (int i = 0; i < productsTotal.length; i++) {
            total3 += productsTotal[i][3];
        }

//        System.out.print("          ");
//        System.out.println(total3);
        System.out.printf("%12d",total3);
        System.out.println();
    }



//    public void totalProducts(){
//        for (int[] total: productsTotal ) {
//            int productSum = 0;
//            for (int amount:total) {
//                productSum+=amount;
//            }
//            System.out.println(productSum);
//        }
//    }

}
