package OOP;

public class ReceiptDemo {

    public static void main( String[] commandLineArgs ) {
        new ReceiptDemo().run();
    }
    private void run() {
     Receipt receipt = new Receipt( new Printer() );

     // Nice cheese and wine evening
     receipt.add("Brie", new Money("1.95", "GBP"));
     receipt.add("Tiger Bread", new Money("0.95", "GBP"));
     receipt.add("Merlot", new Money("7.95", "GBP"));

     receipt.print();
    }
}
