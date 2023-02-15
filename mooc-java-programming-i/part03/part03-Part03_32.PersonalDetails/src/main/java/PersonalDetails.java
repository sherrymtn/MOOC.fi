
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count = 0;
        int longest = 0;
        
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            //Average of birth years
            String[] parts = input.split(",");
            int birthYear = Integer.valueOf(parts[1]);
            sum += birthYear;
            count++;
            
            //Longest
            int lengthCount = parts[0].length();
            if (longest < lengthCount) {
                longest = lengthCount;
                name = parts[0];
            }    
        }
        
        System.out.println("Longest name: " + name);
        
        if (count > 0) {
            System.out.println("Average of the birth years: " + 1.0 * sum / count);
        }

    }
}
