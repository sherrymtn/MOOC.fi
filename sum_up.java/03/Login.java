
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String[] user = {"alex", "emma"};
        String[] pass = {"sunshine", "haskell"};
        
        
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter password: ");
        String passWord = scanner.nextLine(); 
        
        boolean valid = false;
        for(int i = 0; i < user.length; i++){
            if (user[i].equals(userName) && pass[i].equals(passWord)) {
                valid = true;
            }
        }
        if (valid == true) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
