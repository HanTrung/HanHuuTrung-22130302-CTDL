package tuan3;

import java.util.Arrays;
import java.util.Collections;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// iterativeLinearSearch
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target)
				return i;
		}
		return -1;
	}

	// recursiveLinearSearch
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearch(target, 0);

	}

	public int recursiveLinearSearch(int target, int n) {
		if (n > array.length - 1)
			return -1;
		if (target == array[n])
			return n;
		return recursiveLinearSearch(target, n + 1);
	}

	// iterativeBinarySearch
	public int iterativeBinarySearch(int target) {
		Arrays.sort(array);
		int mid = array.length / 2;
		if (target > mid) {
			for (int i = mid + 1; i < array.length; i++) {
				if (target == array[i])
					return i;
			}
		}
		if (target < mid) {
			for (int i = mid - 1; i > 0; i--) {
				if (target == array[i])
					return i;
			}
		}
		if (target == mid)
			return array[mid];
		return -1;
	}

	// recursiveBinarySearch
	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearch(target, 0, array.length - 1);
	}

	public int recursiveBinarySearch(int target, int l, int r) {
		if (l <= r) {
			int mid = l + (r - l) / 2;

			if (array[mid] == target) {
				return mid;
			}

			if (array[mid] > target) {
				return recursiveBinarySearch(target, l, mid - 1);
			}

			return recursiveBinarySearch(target, mid + 1, r);
		}

		return -1;

	}

	// iterativeBinarySearchSorted
	public int iterativeBinarySearchSorted(int target) {
		Arrays.sort(array);
		Collections.reverse(Arrays.asList(array));
		int mid = array.length / 2;
		if (target > mid) {
			for (int i = mid + 1; i < array.length; i++) {
				if (target == array[i])
					return i;
			}
		}
		if (target < mid) {
			for (int i = mid - 1; i > 0; i--) {
				if (target == array[i])
					return i;
			}
		}
		if (target == mid)
			return array[mid];
		return -1;
	}

	// recursiveBinarySearchSorted
	public int recursiveBinarySearchSorted(int target) {
		return recursiveBinarySearchSorted(target, 0, array.length - 1);
	}

	public int recursiveBinarySearchSorted(int target, int l, int r) {
		Arrays.sort(array);
		Collections.reverse(Arrays.asList(array));
		if (l <= r) {
			int mid = l + (r - l) / 2;

			if (array[mid] == target) {
				return mid;
			}

			if (array[mid] > target) {
				return recursiveBinarySearch(target, l, mid - 1);
			}

			return recursiveBinarySearch(target, mid + 1, r);
		}

		return -1;

	}

	public static void main(String[] args) {
		int[] ar = { 12, 10, 9, 45, 2, 10, 10, 45 };
		MyArray myArray = new MyArray(ar);
		System.out.println(myArray.iterativeLinearSearch(45));
		System.out.println(myArray.recursiveLinearSearch(15));
		System.out.println(myArray.iterativeBinarySearch(156));
	}
}
