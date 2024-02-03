import java.util.Vector;
import java.util.Enumeration;

public class vector {

    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Displaying the Vector using an Enumeration
        System.out.println("Vector elements using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Getting the size of the Vector
        int size = vector.size();
        System.out.println("Vector size: " + size);

        // Getting an element at a specific index
        String elementAtIndex = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // Checking if the Vector contains a specific element
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Vector contains 'Banana': " + containsBanana);

        // Removing an element
        vector.remove("Banana");

        // Displaying the Vector using a for-each loop
        System.out.println("Vector elements after removal using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Clearing the Vector
        vector.clear();

        boolean isEmpty = vector.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);
    }
}
