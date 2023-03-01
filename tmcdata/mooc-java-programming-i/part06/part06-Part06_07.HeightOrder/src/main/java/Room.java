import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);

        for (Person cuteHeight : this.persons) {
            if (shortestPerson.getHeight() > cuteHeight.getHeight()) {
                shortestPerson = cuteHeight;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (isEmpty()) {
            return null;
        }
        // String taken = String.valueOf(people.add(shortest()));
        // Person taken = persons.get(0);
        // for (Person takeShortest : this.persons) {
        //     if (taken.getHeight() > takeShortest.getHeight()) {
        //         taken = takeShortest;
        //     }
        // }

        // Shorter solution which i cant do or trying to do
        Person taken = this.shortest();
        // thats all that was needed to do. thrying person.get person.add.
        // person.shortest >> the answer was this.shortest()
        persons.remove(taken);
        return taken;
    }

}
