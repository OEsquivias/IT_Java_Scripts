package domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {

	private String floristName;

	public List<Item> itemList = new ArrayList<>();
	
	public String getFloristName() {
		return floristName;
	}

	public Florist(String floristName) {
		this.floristName = floristName;
	}
	
	public void checkFloristName(String floristName) throws Exception {
		if(floristName.equals("")) {
			throw new Exception("Name cannot be empty");
		}
	}
	public void addTree(double height, double price) throws Exception {
		Tree oneTree = new Tree(height, price);
		itemList.add(oneTree);
	}
	
	public void addFlower(String color, double price) throws Exception {
		Flower oneFlower = new Flower(color, price);
		itemList.add(oneFlower);
	}
	
	public void addDecoration(String material, double price) throws Exception {
		Decoration oneDecoration = new Decoration(material, price);
		itemList.add(oneDecoration);
	}
	

}
