package domain;

public abstract class Item {
	
	protected double price;
	
	public Item(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
}
}