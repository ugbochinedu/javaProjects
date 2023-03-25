package SHAPE;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Four sides all the same for me");
    }

    @Override
    public void apply(Filter f) {

    }
}
