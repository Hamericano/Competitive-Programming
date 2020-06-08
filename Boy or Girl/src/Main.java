import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> characters = new ArrayList<>();
        String x = scanner.next();

        if(x.length() <= 100){
            for (int i = 0; i < x.length(); i++) {
                characters.add(String.valueOf(x.charAt(i)));
            }
        }

        List<String> noDuplicates = new ArrayList<>(new HashSet<String>(characters));

        if(noDuplicates.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
