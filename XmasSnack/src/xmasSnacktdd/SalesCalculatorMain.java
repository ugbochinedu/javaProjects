package xmasSnacktdd;


public class SalesCalculatorMain {
    public static void main(String[] args) {
        SalesCalculator salesCalculator = new SalesCalculator();
        salesCalculator.setProductNumber();
        salesCalculator.setQuantitySold();
        System.out.printf("The total sales of products is %.2f%n%n", salesCalculator.getTotalSalesOfProduct());
        salesCalculator.loopSalesCalculator();
    }
}
