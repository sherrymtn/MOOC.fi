

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);     
    }

    public static void printFromNumberToOne(int print) {
        int i = print;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

}
