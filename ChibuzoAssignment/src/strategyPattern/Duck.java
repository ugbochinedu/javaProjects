package strategyPattern;

public class Duck {
    private Quackable myQuack;
    private Flyable myFly;

    public void fly(){
        myFly.fly();
    }

    public void quack(){
        myQuack.quack();
    }

    public Duck(Quackable quackable, Flyable flyable) {
        this.myQuack = quackable;
        this.myFly = flyable;
    }

    public Quackable getMyQuack() {
        return myQuack;
    }

    public void setMyQuack(Quackable myQuack) {
        this.myQuack = myQuack;
    }

    public Flyable getMyFly() {
        return myFly;
    }

    public void setMyFly(Flyable myFly) {
        this.myFly = myFly;
    }
}
