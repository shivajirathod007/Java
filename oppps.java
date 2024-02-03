
class pen {
    String color;
    String type;

    public void write() {
        System.out.println("color : " + color + " " + "type: " + type);
    }

    // constructor
    pen() {
        System.out.println("hii shiva");
    }

    pen(int n, String shiva) {
        System.out.println("age : " + n + " Name: " + shiva);
    }
}

public class oppps {
    public static void main(String arg[]) {
        pen p1 = new pen();
        pen p2 = new pen(12, "pooja");
        p1.color = "pink";
        p1.type = "parewala pink";
        p1.write();
    }

}
