
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

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
        
   
        for (int i = list.size() - 1; i >= 0 ; i--) {
            String say = list.get(i);
            if (i + 1 == list.size()) {
                System.out.println(say);          
            }
        }
        
        System.out.println(list.get(list.size() - 1));
    }
}
