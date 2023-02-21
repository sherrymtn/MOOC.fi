
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        while (true) {
            int n = scanner.nextInt();
            
            if (n == 0) {
                break;
            }
            
            if (n > 0) {
                count = count + 1;
                sum = sum + n;       
            } 
        }
        
        if (count <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / count);
        }
    }
}
