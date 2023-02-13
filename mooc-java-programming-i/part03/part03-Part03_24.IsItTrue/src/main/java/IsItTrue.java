
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isIt = scanner.next();
        String word = "true";
        
        if (word.equals(isIt)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
