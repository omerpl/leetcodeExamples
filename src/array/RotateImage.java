package array;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] board = new int[][] {
			new int[] {1, 2, 3},
			new int[] {4, 5, 6},
			new int[] {7, 8, 9},
		};

		rotate(board);
		System.out.println(board);
	}

	public static void rotate(int[][] matrix) {
		int len = matrix.length;
		int[][] toReturn = new int[len][len];
		for (int i = 0 ; i < len; i++) {
			for (int j = len-1; j >= 0; j--) {
				toReturn[i][j] = matrix[j][i];
			}
		}

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				matrix[i][j] = toReturn[i][len - j -1 ];
			}
		}


	}


}
