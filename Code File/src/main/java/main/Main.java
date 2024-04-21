
package main;
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone(500.0, "P20 Pro", "Huawei");
        Smartphone smartphone2 = new Smartphone(600.0, "S9 Ultra", "Samsung");

        ShoppingCartItem cartItem1 = new ShoppingCartItem(smartphone1.getPrice(), smartphone1.getModel(), smartphone1.getBrand(), 2);
        ShoppingCartItem cartItem2 = new ShoppingCartItem(smartphone2.getPrice(), smartphone2.getModel(), smartphone2.getBrand(), 3);

        Discount discountItem = new Discount(smartphone2.getPrice(), smartphone2.getModel(), smartphone2.getBrand(), 10.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(cartItem1);
        cart.addItem(cartItem2);
        cart.setDiscount(discountItem.getDiscount());
        cart.displayCartDetails();

        cartItem1.removeItem();
        cartItem2.removeItem();
        System.out.println("Updated Inventory After Removing Items:");
        cart.displayCartDetails();

        double discountOnSecondProduct = 12.0;
        discountItem.setDiscount(discountOnSecondProduct);
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Discount on the 2nd Product: " + discountOnSecondProduct + "%");
        System.out.println("Updated Price: $" + totalPrice);
    }
}
