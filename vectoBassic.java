import java.util.*;

public class vectoBassic {

    public static void main(String[] args) {
        // Creating a Vector
        Vector<Object> vector = new Vector<>();

        // Inserting different elements into the Vector
        vector.add("Apple");
        vector.add(123);
        vector.add(3.14);
        vector.add(true);

        // Displaying the Vector using a for-each loop
        System.out.println("Vector elements:");
        System.out.println(vector);
        for (Object element : vector) {
            System.out.println(element);
        }
    }
}
