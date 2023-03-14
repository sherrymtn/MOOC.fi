public class Container {
    private int container;

    public Container() {
        
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (this.container + amount >= 100) {
            this.container = 100;
        } else if (amount > 0) {
            this.container += amount;
        }
    }

    public void remove(int amount) {
        if (this.container - amount < 0) {
            this.container = 0;
        } else if (amount > 0) {
            this.container -= amount;
        }
    }

    public String toString() {
        return this.container + "/100";
    }
}
