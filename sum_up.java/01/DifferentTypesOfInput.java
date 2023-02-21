
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String text = scan.nextLine();
        
        System.out.println("Give an integer: ");
        int number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double: ");
        double point = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean trueOrfalse = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + point);
        System.out.println("You gave the boolean " + trueOrfalse);
        

    }
}
