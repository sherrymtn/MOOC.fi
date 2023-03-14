
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add") && (amount >= 0)) {
                if (first + amount > 100) {
                    first = 100;
                } else {
                    first += amount;
                }              
              
            }
            if (command.equals("move") && (amount >= 0)) {
                if ((amount + second >= 100) ) {
                    first = 0;
                    second = 100;
                } else if (amount > first) {
                    second += first;
                    first = 0;
                } else {
                    second += amount;
                    first -= amount;
                }
            }
            if (command.equals("remove") && (amount >= 0)) {
                if ((second - amount >= 100) ) {
                    second = 0;
                } else if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }
        
        }

        
    }
    
}
