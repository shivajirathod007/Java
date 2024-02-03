
import java.util.*;

class Student {
    String name;
    int num;

    void acceptStudentDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name & age of Student: ");
        name = sc.next();
        num = sc.nextInt();
    }

    void displayDetail() {
        System.out.println("Student name: " + name + " age: " + num);
    }
}

public class bank {
    public static void main(String[] args) {

    }

}
