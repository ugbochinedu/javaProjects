public class CarApplication {
    public static void main(String[] args) {
        Car firstCar = new Car("Toyota","2014", 200000, 0.05);
        Car secondCar = new Car("kia","2018", 700000, 0.07);
        Car thirdCar = new Car("kia","2018", -700000, 0.07);
        System.out.printf("The price of the first car is %.3f%n", firstCar.getPrice());
        System.out.printf("The price of the second car is %.3f%n", secondCar.getPrice());
        System.out.printf("The price of the third car is %.3f%n", thirdCar.getPrice());
    }
}
