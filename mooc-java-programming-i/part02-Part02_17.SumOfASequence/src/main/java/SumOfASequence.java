
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int last = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= last; i++ ) {
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);
        
    }
}
