
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = 0;
        int max = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            integer = Integer.valueOf(parts[1]);
            
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println("Age of the oldest: " + max);
    }
}
