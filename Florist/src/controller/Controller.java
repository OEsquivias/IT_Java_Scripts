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
	
	
	public Florist getFlorist(String floristName) throws Exception {
		int i = 0;
		while ( i<floristList.size()) {
			if (floristList.get(i).getFloristName().equals(floristName)) {
				return floristList.get(i);
			} 
			i++;
		}
		throw new Exception("This florist does not exist") ;
	}
	
	
	public void addTree(String floristName, double height, double price) throws Exception {
		Florist currentFlorist = getFlorist(floristName);
		currentFlorist.addTree(height, price);
		
	}
	
	public void addFlower(String floristName, String color, double price) throws Exception {
		Florist currentFlorist = getFlorist(floristName);
		currentFlorist.addFlower(color, price);
	}
	
	public void addDecoration(String floristName, String material, double price) throws Exception {
		Florist currentFlorist = getFlorist(floristName);
		currentFlorist.addDecoration(material, price);
	}
	
	public void getAllTrees(String floristName) throws Exception {
		Florist currentFlorist = getFlorist(floristName);
		currentFlorist.getTrees();
		
	}
	
	public void getAllFlowers(String floristName) throws Exception {
		Florist currentFlorist = getFlorist(floristName);
		currentFlorist.getFlowers();
	}
	
	
	public void getAllDecorations(String floristName) throws Exception {
		Florist currentFlorist = getFlorist(floristName);
		currentFlorist.getDecorations();
	}
	
	
	public void getAllItems(String floristName) throws Exception {
		System.out.println(floristName + " stock:");
		getAllTrees(floristName);
		getAllFlowers(floristName);
		getAllDecorations(floristName);	
	}
}
