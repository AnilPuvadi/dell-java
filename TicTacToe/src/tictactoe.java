
public class tictactoe {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		PrintBoard(board);
		char Player = 'X';
	}

	public static void PrintBoard(char[][] board) {

		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}
	
	public static void checkforwin() {
		System.out.println("Player Wins");
	}
	
	public static retrieveinput() {
		
		
	}

}

