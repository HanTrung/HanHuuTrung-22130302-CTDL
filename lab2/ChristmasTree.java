package tuan2;

public class ChristmasTree {
	public static void main(String[] args) {
		int n = 4;
		drawChristmasTree(n);
	}

	public static void drawChristmasTree(int n) {

		for (int i = 1; i < n; i++) {
			drawPyramid(i);
		}
	}

	public static void drawPyramid(int n) {
		drawPyramidHelper(n, 1);
	}

	public static void drawPyramidHelper(int n, int currentRow) {
		if (currentRow > n) {
			return;
		}

		drawRow(n, currentRow, 1);
		drawPyramidHelper(n, currentRow + 1);
	}

	public static void drawRow(int n, int currentRow, int currentColumn) {
		if (currentColumn > 2 * currentRow - 1) {
			System.out.println();
			return;
		}

		System.out.print("X");
		drawRow(n, currentRow, currentColumn + 1);
	}
}
