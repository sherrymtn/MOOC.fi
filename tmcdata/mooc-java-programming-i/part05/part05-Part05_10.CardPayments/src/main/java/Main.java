
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
                //PART ONE  
//        PaymentCard petesCard = new PaymentCard(10);
//
//        System.out.println("money " + petesCard.balance());
//        boolean wasSuccessful = petesCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());
//
//        wasSuccessful = petesCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + petesCard.balance());


                //part TWO  
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = unicafeExactum.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(unicafeExactum);

                //part THREE
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//
//        double change = unicafeExactum.eatAffordably(10);
//        System.out.println("remaining change: " + change);
//
//        PaymentCard annesCard = new PaymentCard(7);
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println(unicafeExactum);
    
                //part FOUR
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}

