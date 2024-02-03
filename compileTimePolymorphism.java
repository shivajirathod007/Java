class abc {
  void print() {
    System.out.print("heloo");
  }

  void print(int n) {
    System.out.print("hello: " + n);
  }

  void print(String name) {
    System.out.print("hello " + name);
  }

  void print(int n, String name) {
    System.out.print("heloo" + n + name);
  }
}

public class compileTimePolymorphism {
  public static void main(String arg[]) {
    abc a = new abc();
    a.print();
    a.print(12);
    a.print("shiva");
    a.print(13, "pooja");
  }
}
