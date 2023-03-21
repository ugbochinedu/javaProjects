package strategyPattern;

public class DuckGame {
    public static void main(String[] args) {
        FlyOne flyOne = new FlyOne();
        QuackOne quackOne = new QuackOne();
        Duck mDuck = new Duck(quackOne,flyOne);
        FlyZero flyZero = new FlyZero();

    }
}
