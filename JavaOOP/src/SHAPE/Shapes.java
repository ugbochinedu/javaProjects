package SHAPE;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private final List<Shape> shapes = new ArrayList<>();
    public void add (Shape s) {
         shapes.add(s);
    }
     public void draw() {
     shapes.forEach(Shape::draw);
     }
    public void filter(Filter filter) {
         shapes.forEach(filter::applyTo);
    }
}
