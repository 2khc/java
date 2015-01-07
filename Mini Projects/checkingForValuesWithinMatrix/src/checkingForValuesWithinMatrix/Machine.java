package checkingForValuesWithinMatrix;

import java.util.Arrays;
import java.util.Random;

public class Machine {
	public static int[][] generateRandomMatrix(int x, int y) {
		Random r = new Random();
		int[][] matrix = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				matrix[i][j] = r.nextInt(100);
			}
		}
		return matrix;
	}

	public static boolean zeroCheck(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static int[][] setToZero(int[][] matrix) {
		int[][] tempMatrix = copyMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					Arrays.fill(tempMatrix[i], 0);
					setColumnToZero(tempMatrix, j);
				}
			}
		}
		return tempMatrix;
	}

	private static int[][] setColumnToZero(int[][] tempMatrix, int j) {
		for (int k = 0; k < tempMatrix.length; k++) {
			tempMatrix[k][j] = 0;
		}
		return tempMatrix;
	}

	private static int[][] copyMatrix(int[][] matrix) {
		int[][] copyOfMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				copyOfMatrix[i][j] = matrix[i][j];
			}
		}
		return copyOfMatrix;
	}

	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
