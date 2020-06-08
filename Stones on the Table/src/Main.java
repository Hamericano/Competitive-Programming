import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stones = scanner.nextInt();
        String x = scanner.next();
        int moves = 0;
        int i = 0;
        int y = x.length() - 1;
        while(y != 0){
            if(x.charAt(i) == x.charAt(i + 1)){ moves++; }
            i++;
            y--;
        }
        System.out.println(moves);
    }
}
