
public class HealthStation {
    
    private int weighingsCounter = 0;
//    private int setWeigh;
    //TRIED TO CREATE CONSTRUCTOR TO SUPPORT THE SETTER, BUT SETTER DDNT WORK
//    public HealthStation() {
//        this.weigh = weigh;
//        this.weighings = 0;
//    }
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighingsCounter++; //add +1 counter when weigh() is called;
        return person.getWeight();
    }
//  APPLYING SETTER TO GET TO WORK, BUT FAILED
//    public int setWeigh(Person person) {
//        // return the weight of the person passed as the parameter
//        this.setWeigh = weigh + 1;
//        return person.getWeight();
//    }
    // I CANT GET THIS TO WORK A FEW MINUTES AGO// TRYING TO RETURN OR USE THIS.()
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weighingsCounter;
    }
    
}