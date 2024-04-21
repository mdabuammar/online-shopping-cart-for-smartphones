
package main;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<ShoppingCartItem> cartItems;
    private double totalDiscount;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
        totalDiscount = 0.0;
    }

    public void addItem(ShoppingCartItem item) {
        cartItems.add(item);
    }

    public void removeItem(ShoppingCartItem item) {
        cartItems.remove(item);
    }

    public void setDiscount(double discount) {
        totalDiscount = discount;
    }

    public void displayCartDetails() {
        System.out.println("Shopping Cart Details:");
        for (ShoppingCartItem item : cartItems) {
            System.out.println(item.toString());
        }
        System.out.println("Total Discount: " + totalDiscount + "%");
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (ShoppingCartItem item : cartItems) {
            totalPrice += item.getTotalPrice();
        }
        totalPrice -= totalPrice * totalDiscount / 100;
        return totalPrice;
    }
}
