
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First name: ");
            String userFirstName = scanner.nextLine();
            if (userFirstName.isEmpty()) {
                break;           
            }
            
            System.out.println("Last Name: ");
            String userLastName = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String userId = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(userFirstName, userLastName, userId));
        }
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
