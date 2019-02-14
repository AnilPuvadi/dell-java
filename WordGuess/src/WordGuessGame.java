import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		ArrayList<String> words = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);

		try {
			in = new BufferedReader(new FileReader("words_alpha.txt"));
			String line;
			while ((line = in.readLine()) != null) {
				words.add(line);
			}

		}

		finally {
			if (in != null) {
				in.close();
			}
		}

		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(words.size());// Pick random number
		String guessWord = words.get(randNum);// get the word from list passing random number
		System.out.println("Word is :" + guessWord);
		String userWord = "";
		for (int i = 0; i < guessWord.length(); i++) {
			userWord = userWord + '-';
		}
		
		//Loop in until the user guess the correct word
		while (!guessWord.equals(userWord)) {
			System.out.println("Guess the word, one letter at a time: " + userWord);
			String userLetter = reader.nextLine();
			if (guessWord.contains(userLetter)) {//check if string contains the letter
				//Loop in to find the position of character entered by user
				for (int i = 0; i < guessWord.length(); i++) {
					if (guessWord.charAt(i) == userLetter.charAt(0)) {
						//replace the '-' with the correct letter
						userWord = userWord.substring(0, i) + guessWord.charAt(i) + userWord.substring(i + 1);
					}
				}

			}
		}
		
		System.out.println("Congratulations!! You guessed the word: "+userWord);

		reader.close();
	}

}
