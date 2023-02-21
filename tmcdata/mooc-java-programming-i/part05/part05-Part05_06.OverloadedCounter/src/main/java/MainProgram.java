
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counters = new Counter(0);
        System.out.println(counters);
        counters.increase(3);
        System.out.println(counters);
        counters.increase(2);
        counters.increase(-2);
        System.out.println(counters);
        counters.decrease();
        System.out.println(counters);
        counters.increase(1);
        System.out.println(counters);
        counters.decrease(-10);
        System.out.println(counters);
    }
}
