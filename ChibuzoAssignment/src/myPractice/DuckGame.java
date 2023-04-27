package myPractice;


public class DuckGame {
    public static void main(String[] args) {
        QuackTwo me = new QuackTwo();
        FlyOne flyOne = new FlyOne();
       Duck duck = new Duck(me,flyOne);
    }
}
