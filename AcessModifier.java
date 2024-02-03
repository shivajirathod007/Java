import java.util.Scanner;

class java {
    public String name; // public access modifier
    String surename; // default access modifier
    protected int age; // protected access modifier .
    private String CrushName; // private access modifier

    private void printTheData() {
        System.out.println(
                "Name of the Student: " + name + " " + surename + " \n age: " + age + " Crush name: " + CrushName);
    }

    // we can use getter And setter to access & modify the data members present in
    // the class

    private void GetingTheCrushName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your crush name: ");
        CrushName = sc.nextLine();
        sc.close();
    }

    //
    protected void print() {
        GetingTheCrushName();
        printTheData();
    }

}

public class AcessModifier {
    public static void main(String[] args) {
        java ob = new java();
        ob.name = "Shiva";
        ob.age = 15;
        ob.surename = "Rathod";
        ob.print();

    }
}
