/*
 we use Abstract keyword to define the Abstraction
 
● An abstract class must be declared with an abstract keyword.
● It can have abstract and non-abstract methods.
● It cannot be instantiated.
● It can have constructors and static methods also.
● It can have final methods which will force the subclass not to change the body of
the method.
 */
abstract class Animal {
    abstract void typeOfAnimal();

    Animal() {
        System.out.println("you're crreating a new animal...");
    }

    public void eats() {
        System.out.println("animal its the ....");
    }
}

class Human extends Animal {
    Human() {
        System.out.println("you're created the Human");
    }

    public void typeOfAnimal() {
        System.out.println("walks on 4 leg");
    }

}

class birds extends Animal {
    birds() {

        System.out.println("yooure creating the bird");
    }

    public void typeOfAnimal() {
        System.out.println("walks on 2 leg");
    }
}

/*
 * we used the constructor chaining the java
 */
public class Abstraction {
    public static void main(StringInJava[] args) {
        birds n = new birds();
        n.typeOfAnimal();
        Human m = new Human();
        m.eats();
        m.typeOfAnimal();
        // Animal a =new Animal(); --> this can't be created because it's abstarct
        // concept
    }
}
