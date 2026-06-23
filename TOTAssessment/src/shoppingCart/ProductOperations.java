package shoppingCart;
import java.util.ArrayList;

public class ProductOperations {
    ArrayList<Product> list = new ArrayList<>();
    public void addProducts(Product prod) {
        list.add(prod);
    }
    public void showProducts() {
        if (list.isEmpty()) {
            System.out.println("Product List is empty");
            return;
        }
        for (Product prod : list) {
            System.out.println(prod);
        }
    }

    public Product getProductID(int id) {
        for (Product prod : list) {
            if (prod.get_product_id() == id) {
                return prod;
            }
        }
        return null;
    }

    public boolean updateProduct(int product_id,String product_name,float product_price, String product_type) {
        Product prod = getProductID(product_id);
        if (prod != null) {
            prod.set_product_name(product_name);
            prod.set_product_price(product_price);
            prod.set_product_type(product_type);
            return true;
        }
        return false;
    }

    public boolean removeProduct(int product_id) {
        Product prod = getProductID(product_id);
        if (prod != null) {
            list.remove(prod);
            return true;
        }return false;
    }
}