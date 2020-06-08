import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = scanner.nextInt();
        int heightOfFence = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int heightOfPerson = scanner.nextInt();
            if(heightOfPerson > heightOfFence){
                sum += 2;
            }else{
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
