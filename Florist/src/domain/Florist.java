package domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {

	private String name;
	private List<Tree> treeList = new ArrayList<>();
	private List<Flower> flowerList = new ArrayList<>();
	private List<Decoration> decorationList = new ArrayList<>();
	
	
	public Florist(String name) {
		this.name = name;
	}
	
	
	public void addTree(double height, double price) {
		Tree oneTree = new Tree(height, price);
		treeList.add(oneTree);
	}
	
	public void addFlower(String color, double price) {
		Flower oneFlower = new Flower(color, price);
		flowerList.add(oneFlower);
	}
	
	public void addDecoration(String material, double price) {
		Decoration oneDecoration = new Decoration(material, price);
		decorationList.add(oneDecoration);
	}
	
	public void getStock() {
		System.out.println(name + " stock:");
		for (int i = 0; i<treeList.size() ; i++) {
			Tree t = treeList.get(i);
			
			System.out.println("Tree " + (i+1) + ": " + t.getHeight() + "m " + t.getPrice() + "€");
		}
		for (int i = 0; i<flowerList.size() ; i++) {
			Flower f = flowerList.get(i);
			
			System.out.println("Flower " + (i+1) + ": " + f.getColor() + " " + f.getPrice()+ "€");
		}
		
		for (int i = 0; i<decorationList.size() ; i++) {
			Decoration d = decorationList.get(i);
			
			System.out.println("Decoration " + (i+1) + ": " + d.getMaterial() + " " + d.getPrice()+ "€");
		}
		
	}
}
