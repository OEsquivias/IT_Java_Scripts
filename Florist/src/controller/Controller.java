package controller;

import java.util.ArrayList;
import java.util.List;

import domain.Decoration;
import domain.Florist;
import domain.Flower;
import domain.Item;
import domain.Tree;


public class Controller {

	private List<Florist> floristList = new ArrayList<>();
	
	
	
	public Controller() {}
	
	public void createFlorist(String floristName) {
		Florist myFlorist = new Florist(floristName);
		floristList.add(myFlorist);
	}
	
	
	public int floristIndex(String floristName) throws Exception {
		int i = 0;
		while ( i<floristList.size()) {
			if (floristList.get(i).getFloristName().equals(floristName)) {
				return i;
			} 
			i++;
		}
		throw new Exception("This florist does not exist") ;
	}
	
	
	public void addTree(String floristName, double height, double price) throws Exception {
		int j = floristIndex(floristName);
		floristList.get(j).addTree(height, price);
		
	}
	
	public void addFlower(String floristName, String color, double price) throws Exception {
		int j = floristIndex(floristName);
		floristList.get(j).addFlower(color, price);
	}
	
	public void addDecoration(String floristName, String material, double price) throws Exception {
		int j = floristIndex(floristName);
		floristList.get(j).addDecoration(material, price);
	}
	
	public void getAllTrees(String floristName) throws Exception {
		int j = floristIndex(floristName);
		List<Tree> treeList = new ArrayList<>();
		int count = 0;
		for (Item t: floristList.get(j).itemList) {
			if (t instanceof Tree) {
				treeList.add((Tree)t);
				count++;
				System.out.println("Tree " + count + ": " + ((Tree)t).getHeight() + "m " + t.getPrice() + "€");
			}
		}
	}
	
	public void getAllFlowers(String floristName) throws Exception {
		int j = floristIndex(floristName);
		List<Flower> flowerList = new ArrayList<>();
		int count = 0;
		for (Item f: floristList.get(j).itemList) {
			if (f instanceof Flower) {
				flowerList.add((Flower)f);
				count++;
				System.out.println("Flower " + count + ": " + ((Flower)f).getColor() + " " + f.getPrice() + "€");
			}
		}
	}
	
	
	public void getAllDecorations(String floristName) throws Exception {
		int j = floristIndex(floristName);
		List<Decoration> decorationList = new ArrayList<>();
		int count = 0;
		for (Item d: floristList.get(j).itemList) {
			if (d instanceof Decoration) {
				decorationList.add((Decoration)d);
				count++;
				System.out.println("Decoration " + count + ": " + ((Decoration)d).getMaterial() + " " + d.getPrice() + "€");
			}
		}
	}
	
	
	public void getAllItems(String floristName) throws Exception {
		System.out.println(floristName + " stock:");
		getAllTrees(floristName);
		getAllFlowers(floristName);
		getAllDecorations(floristName);	
	}
}
