import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.deleteCharAt(0);

        if(s.length() <= Math.pow(10, 3)){
            String x = String.valueOf(s.charAt(0));
            StringBuilder finalString = new StringBuilder(x.toUpperCase());
            finalString.append(stringBuilder);
            System.out.println(finalString);
        }
    }
}
