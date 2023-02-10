
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int input = scanner.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
