package tuan5;

import java.util.Arrays;

public class matrix {
	public static int[][] add(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}

		return result;

	}

	public static int[][] subtract(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}

		return result;

	}

	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < a.length; k++) {
					sum = a[i][k] + b[k][i];
				}
				result[i][j] = sum;
			}
		}

		return result;

	}
	public static int[][] transpose(int[][] a) {
		int[][] result=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				result[j][i]=a[i][j];
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] m2 = { { 21, 23 }, { 34, 43 }, { 53, 54 }, { 41, 42 } };
		System.out.println(Arrays.deepToString(multiply(m1, m2)));
		System.out.println(Arrays.deepToString(transpose(m1)));
	}

}
