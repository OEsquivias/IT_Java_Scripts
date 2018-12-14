package domain;

public class Tree extends Item{
	
	private double height;
	
	public Tree(double height, double price) throws Exception{
		super(price);
		checkHeight(height);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public void checkHeight(double height) throws Exception{
		if (height <= 0.0) {
			throw new Exception("Height must be positive");
		}
	}
	
}
