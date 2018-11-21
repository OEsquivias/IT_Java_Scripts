package coets;

public class Coet {

	private String id;
	private int[] pmax;
	private int[] pnow;

	public Coet() {}
	
	public Coet(String id, int[] pmax) {

		this.id = are8Chars(id);
		this.pmax = pmax;
		this.pnow = new int[pmax.length];

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = are8Chars(id);
	}

	public int[] getMaxPower() {
		return pmax;
	}

	public void setMaxPower(int[] pmax) {
		this.pmax = pmax;
	}

	public int[] getPnow() {
		return pnow;
	}

	public int getSpeed() {
		int speed = 0;
		for (int s : pnow) {
			speed += s;
		}
		return speed;
	}

	public static String are8Chars(String id) {
		if (id.length() != 8) {
			throw new IllegalArgumentException("The id must be 8 character long");
		} else {
			return id;
		}
	}
	
	
	public void accelerar() {
		for (int i = 0; i > pnow.length; i++) {
			pnow[i] = pnow[i] + 10;
		}

	}

}
