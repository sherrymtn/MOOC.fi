import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private int passingParticipants;

    public Grades() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.passingParticipants = 0;
    }

    public void addGradesBasedOnPoints(int points) {
        this.grades.add(equivalent(points));
        this.points.add(points);
    }

    public int getPassParticipantSize() {
        return passingParticipants;
    }

    public int sum() {
        int sum = 0;
        for (int lists: points) {
            sum += lists;
        }
        return sum;
    }

    public double averageOfGrades() {
        return 1.0 * sum() / points.size();
    }

    public int sumOfPassing() {
        int sumOfPassing = 0;
        
        for (int passlist: points) {
            if (passlist >=  50) {
                sumOfPassing += passlist;
            }
        }
        return sumOfPassing;
    }

    public double averageOfPassingGrades() {
       return 1.0 * (sumOfPassing()) / passingParticipants;
    }            
    
    public double passingPercentage() {
        return 100.0 * (passingParticipants) / points.size();
    }

    public int numberOfPoints(int equivalent) {
        int count = 0;
        for (int received: this.grades) {
            if (received == equivalent) {
                count++;
            }
        }
        return count;
    }

    private int equivalent(int points) {
        if (points >= 50) {
            this.passingParticipants += 1;
        }
        int equivalent = 0;
        if (points < 50) {
            equivalent = 0;
        } else if (points < 60) {
            equivalent = 1;
        } else if (points < 70) {
            equivalent = 2;
        } else if (points < 80) {
            equivalent = 3;
        } else if (points < 90) {
            equivalent = 4;
        } else if (points >= 90) {
            equivalent = 5;
        }

        return equivalent;

    }
}
