
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int space) {
        // part 1 of the exercise
        for (int i = 1; i <= space; i++) {
            System.out.print(" ");
        }
        System.out.print("");
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space = size - 1;
        int star = 1;
        while (space >= 0) {
            printSpaces(space);
            space--;
            printStars(star);                        
            star++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int space = height - 1;
        int star = 1;
        while (space >= 0) {
            printSpaces(space);
            space--;
            printStars((star * 2) - 1);
            star++;
        }
        int space2 = height - 2;
        int  base = 2;
        while (base > 0 ) {
            printSpaces(space2);            
            printStars(3);
            base--;            
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
//        printStars(4);
//        System.out.println("---");
//        printSpaces(4);        
//        System.out.println("---");
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(7);
    }
}
