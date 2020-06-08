import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnets = scanner.nextInt();
        int groups = 1;
        String allMagnets = "";
        StringBuilder stringBuilder = new StringBuilder(allMagnets);

        for (int i = 1; i <= magnets; i++) {
            String x = scanner.next();
            stringBuilder.append(x);
        }

        for (int i = 2; i < stringBuilder.length(); i += 2) {
            if (stringBuilder.charAt(i - 2) != stringBuilder.charAt(i)) {
                groups++;
            }
        }
        System.out.println(groups);
    }
}
