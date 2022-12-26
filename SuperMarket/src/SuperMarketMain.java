import tdd.PriceList;

public class SuperMarketMain {
    public static void main(String[] args) {
        PriceList priceList = new PriceList();
        System.out.println("Welcome \n" + priceList.displayMenu());
        priceList.getUserInput();
        priceList.loopUserInput();
    }
}
