
public class Main {

    public static void main(String[] args) {
        // example main program for the first section of the exercise

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);
            //PART 1
//        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
            //PART2
//        // example main program for the first section of the exercise
//        childrensHospital.feed(ethan);
//        childrensHospital.feed(ethan);
//        childrensHospital.feed(ethan);
//
//        System.out.println("");
//
//        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
//        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");
        
            //PART 3
        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
        

        // write experimental code here to check how your program functions
    }
}
