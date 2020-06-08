import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String function(String s) {
        List<Character> charsUpper = new ArrayList<>();
        List<Character> charsLower = new ArrayList<>();
        boolean b1;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            b1 = Character.isUpperCase(character);
            if (b1) {
                charsUpper.add(character);
            } else {
                charsLower.add(character);
            }
        }
        String finalString;
        if (charsLower.size() > charsUpper.size()) {
            finalString = s.toLowerCase();
        } else if (charsLower.size() < charsUpper.size()) {
            finalString = s.toUpperCase();
        } else {
            finalString = s.toLowerCase();
        }
        return finalString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String finalString = function(s);
        System.out.println(finalString);
    }
}
