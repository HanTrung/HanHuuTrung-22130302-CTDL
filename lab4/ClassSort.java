package tuan4;

import java.util.Arrays;

public class ClassSort {
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = i;
			for (int j = 1 + i; j < array.length - 1 - i; j++) {
				if (array[i] > array[j])
					temp = j;
			}
			if (temp != i) {
				int t = array[temp];
				array[temp] = array[i];
				array[i] = t;

			}
			System.out.println(Arrays.toString(array));
		}
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int t = array[j];
					array[j] = array[j - 1];
					array[j - 1] = t;
				}
			}
			System.out.println(Arrays.toString(array));

		}

	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int t = array[i];
			int j = i - 1;

			while (j >= 0 && t < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = t;
			System.out.println(Arrays.toString(array));

		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 9, 11, 7 };
		insertionSort(arr);

	}

	public static void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {

			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

}
