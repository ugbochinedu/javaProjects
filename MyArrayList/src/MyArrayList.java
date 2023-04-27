import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Ada");
        items.add("Obi");
        items.add("Apple");
        items.add("Alex");

        System.out.println(items);

        //System.out.println(items.get(0));
        for (int counter = 0; counter < items.size(); counter++) {
            System.out.println(items.get(counter));
        }
        System.out.println();

        for (String item: items) {
            System.out.println(item);
        }

    }
}
