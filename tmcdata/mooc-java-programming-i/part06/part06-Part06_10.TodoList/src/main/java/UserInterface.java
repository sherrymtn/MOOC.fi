import java.util.Scanner;

public class UserInterface {
    private TodoList task;
    private Scanner input;

    public UserInterface(TodoList task, Scanner input) {
        this.task = task;
        this.input = input;
    }

    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String cmd = input.nextLine();
            if (cmd.equals("stop")) {
                break;
            }

            command(cmd);           
        }
    }

    private void command(String cmd) {
        if (cmd.equals("add")) {
            add();

        }  else if (cmd.equals("list")) {
            list();

        } else if (cmd.equals("remove")) {
            remove();
        } else {
            System.out.println("Command not listed");
        }
    }

    private void add() {
        System.out.print("To add: ");
        String toAdd = input.nextLine();
        task.add(toAdd);
    }

    private void list() {
        task.print();
    }

    private void remove() {
        System.out.print("which one is removed? ");
        int numberRemove = Integer.valueOf(input.nextLine());
        task.remove(numberRemove);
    }

}
