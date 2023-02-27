
public class Main {

    public static void main(String[] args) {
        SimpleDate now = new SimpleDate(30, 12, 2011);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(5);

        System.out.println("After one week: " + afterOneWeek);
    }
}