import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    //  This solution doesn't work because the parameter will not be the same with the ones on Main (parameterless)
    // public int totalWeight(Gift gift) {
    //     int sum = 0;
    //     sum += gift.getWeight();
    //     return sum;
    // }

    // this one works. it cycles through the list of gift where
    //gifts already contains the weight, it just needed to get the weigth;
    public int totalWeight() {
        int totalKg = 0;
        for (Gift list: gifts) {
            totalKg += list.getWeight();
        }
        return totalKg;
    }

}
