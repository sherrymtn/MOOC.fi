
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String empty = "";
        
        
        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(" ");
        
            for (String i: piece) {
                System.out.println(i);
            }
            
            if (text.equals(empty)) {
                break;
            }
        }
    }
}
