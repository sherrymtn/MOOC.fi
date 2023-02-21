
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int last = scanner.nextInt();
        
        int sum = 0;
               
        while (input <= last) {
            sum = sum + input;
            input++;
        }
        System.out.println("The sum is " + sum);
        
    }
}
