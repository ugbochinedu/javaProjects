package SHAPE;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("I have three sides");
    }

    @Override
    public void apply(Filter f) {

    }
}
