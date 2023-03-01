import java.util.ArrayList;

public class Hold {
    private int holdMaxWeight;
    private ArrayList<Suitcase> suitcase;

    public Hold(int holdMaxWeight) {
        this.holdMaxWeight = holdMaxWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalHoldSuitWeight() + suitcase.totalWeight() <= holdMaxWeight) {
            this.suitcase.add(suitcase);
        }
    }

    // to get the total weight of suits in the hold
    public int totalHoldSuitWeight() {
        int totalHoldSuitWeight = 0;
        for (Suitcase holdWeight : suitcase) {
            totalHoldSuitWeight += holdWeight.totalWeight();
        }
        return totalHoldSuitWeight;
    }

    //Printing the list in the suit (name, weight)  using printItems() from Suitcase class
    public void printItems() {
        for (Suitcase list: suitcase) {
            list.printItems();
        }
    }

    public String toString() {
        return this.suitcase.size() + " suitcases (" + this.totalHoldSuitWeight() + " kg)";
    }
}
