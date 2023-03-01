
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public  void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        } 
    }
    
    public void printMeals() {
        for (String list:  meals) {
            System.out.println(list);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }


}
