package OOP;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final Printer printer ;
    private final List<Item> items = new ArrayList<>();

     public Receipt( Printer p ) {
     this.printer = p;
    }

     public void add(String description, Money price) {
     items.add( new Item(description, price) );
     }

     public void print () {
     items.forEach(item -> item.print(printer));
    }
}
