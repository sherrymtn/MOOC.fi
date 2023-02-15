
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        
       //MY SOLUTION! I FORGOT AGAIN THE TECHNIQUE FOR USING THE LAST INPUT
//       int count = 0;
//        for(String first: strings) {
//            if (count < strings.size() - 1) {
//                String printLast = strings.get(count);
//                count++;
//            }
//            
//        } 

        // THIS IS THE TECHNIQUE!!!  >> int last = strings.size - 1;
        if (!strings.isEmpty()) {   // --- to stop error of an empty list
            int last = strings.size() - 1;
            strings.remove(last);
        }
        
    }

}
