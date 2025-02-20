package Bridgelabz_2113100011.Assignment20;

import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cart.put(product, price);
        sortedCart.put(price, product);
    }

    public void displayCart() {
        System.out.println("Cart (Insertion Order - LinkedHashMap): " + cart);
        System.out.println("Cart (Sorted by Price - TreeMap): " + sortedCart);
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        return total;
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 80000);
        cart.addProduct("Phone", 50000);
        cart.addProduct("Headphones", 3000);
        cart.addProduct("Smartwatch", 10000);

        cart.displayCart();
        System.out.println("Total Price: " + cart.calculateTotal());
    }
}

