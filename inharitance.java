import java.util.*;

class shape {
    String name;
    int num;
}

public class inharitance extends shape {
    void take() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        num = sc.nextInt();
        System.out.print("name: " + name + " num " + num);
        sc.close();
    }

    public static void main(String arg[]) {
        inharitance i = new inharitance();
        i.take();
    }

}
