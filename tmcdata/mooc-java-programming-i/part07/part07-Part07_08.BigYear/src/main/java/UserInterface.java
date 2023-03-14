import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Birds> bird;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.bird = new ArrayList<>();
    }

    // TODO: start
    public void start() {
        startInput();

    }

    private void startInput() {

        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            // TODO: Add - adds a bird
            if (input.equals("Add")) {
                addBird();

                // TODO: observation - adds an observation
            } else if (input.equals("Observation")) {
                observation();

                // TODO: One - prints one bird
            } else if (input.equals("One")) {
                printOne();

                // TODO: All - prints all bird
            } else if (input.equals("All")) {
                printAll();

            } else if (input.equals("Quit")) {
                break;
            }
        }
    }

    private void printAll() {
        for (Birds list: bird) {
            System.out.println(list.getName() + " (" + list.getNomen() 
                + "): " + list.getObserveCount() + " observations");
        }
    }

    private void printOne() {
        System.out.print("Bird? ");
        String birdName= scanner.nextLine();
        for (Birds lists : bird) {
            if (lists.getName().equals(birdName)) {
                System.out.println(lists.getName() + " (" + lists.getNomen() 
                + "): " + lists.getObserveCount() + " observations");
            }
        }
    }

    private void observation() {
        System.out.print("Bird: ");
        String observe = scanner.nextLine();
        
        for (int i = 0; i < bird.size(); i++) {
            if (bird.get(i).getName().equals(observe)) {
                bird.get(i).addObserveCount();
                return;
            }   
        }
        // This is where i get confused. printing always x birds.size. and i didnt return break the if statement
        System.out.println("Not a bird!");
        
    }

    private void addBird() {

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String nomen = scanner.nextLine();

        bird.add(new Birds(name, nomen));
        
    }

    
}
