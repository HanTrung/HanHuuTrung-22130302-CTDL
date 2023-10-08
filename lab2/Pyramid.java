package tuan2;

public class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        drawPyramid(n);
    }

    public static void drawPyramid(int n) {
        for (int i = 1; i <= n; i++) {
           
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




