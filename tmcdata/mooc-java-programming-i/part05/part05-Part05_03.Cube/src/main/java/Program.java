
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.println("Length of the Cube: ");
        String length = scanner.nextLine();
        Cube c = new Cube(Integer.valueOf(length));
        System.out.println(c);

    }
}
