package mergeSort;

public class Mergesort {
	private int[] numbers;
	private int[] helper;

	private int number;

	public void sort(int[] values) {
		this.numbers = values;
		this.number = values.length;
		this.helper = new int[this.number];
		this.mergesort(0, number - 1);
	}

	private void mergesort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;

			mergesort(low, middle);

			mergesort(middle + 1, high);

			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			this.helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = high;

		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				this.numbers[k] = this.helper[i];
				i++;
			} else {
				this.numbers[k] = this.helper[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			this.numbers[k] = this.helper[i];
			k++;
			i++;
		}
	}
}
