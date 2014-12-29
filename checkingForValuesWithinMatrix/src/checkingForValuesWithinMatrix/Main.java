package checkingForValuesWithinMatrix;

public class Main {
	public static void main(String[] args) {
		int[][] randomMatrix = Machine.generateRandomMatrix(10, 10);
		Machine.displayMatrix(randomMatrix);
		
		boolean containsZero = Machine.zeroCheck(randomMatrix);
		System.out.println();
		
		if (containsZero == true) {
			int[][] zeroMatrix = Machine.setToZero(randomMatrix);
			Machine.displayMatrix(zeroMatrix);
		} else {
			System.out.println("Matrix does not contain any zeros");
		}
		
	}
}
