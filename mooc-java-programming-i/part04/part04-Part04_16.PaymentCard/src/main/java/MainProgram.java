
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul:" + paulsCard);
        System.out.println("Matt:" + mattsCard);
        
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul:" + paulsCard);
        System.out.println("Matt:" + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();        
        mattsCard.addMoney(50);

        System.out.println("Paul:" + paulsCard);
        System.out.println("Matt:" + mattsCard);
        
//        card.eatAffordably();
//        System.out.println(card);
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);

//        card.eatHeartily();
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);

//        card.addMoney(15);
//        System.out.println(card);
//
//        card.addMoney(10);
//        System.out.println(card);
//
//        card.addMoney(200);
//        System.out.println(card);
//
//        System.out.println("Paul: " + card);
//        card.addMoney(-15);
//        System.out.println("Paul: " + card);
    }
}
