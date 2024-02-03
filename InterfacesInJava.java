/*
 * INTERFACES:
 * it means the pure abstraction in java
 * + All The fields in interfaces are public,static and final by default
 * + All methods are public & avstract by default
 * + A class that implements an interface must implement all the methds declared
 * in the interfaces
 * + interfaces supports the functionlty of multiple inharitance
 * 
 * 
 * 
 * 
 */

interface animal {
    public void walk();

    int eyes = 2; // you modify the data members from the interface & it's Public
    // public void walkl(){} --> you can't write difination in the interface

}

class human implements animal { // you have to use 'implements' keyword to inharite the interface
    public void walk() { // alayes wantes in the public Access modifier
        System.out.println("walks on 2 leg");
    }
}

public class InterfacesInJava {
    public static void main(StringInJava[] args) {
        human hm = new human();
        hm.walk();
    }
}