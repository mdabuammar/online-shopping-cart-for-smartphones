
package main;
class Discount extends Smartphone {
    private double discount;

    public Discount(double price, String model, String brand, double discount) {
        super(price, model, brand);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
