package domain;

public abstract class Item {
	
	protected double price;
	
	public Item(double price) throws Exception {
		checkPrice(price);
		this.price = price;
	}
	
	public double getPrice() {
		return price;
}
	public void checkPrice(double price) throws Exception {
		if(price <= 0.0) {
			throw new Exception("Price must be positive");
		}
	}
}