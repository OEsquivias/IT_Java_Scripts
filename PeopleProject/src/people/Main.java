package people;

public class Main {

	private static void printText(int count, String texto) {
		for (int i = 0; i < count; i++) {
			System.out.println(texto);
		}
	}

	


	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	
	
	public static void main(String[] args) {
		printText(5, "Hi");
		int j = 2;
		if (isEven(j)) {
			System.out.println(j);
		}
	}
}
