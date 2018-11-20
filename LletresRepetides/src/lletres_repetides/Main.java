package lletres_repetides;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
//		fase1("Oriol Esquivias");
//		fase2("Oriol Esquivias");
		fase3("Oriol Esquivias");
//		fase4("Oriol", "Esquivias");

	}

	static void fase1(String name1) {
		char[] charName = name1.toCharArray();
		for (char c : charName) {
			System.out.println(c);
		}

	}

	static void fase2(String name2) {
		char[] charName = name2.toCharArray();
		List<String> lsArrayName = new ArrayList<>();
		for (char c : charName) {
			String stringC = String.valueOf(c);
			lsArrayName.add(stringC);
			whichChar(stringC);
		}

	}

	static void whichChar(String letter) {
		Pattern patternVowel = Pattern.compile("[AEIOUaeiou]");
		Pattern patternConsonant = Pattern.compile("[bcçdfghjklmnñpqrstvwxyzBCÇDFGHJKLMNÑPQRSTVWXYZ]");
		Pattern patternNumber = Pattern.compile("[0-9]");

		Matcher mv = patternVowel.matcher(letter);
		Matcher mc = patternConsonant.matcher(letter);
		Matcher mn = patternNumber.matcher(letter);

		if (mv.matches()) {
			System.out.println("VOCAL");
		} else if (mc.matches()) {
			System.out.println("CONSONANT");
		} else if (mn.matches()) {
			System.out.println("Els noms de persones no contenen números");
		} else {
			System.out.println("");
		}

	}

	static void fase3(String name3) {
		String lowerName = name3.toLowerCase();
		String noSpaceName = lowerName.replaceAll("\\s+", "");
		countLetters(noSpaceName);
	}

	static void countLetters(String name) {
		Map<String, Integer> mapName = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			String c = String.valueOf(name.charAt(i));
			if (mapName.containsKey(c)) {
				mapName.put(c, mapName.get(c) + 1);
			} else {
				mapName.put(c, 1);
			}

		}
		System.out.println(mapName);
	}

	static void fase4(String name4_0, String name4_1) {
		List<String> name = new ArrayList<>(Arrays.asList(name4_0.split("")));
		List<String> surname = new ArrayList<>(Arrays.asList(name4_1.split("")));
		List<String> fullName = new ArrayList<>(name);
		fullName.add(" ");
		fullName.addAll(surname);
		System.out.println(fullName);

	}
}