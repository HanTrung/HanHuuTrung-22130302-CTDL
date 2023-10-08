package tuan2;

public class Fibonacci {
	public static int getFibonacci(int n) {
		if (n <= 1)
			return 0;
		else if (n == 2)
			return 1;
		else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);

		}
	}

	public static void prinfFibonacci(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(getFibonacci(i) + ", ");
		}
	}

	public static void main(String[] args) {
		int k = 10;
		prinfFibonacci(k);
	}

}
