import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stacks.isEmpty();
    }

    public void add(String value) {
        this.stacks.add(value);
    }

    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        return stacks;
    }

    public String take() {
        String taken = stacks.get(stacks.size() - 1);
        stacks.remove(taken);
        return taken;
    }

}
