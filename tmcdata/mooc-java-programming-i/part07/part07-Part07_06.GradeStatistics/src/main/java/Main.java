
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades register = new Grades();
        
            // Write your program here -- consider breaking the program into 
            // multiple classes.
        UI userInterface = new UI(register, scanner);
        userInterface.start();
        
        scanner.close();
    
        
    }
}
