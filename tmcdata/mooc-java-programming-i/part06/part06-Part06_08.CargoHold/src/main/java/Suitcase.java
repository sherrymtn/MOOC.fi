import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item all : items) {
            total += all.getWeight();
        }
        return total;
    }

    public void printItems() {
       String toPrint = "";
       for (Item print: items) {
            toPrint += print.toString() + "\n";
       }
       System.out.print(toPrint);
   }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heavy = this.items.get(0);
        for (Item heaviest: this.items) {
            if (heavy.getWeight() < heaviest.getWeight()) {
                heavy = heaviest;
            }
        }
        return heavy;
    }


    public String toString() {
        if (items.isEmpty()) {
            return "no items " + "(" + this.totalWeight() + " kg)";
        }

        if (items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }

}
