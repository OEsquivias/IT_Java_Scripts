package coets;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		List<Coet> coets = new ArrayList<>();
		int[] engines1 = {10, 30, 80};
		coets.add(new Coet("32WESSDS", engines1));
		int[] engines2 = {30, 40, 50, 50, 30, 10};
		coets.add(new Coet("LDSFJA32", engines2));

		for (Coet c : coets) {
			System.out.print(c.getId() + ": ");
			for(int p : c.getMaxPower()) {
				System.out.print(p + " ");
			}
			System.out.println();
			c.accelerar();
			for(int p : c.getPnow()) {
				System.out.print(p + " ");
			}
			System.out.println();
			c.accelerar();
			System.out.println("Speed: " + c.getSpeed());
			

		}
		
	}
	
}
