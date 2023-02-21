
public class Games {
    private String home;
    private String visit;
    private int homeScore;
    private int visitScore;
    
    public Games(String team1, String team2, int score1, int score2) {
        this.home = team1;
        this.visit = team2;
        this.homeScore = score1;
        this.visitScore = score2;
    }
    
    public String getHome(){
        return home;
    }
    
    public String getVisit(){
        return visit;
    }
    
    public int getHomeScore(){
        return homeScore;
    }
    
    public int getVisitScore(){
        return visitScore;
    }
    
//     @Override
//    public String toString() {
//        return this.home;
//    }

}
