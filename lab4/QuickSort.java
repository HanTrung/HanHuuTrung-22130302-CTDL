package tuan4;

import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = getPivotMedianOfThree(array, left, right);
            int partitionIndex = partition(array, left, right, pivot);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        int pivotValue = array[pivot];
        swap(array, pivot, right);
        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] < pivotValue) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, right);
        return partitionIndex;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static int getPivotMedianOfThree(int[] array, int left, int right) {
        int mid = left + (right - left) / 2;
        int a = array[left];
        int b = array[mid];
        int c = array[right];

        if ((a < b && b < c) || (c < b && b < a)) {
            return mid;
        } else if ((b < a && a < c) || (c < a && a < b)) {
            return left;
        } else {
            return right;
        }
    }

    private static int getPivotFirst(int[] array, int left, int right) {
        return left;
    }

    private static int getPivotLast(int[] array, int left, int right) {
        return right;
    }

    private static int getPivotRandom(int[] array, int left, int right) {
		Random rand = new Random();
        return rand.nextInt(right - left + 1) + left;
    }
}

