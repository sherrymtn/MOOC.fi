
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where? ");
        int from = scanner.nextInt();
        System.out.print("To where? ");
        int to = scanner.nextInt();
        
//        System.out.println(numbers.get(numbers.size() -1 - to));
//        System.out.println(numbers.get(numbers.size() - 1 -from));
        
        for (int i = from; i <= numbers.size() - 1; i++) {
            int input = numbers.get(i);
            if (i <= to) {
            System.out.println(input);
            }
        }
    }
}
