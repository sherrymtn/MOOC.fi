import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
public class Recipe {
    
    private ArrayList<String> ingredients;
    private String name;
    private int time;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
         this.name = name;
         this.time = time;
         this.ingredients = ingredients;
    }
        
    public String getName() {
        return name;
    }
    
    public int getTime() {
        return time;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
}
