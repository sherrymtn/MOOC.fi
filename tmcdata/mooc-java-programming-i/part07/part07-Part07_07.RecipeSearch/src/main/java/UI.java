import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public UI(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.print("Files to read: ");
        String file = scanner.nextLine();
        fileRead(file);
        commandList();
     }

      private void commandList() {
        // printing command lists
        System.out.println("\nCommands: \n" + "list - lists the recipes\n" 
                 + "stop - stops the program\n" + "find name - searches "
                 + "recipes by name\n" + "find cooking time - searches "
                 + "recipes by cooking time\n" + "find ingredient - "
                 + "searches recipes by ingredient\n");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("list")) {
              listCommand(recipes, command);
            } else if (command.equals("find name")) {
                searchByName();
            } else if (command.equals("find cooking time")) {
                searchByTime(recipes, command);
            } else if (command.equals("find ingredient")) {
                searchByIngredients(recipes, command);
            } else if (command.equals("stop")) {
                break;
            }
        }

     }

    private void fileRead(String file) {

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            // storing lines of the file 
            ArrayList<String> fileLines = new ArrayList<>();
            while (fileScan.hasNextLine()) {
                // User starts the program
                String line = fileScan.nextLine();
                if (line.trim().isEmpty() || !fileScan.hasNextLine()) { 
                    // Reading lines: name and time
                    String recipeName = fileLines.get(0);
                    int cookingTime = Integer.valueOf(fileLines.get(1));
                    // storing ingredients to a list
                    ArrayList<String> ingredientsList = new ArrayList<>();
                    for(int i = 2; i < fileLines.size(); i++) {
                        ingredientsList.add(fileLines.get(i));
                    }
                // adding elements to Recipe from reading file lines
                recipes.add(new Recipe(recipeName, cookingTime, ingredientsList));
                // removing fileLines from the file, since its already on a temporary file <Recipe>
                fileLines.removeAll(fileLines);

                } else {
                    fileLines.add(line);
                }
                
            }
            
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        
    }

    // userCommand = list
    private void listCommand(ArrayList<Recipe> recipes, String command) {
        System.out.println("");
        if (command.equals("list")) {
            for (Recipe lists: recipes) {
                System.out.println(lists.getName() + ", cooking time: " + lists.getTime());
            }                    

        }
        System.out.println("");
        
    }

    // userCommand = find cooking time
    private void searchByTime(ArrayList<Recipe> recipes, String command) {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.parseInt(scanner.nextLine());
        System.out.println("\nRecipes: ");
        for (Recipe time: recipes) {
            if (time.getTime() <= maxTime) {
                System.out.println(time.getName() + ", cooking time: " + time.getTime());
            }
        }
        System.out.println("");
    }

    // userCommand = find name
    private void searchByName() {
        System.out.print("Searched word: ");
        String searchName = scanner.nextLine();
        System.out.println("\nRecipes: ");
        for (Recipe names: recipes) {
            if (names.getName().contains(searchName)) {
                System.out.println(names.getName() + ", cooking time: " + names.getTime());
            }
        }
        System.out.println("");
    }

    // userCommand = find ingredient
    private void searchByIngredients(ArrayList<Recipe> recipes, String command) {
        System.out.print("Ingredient: ");
        String searchIng = scanner.nextLine();
        System.out.println("\nRecipes: ");
        for (Recipe ingList: recipes) {
            if (ingList.getIngredients().contains(searchIng)) {
                System.out.println(ingList.getName() + ", cooking time: " + ingList.getTime());
            }
        }
        System.out.println("");
   }
    
}

        
    