package coets;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Coet> coets = new ArrayList<>();

		Coet coet1 = new Coet("32WESSDS");
		coets.add(coet1);
		Coet coet2 = new Coet("LDSFJA32");
		coets.add(coet2);

		int[] enginesArray1 = { 10, 30, 80 };
		for (int e : enginesArray1) {
			coet1.addEngine(e);
		}

		int[] enginesArray2 = { 30, 40, 50, 50, 30, 10 };
		for (int e : enginesArray2) {
			coet2.addEngine(e);
		}

		for (Coet c : coets) {
			System.out.println(c.getId());
			System.out.println("Number of engines: " + c.getEngineNum());
			System.out.println("Max power of each engine: " + c.getEnginePower());
			System.out.println();
		}

		System.out.println("Speed coet1: " + coet1.getSpeed());
		System.out.println("Speed coet2: " + coet2.getSpeed());
		System.out.println();
		
		coet1.gasPedal(3);
		coet2.gasPedal(3);

		System.out.println("Speed coet1: " + coet1.getSpeed());
		System.out.println("Speed coet2: " + coet2.getSpeed());
		System.out.println();
		
		coet1.brake(5);
		coet2.gasPedal(7);

		System.out.println("Speed coet1: " + coet1.getSpeed());
		System.out.println("Speed coet2: " + coet2.getSpeed());
		System.out.println();

		coet1.gasPedal(15);
		coet2.gasPedal(15);

		System.out.println("Speed coet1: " + coet1.getSpeed());
		System.out.println("Speed coet2: " + coet2.getSpeed());

	}

}
