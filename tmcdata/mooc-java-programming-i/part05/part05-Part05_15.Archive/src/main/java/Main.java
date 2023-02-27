
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        
       
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identify = scanner.nextLine();
            if(identify.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }


            Archive archive = new Archive(identify, name);
            // archives.add(archive);

            if (!(archives.contains(archive))) {
                archives.add(archive);
            }

        }
        System.out.println("==Items==");
        for (Archive archive: archives) {
            System.out.println(archive);
        }   

    }
}
