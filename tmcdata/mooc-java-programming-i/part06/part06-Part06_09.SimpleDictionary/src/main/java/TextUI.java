import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    // private ArrayList<Dictionary> wordsStored;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
        // this.wordsStored = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            takeCommand(command);
        }
            System.out.println("Bye bye");
    }
    
    private void takeCommand(String command) {
        if (command.equals("add")) {
            add();

        } else if (command.equals("search")) {
            toTranslate();

        } else {
            System.out.println("Unknow command");
        }
    }

    private void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translate = scanner.nextLine();
        dictionary.add(word, translate);
    }

    private void toTranslate() {
        System.out.print("To be translated: ");
        String toTranslate = scanner.nextLine();
        if (dictionary.translate(toTranslate) != null) {
            System.out.print("Translation: ");
            System.out.println(dictionary.translate(toTranslate));
        } else {
            System.out.println("Word " + toTranslate + " was not found");
        }
    }

    }





















    public void start() {

        while (true) {
            String toTranslate = "";
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

                // Adding the word and translation to the dictionary
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translate = scanner.nextLine();
                dictionary.add(word, translate);

                // Searching in the dictionary
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                toTranslate = scanner.nextLine();
                
                // Printing the translation
                // if the dictionary turns null
                if (dictionary.translate(toTranslate) != null) {
                    System.out.print("Translation: ");
                    System.out.println(dictionary.translate(toTranslate));
                } else {
                    System.out.println("Word " + toTranslate + " was not found");
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
