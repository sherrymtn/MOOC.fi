import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) { 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Maximum duration of the program: ");
        int durationLimit = scanner.nextInt();
        
        for (TelevisionProgram tvlist: programs) {
            if (tvlist.getDuration() <= durationLimit) {
                System.out.println(tvlist);
            }
        }
    }
}
