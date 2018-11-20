package coets;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Coet> coets = new ArrayList<>();
		coets.add(new Coet("32WESSDS", 3));
		coets.add(new Coet("LDSFJA32", 6));

		for (Coet c : coets) {
			System.out.println(c.getCodi());
			System.out.println(c.getPropulsor());

		}

	}

}