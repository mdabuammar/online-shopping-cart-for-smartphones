
package main;
class ShoppingCartItem extends Smartphone {
    private int quantity;

    public ShoppingCartItem(double price, String model, String brand, int quantity) {
        super(price, model, brand);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void removeItem() {
        quantity--;
    }

    public double getTotalPrice() {
        return getPrice() * quantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Quantity: " + quantity + ", Total Price: $" + getTotalPrice();
    }
}
