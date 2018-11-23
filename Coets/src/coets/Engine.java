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

	
	public void speedUp(int i) {
		currentPower += 10*i;
		if (currentPower > maxPower) {
			currentPower = maxPower;
		}
	}
	
	public void slowDown(int i) {
		currentPower -= 10*i;
		if (currentPower < 0) {
			currentPower = 0;
		}
	}
}
