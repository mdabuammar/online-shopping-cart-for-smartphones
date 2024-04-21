
package main;
class Smartphone {
    private double price;
    private String model;
    private String brand;

    public Smartphone(double price, String model, String brand) {
        this.price = price;
        this.model = model;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price;
    }
}
