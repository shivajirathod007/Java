class abc {
    String name;
    int n;

    // writing the default constructor
    abc() {
        System.out.println("this is the the default constructor");
    }

    // writing the parametrizes constructor
    abc(String name, int n) {
        this.n = n;
        this.name = name;
        System.out.print("this is parametrized construcor..");
    }

    void printf() {
        System.out.println("name: " + this.name);
        System.out.print("age: " + this.n);
    }

    // writing the copy construtor
    abc(abc s1) {
        this.name = s1.name;
        this.n = s1.n;
    }
}

public class constructor {
    public static void main(String arg[]) {
        abc s = new abc();
        s.n = 15;
        s.name = "pooja";

        abc p = new abc(s);
        p.printf();
        // s.printf();
    }
}

// int the JAVA there is no destructor becase it has autmatically removing the
// variables,objects when it's not in used in the java called the java garbage
// collector
