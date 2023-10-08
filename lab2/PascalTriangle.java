package tuan2;

import java.util.Arrays;

public class PascalTriangle {

	public static int pascalValue(int row, int col) {
		if (col == 0 || col == row) {
			return 1;
		} else {
			return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col);
		}
	}

	public static void printPascalTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascalValue(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int[] getPascalTriangle(int n) {
		int[] row = new int[n];
	    for (int i = 0; i < n; i++) {
	        row[i] = pascalValue(n - 1, i); 
	    }

	    return row;
	}

	public static int[] generateNextRow(int[] prevRow) {
		int n = prevRow.length;
	    int[] nextRow = new int[n + 1]; 

	    nextRow[0] = 1;
	    nextRow[n] = 1;

	    for (int i = 1; i < n; i++) {
	        nextRow[i] = prevRow[i - 1] + prevRow[i];
	    }

	    return nextRow;
	}
	public static void main(String[] args) {
		int k=10;int n=3;
		//printPascalTriangle(k);
		System.out.println(Arrays.toString(getPascalTriangle(n)));
		
	}

}
