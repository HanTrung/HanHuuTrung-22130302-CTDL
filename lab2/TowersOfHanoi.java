package tuan2;

public class TowersOfHanoi {

    public static void main(String[] args) {
        int n = 3; 
        char source = 'A'; 
        char auxiliary = 'B'; 
        char destination = 'C'; 

        System.out.println("Bước di chuyển để giải quyết bài toán Towers of Hanoi:");
        solveHanoi(n, source, auxiliary, destination);
    }

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Di chuyen dia 1 tu thap " + source + " den thap " + destination);
            return;
        }

        solveHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Di chuyen dia " + n + " tu thap " + source + " den thap " + destination);

        solveHanoi(n - 1, auxiliary, source, destination);
    }
}
