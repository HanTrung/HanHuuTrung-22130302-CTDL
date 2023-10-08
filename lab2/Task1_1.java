package tuan2;

public class Task1_1 {
	public static int getSn1(int n) {

		if (n == 1) {
			return 1;
		}

		else {
			int re = ((n % 2 == 0) ? -1 : 1) * n;
			return re + getSn1(n - 1);
		}
	}

	public static int getSn2(int n) {
		if (n == 1) {
			return 1;
		} else {
			int re = 1;
			for (int i = 1; i <= n; i++) {
				re *= i;
			}
			return re + getSn2(n - 1);
		}
	}

	public static int getSn3(int n) {
		if (n == 1)
			return 1;
		else {
			return n * n + getSn3(n - 1);
		}
	}

	public static int getSn4(int n) {
		if (n == 1)
			return 1;
		else {
			int re = 1;
			for (int i = 1; i < n; i++) {
				re *= 2 * n;
			}
			return 1/re + getSn4(n-1);
		}
	}

	public static void main(String[] args) {
		int k = 3;
		System.out.println(getSn4(k));
	}

}
