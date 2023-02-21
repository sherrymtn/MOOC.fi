public class Gauge {
    private int variable;
    
    public Gauge() {
        this.variable = 0;
    }
    
    public void increase() {
        if (variable < 5) {
            variable++;
        }
    }
    
    public void decrease() {
        if (variable > 0) {
            variable--;
        }
    }
    
    public int value() {
        return this.variable;
    }
    
    public boolean full() {
        return this.variable == 5;
    }
    
}
