
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum =  number1 + number2;
        
        double sqrt = Math.sqrt(sum);
        System.out.println(sqrt);
    }
}
