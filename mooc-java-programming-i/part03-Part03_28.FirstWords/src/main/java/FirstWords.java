
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] inputSplit = input.split(" ");
            for (String i: inputSplit) {
                if (i == inputSplit[0]) {
                    System.out.println(i);
                }
            }
        }

    }
}
