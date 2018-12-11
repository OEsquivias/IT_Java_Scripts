package domain;

public class Tree extends Item{
	
	private double height;
	
	public Tree(double height, double price) {
		super(price);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	
}
