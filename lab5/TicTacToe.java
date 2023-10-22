package tuan5;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] board) {
		super();
		this.board = board;
	}

//checkRow
	public boolean checkRows() {
		for (int row = 0; row < board.length; row++) {
			char firstBlock = board[row][0];
			if (firstBlock == EMPTY) {
				continue;
			}

			boolean match = true;
			for (int col = 1; col < board[row].length; col++) {
				if (board[row][col] != firstBlock) {
					match = false;
					break;
				}
			}

			if (match) {
				return true;
			}
		}

		return false;
	}

//checkColum
	public boolean checkColumns() {
		for (int col = 0; col < board[0].length; col++) {
			char firstBlock = board[0][col];
			if (firstBlock == EMPTY) {
				continue;
			}

			boolean match = true;
			for (int row = 1; row < board.length; row++) {
				if (board[row][col] != firstBlock) {
					match = false;
					break;
				}
			}

			if (match) {
				return true;
			}
		}

		return false;
	}

//checkDiagonals
	public boolean checkDiagonals() {
		char centerBlock = board[1][1];

		if (centerBlock != EMPTY && board[0][0] == centerBlock && board[2][2] == centerBlock) {
			return true; 
		}

		if (centerBlock != EMPTY && board[2][0] == centerBlock && board[0][2] == centerBlock) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		char[][] board = { { 'X', 'O', 'X' }, { 'O', 'X', 'O' }, { 'X', 'O', 'X' } };

		TicTacToe game = new TicTacToe(board);

		if (game.checkRows()) {
			System.out.println("Player wins by rows.");
		} else {
			System.out.println("No player wins by rows.");
		}

		if (game.checkColumns()) {
			System.out.println("Player wins by columns.");
		} else {
			System.out.println("No player wins by columns.");
		}

		if (game.checkDiagonals()) {
			System.out.println("Player wins by diagonals.");
		} else {
			System.out.println("No player wins by diagonals.");
		}
	}

}
