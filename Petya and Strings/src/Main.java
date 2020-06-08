import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a, b;
        a = scanner.next();
        b = scanner.next();
        if (((a.length() >= 1) && (a.length() <= 100)) && ((b.length() >= 1) && (b.length() <= 100))) {
            if (a.equalsIgnoreCase(b)) {
                System.out.println("0");
            } else {
                for (int i = 0; i < a.length(); i++) {
                    if (a.toLowerCase().charAt(i) > b.toLowerCase().charAt(i)) {
                        System.out.println("1");
                        break;
                    } else if (a.toLowerCase().charAt(i) < b.toLowerCase().charAt(i)) {
                        System.out.println("-1");
                        break;
                    }
                }
            }
        }
    }
}
