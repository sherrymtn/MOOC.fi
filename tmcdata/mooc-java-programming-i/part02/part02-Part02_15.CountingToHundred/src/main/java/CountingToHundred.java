
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }
}
