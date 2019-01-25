import java.util.Random;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println(" Welcome to play Rock Paper Scissors");
		System.out.println(" Type any value between 'Rock' , 'Paper' & 'Scissors'");
		Scanner reader = new Scanner(System.in);
		String userhand = "";
		boolean invalidInput = true;
		while (invalidInput) {
			userhand = reader.nextLine();
			try {
				validateUserInput(userhand);
				invalidInput = false;
			} catch (Exception e) {
				System.out.println(e);

			}
		}
		reader.close();

		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(3);
		String ComputerRslt = CalcComputerHand(randNum);
		System.out.println("Computer's Hand is :" + ComputerRslt);
		String output = DeriveOutputmessage(userhand, ComputerRslt);
		System.out.println(output);

	}

	// Assigning Rock/Paper/Scissors value to Computer Input based on the random
	// number generated.
	public static String CalcComputerHand(int num) {
		String ComputerHand = "";
		if (num == 0) {
			ComputerHand = "Rock";
		} else if (num == 1) {
			ComputerHand = "Paper";
		} else {
			ComputerHand = "Scissors";
		}
		return ComputerHand;
	}

	// Method to check if User's input is in one of the three allowed values and
	// print a message if not.
	public static void validateUserInput(String userhand) {

		if (!(userhand.equals("Rock") || userhand.equals("Paper") || userhand.equals("Scissors"))) {
			throw new IllegalArgumentException(
					" Invalid User Input, Please Type any value between 'Rock' , 'Paper' & 'Scissors' ");
		}

	}

	// Method to compare the user's input versus Computer's input and return the
	// result
	public static String CheckWinner(String user, String Comp) {
		if (user.equals("Rock")) {
			if (Comp.equals("Paper")) {
				return "Computer";
			} else {
				return "User";
			}
		} else if (user.equals("Paper")) {
			if (Comp.equals("Scissors")) {
				return "Computer";
			} else {
				return "User";
			}
		} else {
			if (Comp.equals("Rock")) {
				return "Computer";
			} else {
				return "User";
			}
		}

	}

	public static String DeriveOutputmessage(String userhand, String ComputerRslt) {
		if (userhand.equals(ComputerRslt)) {// Check if User's input and Computer's input matches and display message
			// accordingly
			return " Match Drawn, Play again";
		} else {
			String win = CheckWinner(userhand, ComputerRslt);
			if (win.equals("User")) {
				return "You won, Congratulations!!";
			} else {
				return "Computer wins, better luck next time";
			}
		}

	}

}
