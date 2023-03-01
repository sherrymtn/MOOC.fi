import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokeManager = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands list: " + "\n" + "1 - add joke" + "\n" +
                    "2 - draw joke" + "\n" + "3 - list jokes" + "\n" + "X - stop");
            System.out.print("\n" + "Command: ");
            String cmd = scanner.nextLine();
            if (cmd.equals("X")) {
                break;
            }

            if (cmd.equals("1")) {
                addJoke();

            } else if (cmd.equals("2")) {
                drawJoke();

            } else if (cmd.equals("3")) {
                listOfJOkes();

            } else {
                System.out.println("Command not listed");
            }

        }
    }

    private void listOfJOkes() {
        System.out.println("Printing the jokes: ");
        jokeManager.printJokes();
    }

    private void drawJoke() {
        System.out.println("Drawing a joke.");
        jokeManager.drawJoke();
    }

    private void addJoke() {
        System.out.println("Write the joke to be added: ");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
        
    }
}
