package coets;

public class Engine {

	private int maxPower;
	private int currentPower;


	public Engine(int maxPower) {
		this.maxPower = maxPower;
		this.currentPower = 0;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public int getCurrentPower() {
		return currentPower;
	}

	
	public void speedUp() {
		currentPower += 10;
		if (currentPower > maxPower) {
			currentPower = maxPower;
		}
	}
	
	public void slowDown() {
		if (currentPower < 0) {
			currentPower = 0;
		}
	}
}
