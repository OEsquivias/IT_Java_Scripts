package domain;

public class Flower extends Item {
	
	private String color;
	
	public Flower(String color, double price) {
		super(price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	
}
