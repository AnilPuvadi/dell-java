import java.util.Scanner;

public class piglatin {

	public static void main(String[] args) {
		System.out.println(" Please enter an english which needs to be transalted into Pig Latin: ");
		Scanner reader = new Scanner(System.in);
		String englishword = reader.nextLine();
		String lowerword = englishword.toLowerCase();
		if (wordwithoutvowel(lowerword)) {
			System.out.println("Pig Latin translated value is : " + englishword + "ay");
		} else {
			if (wordstartswithvowel(lowerword)) {
				System.out.println("Pig Latin translated value is : " + englishword + "yay");
			} else {
				int index = wordhasvowel(lowerword);
				System.out.println("Pig Latin translated value is : " + englishword.substring(index)
						+ englishword.substring(0, index) + "ay");
			}
		}

		reader.close();
	}

	public static boolean wordstartswithvowel(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o'
				|| word.charAt(0) == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean wordwithoutvowel(String word) {
		if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o")
				|| word.contains("u")) {
			return false;
		} else {
			return true;
		}
	}

	public static int wordhasvowel(String word) {
		int index = 0;
		for (int i = 1; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				index = i;
				break;
			}
		}
		return index;
	}
}
