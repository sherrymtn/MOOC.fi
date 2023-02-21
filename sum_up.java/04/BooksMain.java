import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> booklist = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = input.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            
            System.out.print("Publication: ");
            int year = Integer.valueOf(input.nextLine());
            
            booklist.add(new Book(title, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String userAsk = input.nextLine();
        for(Book all: booklist) {   
            if (userAsk.equals("everything")) {
                System.out.println(all);
            } else if (userAsk.equals("name")) {
                System.out.println(all.getTitle());
            }
        }
    }
}
