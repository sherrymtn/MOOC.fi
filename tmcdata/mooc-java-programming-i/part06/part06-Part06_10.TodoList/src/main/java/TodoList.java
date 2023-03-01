import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> task;


    public TodoList() {
        this.task = new ArrayList<>();
    }

    public void add(String task) {
        this.task.add(task);
    }

    public void print() {
        int index = 1;
        for (String list: task) {
            System.out.println(index + ": " + list);
            index++;
        }
    }

    public void remove(int number) {
        task.remove(number - 1);
    }


}
