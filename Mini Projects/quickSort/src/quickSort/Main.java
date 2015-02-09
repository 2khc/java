package quickSort;

public class Main {
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] input = {22,15,43,23,1,34,6,7,12,665,76,8,3};
		
		quickSort.sort(input);
		for(int i:input){
			System.out.print(i);
			System.out.print(" ");
		}
		
	}
}
