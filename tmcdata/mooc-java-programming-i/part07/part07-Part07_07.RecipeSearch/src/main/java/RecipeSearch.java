
import java.util.Scanner;

public class RecipeSearch {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      //  Recipe recipe = new Recipe();

       UI userUI = new UI(scanner);
       userUI.start();

   }

}
