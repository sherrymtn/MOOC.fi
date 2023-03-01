import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();;
    
    public JokeManager() {
       
    }
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } 
        Random rand = new Random();
        int randomJoke = rand.nextInt(this.jokes.size());
        System.out.println(this.jokes.get(randomJoke));
        return this.jokes.get(randomJoke);
    }

    public void printJokes() {
        for (String jokeList: jokes) {
            System.out.println(jokeList);
        }
        
    }
}
