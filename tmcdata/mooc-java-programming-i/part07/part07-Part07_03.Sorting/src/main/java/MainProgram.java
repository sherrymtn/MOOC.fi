import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {1, 23, 5, 99, 3, 0};
        // System.out.println("Smallest: " + MainProgram.smallest(array));
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
       
        // indices:       0  1  2  3   4
        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // int[] numbers = {3, 2, 5, 4, 8};
        // System.out.println(Arrays.toString(numbers));
        // MainProgram.swap(numbers, 1, 0);
        // System.out.println(Arrays.toString(numbers));
        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index1) {
                temp = array[i];
            }
        }
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, (indexOfSmallestFrom(array, i)));
            System.out.println(Arrays.toString(array));
        }
    }
    
}
    
