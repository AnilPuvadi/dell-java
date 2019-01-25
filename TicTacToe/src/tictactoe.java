import java.util.Scanner;

public class tictactoe {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		char Player = 'X';
		PrintBoard(board);
		Scanner reader = new Scanner(System.in);
		while (!checkforwin(board, Player) && !checkforDraw(board, Player)) {
			Boolean UserPosition = validateUserInput(reader, board, Player);
			PrintBoard(board);
			if (UserPosition) {
				if (Player == 'X'&&!checkforwin(board, Player)) {
					Player = 'O';
				} else if (Player == 'O'&&!checkforwin(board, Player)) {
					Player = 'X';
				} 
				
			} else {
				UserPosition = validateUserInput(reader, board, Player);
			}
		}
		if (checkforwin(board, Player)) {
			System.out.println("------------------------------------------------");
			System.out.println("Game Over and The winner is Player :" + Player);
			System.out.println("------------------------------------------------");
		} else if (checkforDraw(board, Player)) {
			System.out.println("------------------------------------------------");
			System.out.println("Match is drawn, play again!");
			System.out.println("------------------------------------------------");
		}

	}

	public static void PrintBoard(char[][] board) {

		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

	// method to check for winning combos
	public static boolean checkforwin(char[][] board, char player) {
		return (checkHorizantalWin(board, player) || checkVerticalWin(board, player)
				|| checkDiagonalWin(board, player));
	}

	// Method to check for draw
	public static boolean checkforDraw(char[][] board, char player) {
		boolean matchdrawn = false;
		if (!checkforwin(board, player)) {
			matchdrawn = true;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (!(board[i][j] == 'X' || board[i][j] == 'O')) {
						matchdrawn = false;
					}
				}
			}
		}
		return matchdrawn;
	}

	// Method to check for winning across rows
	public static boolean checkHorizantalWin(char[][] board, char player) {
		if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == player)
				|| (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == player)
				|| (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == player)) {
			return true;
		} else {
			return false;
		}

	}

	// Method to check for winning across columns
	public static boolean checkVerticalWin(char[][] board, char player) {
		if ((board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == player)
				|| (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == player)
				|| (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == player)) {
			return true;
		} else {
			return false;
		}

	}

	// Method to check for winning combos across diagonals
	public static boolean checkDiagonalWin(char[][] board, char player) {
		if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == player)
				|| (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] == player)) {
			return true;
		} else {
			return false;
		}

	}

	// method to read user input and write to array if input is valid
	public static boolean validateUserInput(Scanner reader, char[][] board, char player) {
		System.out.println("Player: " + player + "'s Turn");
		System.out.println("Please select the available row position you would like to play ( select from 0-2)");
		int row = Integer.parseInt(reader.nextLine());
		System.out.println("Please select the available column position you would like to play ( select from 0-2)");
		int column = Integer.parseInt(reader.nextLine());
		if ((board[row][column] != 'X') && (board[row][column] != 'O')) {
			board[row][column] = player;
			return true;
		} else {
			return false;
		}

	}

}
