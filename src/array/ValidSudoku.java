package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ValidSudoku {
	public static void main(String[] args) {
		char[][] board = new char[][] {
			new char[] {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
			new char[] {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
			new char[] {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
			new char[] {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
			new char[] {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
			new char[] {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
			new char[] {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
			new char[] {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
			new char[] {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};
		boolean result = isValidSudoku(board);
		System.out.println(result);
	}


	public static boolean isValidSudoku(char[][] board) {
		String testDoc = Arrays.stream(board).map(String::valueOf).collect(Collectors.joining());
		HashMap<String, Long> setW = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			int finalI = i;
			setW.put(String.valueOf(i), testDoc.chars().filter(c -> c == (char) (finalI + '0')).count());
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char charToProcess = board[i][j];
				if (charToProcess != '.') {
					if (
						!checkHorizontal(board, charToProcess, i) ||
							!checkVertical(board, charToProcess, j) ||
							!checkSquare(board, charToProcess, i, j)
					) {
						return false;
					}
				}
			}
		}


		return true;
	}

	public static boolean checkHorizontal(char[][] board, char value, int lineIdx) {
		int count = 0;
		for (int i = 0; i < 9; i++) {
			if (board[lineIdx][i] == value) {
				count++;
			}
		}
		return count == 1;
	}

	public static boolean checkVertical(char[][] board, char value, int columnIdx) {
		int count = 0;
		for (int i = 0; i < 9; i++) {
			if (board[i][columnIdx] == value) {
				count++;
			}
		}
		return count == 1;
	}

	public static boolean checkSquare(char[][] board, char value, int lineIdx, int columnIdx) {
		int count = 0;
		for (int i = ((lineIdx ) / 3) * 3; i < ((lineIdx ) / 3) * 3 + 3; i++) {
			for (int j = ((columnIdx ) / 3) * 3 ; j < ((columnIdx) / 3) * 3 + 3; j++) {
				if (board[i][j] == value) {
					count++;
				}
			}
		}
		return count == 1;
	}
}
