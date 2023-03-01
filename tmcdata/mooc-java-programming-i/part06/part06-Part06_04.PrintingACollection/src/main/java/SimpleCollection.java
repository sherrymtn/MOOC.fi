
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    // public String getName() {
    // return this.name;
    // }
    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        // String print = "The collection " + this.getName();

        // if the string is empty
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        // when the string has only one element
        // printing the additional output string needed (collection)
        if (getElements().size() == 1) {
            return "The collection " + this.name + " has " + getElements().size() + " element:" + "\n"
                    + getElements().get(0);
        }
        // printing on how may element.size
        String elementName = "";

        for (String e : getElements()) {
            elementName = elementName + "\n" + e;
        }
        return "The collection " + this.name + " has " + getElements().size() + " elements:" + elementName;

    }

}
