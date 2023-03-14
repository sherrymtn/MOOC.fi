import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Grades register;

    public UI(Grades register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readUserInput();
        printAllAverages();
        printGradesDistribution();
    }

    private void readUserInput() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            if (!(input >= 0 && input <= 100)) {
                System.out.println("Out of Range");
                continue;
            }
            this.register.addGradesBasedOnPoints(input);
        }
    }

    private void printAllAverages() {
        System.out.println("Point average (all): " + register.averageOfGrades());
        printAveragesOfPassing();
        System.out.println("Pass percentage: " + register.passingPercentage());
    }

    private void printAveragesOfPassing() {
        if (register.getPassParticipantSize() > 0) {
            System.out.println("Point average (passing): " + register.averageOfPassingGrades());
        } else if (register.getPassParticipantSize() == 0) {
            System.out.println("Point average (passing): -");
        }
    }

    public void printGradesDistribution() {
        int equivalent = 5;
        while (equivalent >= 0) {
            int stars = register.numberOfPoints(equivalent);
            System.out.print(equivalent + ": ");
            printsStars(stars);
            System.out.println("");

            equivalent = equivalent - 1;
        }
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    

}
