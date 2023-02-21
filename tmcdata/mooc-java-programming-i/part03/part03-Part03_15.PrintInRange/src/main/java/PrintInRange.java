
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        printNumbersInRange(numbers, 3, 10);
        
    }
    // Try your method here
    public static void printNumbersInRange(ArrayList<Integer> numbers, int i, int i0) {        
        for (int number: numbers) {
            if (number >= i && number <= i0) {
                System.out.println(number);
            }
        }
    }
        
        
        
    
    
}
