package myPractice;



public class Duck {
    private Quackable canQuack;
    private Flyable canFly;

    public void myFly(){
        canFly.fly();
    }

    public void myQuack(){
        canQuack.quack();
    }
    public Duck(Quackable canQuack, Flyable canFly) {
        this.canQuack = canQuack;
        this.canFly = canFly;
    }

    public Quackable getCanQuack() {
        return canQuack;
    }

    public void setCanQuack(Quackable canQuack) {
        this.canQuack = canQuack;
    }

    public Flyable getCanFly() {
        return canFly;
    }

    public void setCanFly(Flyable canFly) {
        this.canFly = canFly;
    }
}
