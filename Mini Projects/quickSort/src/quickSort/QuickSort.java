package quickSort;

public class QuickSort {
	private int[] array;
	private int length;

	public void sort(int[] inputArray) {
		if (inputArray == null || inputArray.length == 0) {
			return;
		}

		this.array = inputArray;
		this.length = inputArray.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;

		// calculate pivot number which is the middle index number
		int pivot = this.array[lowerIndex + (higherIndex - lowerIndex) / 2];

		// divide into two arrays
		while (i <= j) {
			// in each iteration, a number is identified from the left side
			// which is greater than pivot value. We will also identify a value
			// from the right side which is less than the pivot value. Once
			// search is complete the numbers are exchanged.
			while (this.array[i] < pivot) {
				i++;
			}
			while (this.array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				this.exchangeNumbers(i, j);
				// move the index to the next position on both sides
				i++;
				j--;
			}
		}

		// call quickSort recursively
		if (lowerIndex < j) {
			this.quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}
	}
	
	private void exchangeNumbers(int i, int j){
		int temp = this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = temp;
	}
	
	
}
