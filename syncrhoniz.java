/*
- here's a brief summary of "synchronized" in Java:

- Keyword in Java used for thread synchronization.
- Ensures only one thread can execute synchronized block/method at a time.
- Prevents race conditions and ensures thread safety.
- Can be applied to methods or blocks of code.
- Useful for controlling access to shared resources in multi-threaded environments.
 
 */

public class syncrhoniz {
    public static void main(String[] args) throws InterruptedException {
        print p = new print();
        A ThreadA = new A(p);
        B ThreadB = new B(p);
        ThreadA.start();
        // ThreadA.join(); ----> this alternative sultion for the stop the anonymous
        // output or the behviure while using the thread
        ThreadB.start();
    }
}

class print {
    synchronized void printSomething(char ch) { // we used here synchronized method to provide the accrute output while
                                                // 2 or more thread is running at the same time
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class A extends Thread { // created the thread class
    print p;

    A(print p) {
        this.p = p;
    }

    public void run() {
        p.printSomething('*'); // calling the method from another class
    }
}

class B extends Thread {
    print p;

    B(print p) {
        this.p = p;
    }

    public void run() {
        p.printSomething('+');
    }
}