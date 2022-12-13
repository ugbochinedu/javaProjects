public class Car {
    private String model;
    private String year;
    private double price;
    private double carDiscount;

    public Car(String model, String year, double price, double carDiscount) {
        this.model = model;
        this.year = year;
        if (price > 0) this.price = price;
        if (price > 0) this.carDiscount = carDiscount;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
       return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price -= carDiscount;
    }
}
