
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

                 // PART ONE
        // Suitcase suitcase1 = new Suitcase(5);
        // System.out.println(suitcase1);

        // suitcase1.addItem(book);
        // System.out.println(suitcase1);

        // suitcase1.addItem(phone);
        // System.out.println(suitcase1);

        // suitcase1.addItem(brick);
        // System.out.println(suitcase1);

        // Suitcase suitcase = new Suitcase(10);
        // suitcase.addItem(book);
        // suitcase.addItem(phone);
        // suitcase.addItem(brick);

                    //PART TWO
        // System.out.println("The suitcase contains the following items:");
        // suitcase.printItems();
        // System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        // Item heaviest = suitcase.heaviestItem();
        // System.out.println("Heaviest item: " + heaviest);

    }

}
