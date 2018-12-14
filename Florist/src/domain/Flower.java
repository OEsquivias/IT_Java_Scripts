package domain;

public class Flower extends Item {
	
	private String color;
	
	public Flower(String color, double price) throws Exception {
		super(price);
		checkColor(color);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public void checkColor(String color) throws Exception {
		if(color.equals("")) {
			throw new Exception("Color cannot be empty");
		}
	}
}
