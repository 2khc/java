package rotateImageMatrix;

public class Main {
	public static void main (String[] args){
		String[][] imageMatrix = Machine.create2dArray(4,4);
		Machine.displayArray(imageMatrix);
		String[][] rotatedMatrix = Machine.rotateArray(imageMatrix);
		
		
		
		System.out.println();
		Machine.displayArray(rotatedMatrix);
	}
}
