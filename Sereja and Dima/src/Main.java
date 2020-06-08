import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cards = scanner.nextInt();
        int S = 0, D = 0;
        List<Integer> pack = new ArrayList<>();
        for (int i = 0; i < cards; i++) {
            pack.add(scanner.nextInt());
        }
        while (pack.size() > 0) {
            int max = Math.max(pack.get(0), pack.get(pack.size() - 1));
            S += max;
            pack.remove((Integer) max);

            if (!pack.isEmpty()) {
                int max1 = Math.max(pack.get(0), pack.get(pack.size() - 1));
                D += max1;
                pack.remove((Integer) max1);
            }
        }
        System.out.println(S + " " + D);
    }
}
