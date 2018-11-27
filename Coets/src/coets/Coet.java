package coets;

import java.util.ArrayList;
import java.util.List;

public class Coet {

	private String id;
	private List<Engine> enginesCoet = new ArrayList<>();

	public Coet(String id) throws Exception {
		checkRocketId(id);
		this.id = id;

	}

	public void addEngine(int maxPower) throws Exception {
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

	public void gasPedal(int i) throws Exception {
		checkEngines();
		for (Engine p : enginesCoet) {
			p.speedUp(i);
		}

	}

	public void brake(int i) {
		for (Engine p : enginesCoet) {
			p.slowDown(i);
		}

	}

	public void checkRocketId(String id) throws Exception {
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
