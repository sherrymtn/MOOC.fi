
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String userTeam = scan.nextLine();
        
        ArrayList<Games> data = new ArrayList<>();
        
        int count = 0;
        int winCount = 0;
        int lossCount = 0;
        try (Scanner input = new Scanner(Paths.get(file))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
               
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                
                data.add(new Games(homeTeam, visitTeam, homePoints, visitPoints));
                if (homeTeam.contains(userTeam) || visitTeam.contains(userTeam)) {
                    count++;
                }
                
                //IF userTEAM is the HOME
                if(userTeam.equals(homeTeam)) {
                    if (homePoints > visitPoints) {
                        winCount++;
                    } else {
                        lossCount++;
                    }
                }
                //IF userTEAM is the VISITOR
                if(userTeam.equals(visitTeam)) {
                    if (homePoints > visitPoints) {
                        lossCount++;
                    } else {
                        winCount++;
                    }
                }
                    
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
        System.out.println("");
        
    }

}
