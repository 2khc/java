package rotateImageMatrix;

import java.util.Arrays;

public class Machine {
	public static String[][] create2dArray(int x, int y) {

		String[][] imageMatrix = new String[x][y];
		for (int m = 0; m < y; m++) {
			for (int i = 0; i < x; i++) {
				String filler = createString(i, m);
				imageMatrix[i][m] = filler;
			}
		}
		return imageMatrix;
	}

	public static String[][] rotateArray(String[][] imageMatrix) {
		String[][] rotatedArray =  create2dArray(imageMatrix[0].length, imageMatrix.length);
		for (int m = 0; m < imageMatrix[0].length; m++) {
			for (int i = 0; i < imageMatrix[0].length; i++) {
				rotatedArray[i][rotatedArray[0].length-1-m] = imageMatrix[m][i];
			}
		}
		return rotatedArray;
	}
	
	public static void displayArray(String[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	private static String createString(int i, int m) {
		StringBuilder strB = new StringBuilder();
		strB.append("" + i + i + m + m);
		String str = strB.toString();

		return str;
	}
}
