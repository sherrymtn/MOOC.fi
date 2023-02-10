
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int to = scanner.nextInt();
        System.out.print("Where from? ");
        int from = scanner.nextInt();
        
        while (from <= to) {
            System.out.println(from);
            from++;
        }
    }
}
