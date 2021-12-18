
public class Item {

	
	public int getNumInStock() {
		return 0;
	}
	
	public boolean addToCart(int qty) {
		return false;
	}
	
	public boolean updateCartQty(int qty) {
		return false;
	}
	
	public int getQtyInStock() {
		//this involves an unimplemented db call
		return 0;
	}
	
	public double getPrice() {
		//this involves an unimplemented db call
		return 0.00;
	}
	
}
