package coets;

import java.util.ArrayList;
import java.util.List;

public class Coet {

	private String id;
	private List<Engine> enginesCoet = new ArrayList<>();

	public Coet(String id) throws Exception {
		check8Chars(id);
		this.id = id;

	}

	public void addEngine(int maxPower) throws Exception {
		if (maxPower <=0) {
			throw new Exception("The engine power must be a positive integer");
		}
		this.enginesCoet.add(new Engine(maxPower));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws Exception {
		check8Chars(id);
		this.id = id;
	}
	
	public int getEngineNum() {
		return enginesCoet.size();
	}

	public List<Integer> getEnginePower() {
		List<Integer> enginePower = new ArrayList<>();
		for (Engine p : enginesCoet) {
			enginePower.add(p.getMaxPower());
		}
		return enginePower;
	}

	public int getSpeed() {
		int speed = 0;
		for (Engine p : enginesCoet) {
			speed += p.getCurrentPower();
		}
		return speed;
	}

	public void gasPedal() throws Exception {
		checkEngines();
		for (Engine p : enginesCoet) {
			p.speedUp();
		}

	}

	public void brake() {
		for (Engine p : enginesCoet) {
			p.slowDown();
		}

	}

	public void check8Chars(String id) throws Exception {
		if (id.length() != 8) {
			throw new Exception("The id must be 8 character long");
		} 
	}

	public void checkEngines() throws Exception {
		if (enginesCoet.isEmpty()) {
			throw new Exception("There are no engines!!!");
		}
	}


}
