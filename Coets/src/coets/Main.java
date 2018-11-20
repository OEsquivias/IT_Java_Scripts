package coets;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		List<Coet> coets = new ArrayList<>();
		int[] propulsors1 = {10, 30, 80};
		coets.add(new Coet("32WESSDS", propulsors1));
		int[] propulsors2 = {30, 40, 50, 50, 30, 10};
		coets.add(new Coet("LDSFJA32", propulsors2));

		for (Coet c : coets) {
			System.out.print(c.getCodi() + ": ");
			for(int p : c.getPropulsor()) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

	}

}
