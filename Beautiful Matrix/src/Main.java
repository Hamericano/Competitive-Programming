
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        int i, j, moves = 0;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (matrix[i][j] == 1) {
                    moves = moves + Math.abs(i - 3) + Math.abs(j - 3);
                    break;
                }
            }
        }
        System.out.println(moves);
    }
}
