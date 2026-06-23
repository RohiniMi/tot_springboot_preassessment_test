package shoppingCart;

public class Product {
	int product_id;
	String product_name;
	float product_price;
	String product_type;

	Product(int product_id, String product_name, float product_price, String product_type) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_type = product_type;
	}

	public void set_product_id(int product_id) {
		this.product_id = product_id;
	}

	public void set_product_name(String product_name) {
		this.product_name = product_name;
	}

	public void set_product_price(float product_price) {
		this.product_price = product_price;
	}

	public void set_product_type(String product_type) {
		this.product_type = product_type;
	}

	public int get_product_id() {
		return product_id;
	}

	public String get_product_name() {
		return product_name;
	}

	public float get_product_price() {
		return product_price;
	}

	public String get_product_type() {
		return product_type;
	}
//	@Override
//	public String toString() {
//	    return "Product ID: " + product_id +
//	           ", Name: " + product_name +
//	           ", Price: " + product_price +
//	           ", Type: " + product_type;
//	}
}
