package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add("adu");
        treeSet.add("bjus");
        treeSet.add("aiuec");
        treeSet.add("djhs");
        treeSet.add("nbdjA");
        treeSet.add("Boiue");
        System.out.println(treeSet);
    }
}
