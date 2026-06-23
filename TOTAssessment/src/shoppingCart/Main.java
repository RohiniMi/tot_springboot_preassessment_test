package shoppingCart;
public class Main {
    public static void main(String[] args) {
        ProductOperations pd1 = new ProductOperations();
        pd1.addProducts(new Product(101, "Laptop", 55000, "Electronics"));
        pd1.addProducts(new Product(102, "Phone", 25000, "Electronics"));
        pd1.showProducts();
    }
}