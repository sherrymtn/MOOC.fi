
public class Counter {
    private int startValue;
    
    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public void decrease() {
        this.startValue -= 1;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy < 0){
            return;
        } 
        this.startValue -= decreaseBy;
    }
    
    public void increase() {
        this.startValue += 1;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy < 0){
            return;
        }
        this.startValue += increaseBy;
    }
    
    public int value() {
        return startValue;
    }
    
    public String toString() {
        return "Value: " + this.value();
    }
    
}
