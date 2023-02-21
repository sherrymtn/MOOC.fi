
public class PaymentCard {
    private double balance;
    
    
    public PaymentCard(double openingbalance) {
        this.balance = openingbalance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        if (this.balance - 2.6 < 0) {
            this.balance = this.balance;
        } else {
            this.balance -= 2.6;
        }
    }
    
    public void eatHeartily() {
       
        if (this.balance - 4.6 < 0) {
            this.balance = this.balance;
        } else {
            this.balance -= 4.6;
        }
    }
    
    public void addMoney(double money) {
        if (money < 0) {
           return;
        }
        
        this.balance += money;
        if (this.balance + money > 150) {
                this.balance = 150;
        }
    }
}
