package view;

import controller.Controller;

public class Main {

	private static Controller controller = new Controller();
	
	
	public static void main(String[] args) throws Exception {
		
		String nameFlorist1 = "Flower Power";
		controller.createFlorist(nameFlorist1);
		controller.addTree(nameFlorist1, 5.85, 25);
		controller.addTree(nameFlorist1, 2.8, 35);
		controller.addTree(nameFlorist1, 2.14, 55);
		
		controller.addFlower(nameFlorist1, "white", 5.0);
		controller.addFlower(nameFlorist1, "black", 3.7);
		controller.addFlower(nameFlorist1, "purple", 2.5);
		
		controller.addDecoration(nameFlorist1, "wood", 65);
		controller.addDecoration(nameFlorist1, "wood", 47.5);
		controller.addDecoration(nameFlorist1, "plastic", 30);
		
		controller.printAllItems(nameFlorist1);
		
		
		String nameFlorist2 = "Flowerist";
		controller.createFlorist(nameFlorist2);
		controller.addTree(nameFlorist2, 5.95, 35);
		controller.addFlower(nameFlorist2, "white", 6.0);
		controller.addDecoration(nameFlorist2, "wood", 75);
		controller.printAllItems(nameFlorist2);

		
	}

}
