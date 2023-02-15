
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String user = scanner.nextLine();
            String[] userSplit = user.split(" ");
            
            for (String i: userSplit) {
                if (i.contains("av")){ 
                    System.out.println(i);
                }
            }
            
            if (user.equals("")) {
                break;
            }
        }

    }
}
