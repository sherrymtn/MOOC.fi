
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.print("Search for? ");
        String userSearch = scanner.next();
        
        if(list.contains(userSearch)) {
            System.out.println(userSearch + " was found!");
        } else {
            System.out.println(userSearch + "was not found!");
        }
    }
}
