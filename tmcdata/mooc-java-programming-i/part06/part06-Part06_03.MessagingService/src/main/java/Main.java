import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Scanner scan = new Scanner(System.in);
        System.out.print("Sender:");
        String senderWho = scan.nextLine();
        System.out.print("Message: ");
        String content = scan.nextLine();

        Message toSend = new Message(senderWho, content);

        MessagingService sending = new MessagingService();

        sending.add(toSend);
        System.out.println(sending.getMessages());
        System.out.println("Message sent!");
    }
}
