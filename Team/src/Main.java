import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problems = scanner.nextInt();
        int p, v, t;
        int sum = 0;

        for (int i = 0; i < problems; i++) {
            p = scanner.nextInt();
            v = scanner.nextInt();
            t = scanner.nextInt();
            if(p + v + t >= 2){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
