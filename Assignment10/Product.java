package Assignment10;

public class Product {
    static double discount = 10.0;
    private String productName;
    private final int productID;
    private double price;
    private int quantity;
    private static int totalProducts = 0;

    Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;

        totalProducts++;
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object!!");
        }
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
    }

    static void displayTotalProducts() {
        System.out.println("Total Number of Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 101, 50000, 2);
        Product p2 = new Product("Smartphone", 102, 25000, 5);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        displayTotalProducts();
        System.out.println();

        updateDiscount(15.0);
        p1.displayProductDetails();
    }
}

