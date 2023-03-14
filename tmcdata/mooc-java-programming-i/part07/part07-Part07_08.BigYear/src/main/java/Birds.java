
public class Birds {
    //TODO: list of birds
    private String birdName;
    private String nomen;
    private int observations;

    public Birds(String name, String nomen) {
        this.birdName = name;
        this.nomen = nomen;
        this.observations = 0;
    }

    public String getName() {
        return this.birdName;
    }

    public String getNomen() {
        return this.nomen;
    }

    public void addObserveCount() {
        this.observations += 1;
    }

    public int getObserveCount() {
        return this.observations;
    }

}
