package tuan2;

public class ChristmasTree {
    public static void main(String[] args) {
        int n = 4; 
        drawChristmasTree(n);
    }

    public static void drawChristmasTree(int n) {
      
        for (int i = 1; i <= n; i++) {
            drawPyramid(i, n);
        }

        // Vẽ thân cây
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" "); 
            }
            System.out.println("X");
        }
    }

    public static void drawPyramid(int height, int n) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}
