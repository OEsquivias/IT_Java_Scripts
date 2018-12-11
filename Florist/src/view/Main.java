package view;

import domain.Florist;

public class Main {

	public static void main(String[] args) {
		Florist myFlorist = new Florist("FlowerPower");
		myFlorist.addTree(2.5, 25);
		myFlorist.addTree(2.8, 35);
		myFlorist.addTree(2.0, 55);
		
		myFlorist.addFlower("white", 5);
		myFlorist.addFlower("black", 3);
		myFlorist.addFlower("purple", 2.5);
		
		myFlorist.addDecoration("wood", 65);
		myFlorist.addDecoration("wood", 47.5);
		myFlorist.addDecoration("plastic", 30);
		
		myFlorist.getStock();

	}

}
