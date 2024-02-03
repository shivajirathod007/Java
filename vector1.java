/*
 *  syntax
 * vector() --> 10(vector with default size usualy is 10)
 * 
 * extends object <d>  ---> implements LIst<d>, cloneable or serialzable
 * 
 * java vector constructor --->  vector, vector(int intialCapacity())
 * 
 *  vector (int intialCapacity,int capacityIncrement())
 * 
 *  vector collection <? extends E>c)
 * 
 * Java vector method(Function)
 * 1.  add()  -->  append the sepecifed given data
 * 2.  addAll()
 * 3.  contains()  --> it returns the true if vector any element in it
 * 4.  copyInto()   --> 
 * 5.  elementAt()
 * 6.  elements()
 * 7.  ensureCapacity()
 * 8.  equals()
 * 
 */

import java.util.*;

public class vector1 {
    public static void main(String[] args) {
        Vector s1 = new Vector();
        s1.addElement("shiva");
        s1.addElement("pooja");

        // intilizing the vector in java
        Vector<String> v = new Vector<String>();
        // element using the add method in Vector
        v.add("shiva");
        v.add("Rathod");
        v.add("pooja");
        v.add("Wavdara");
        v.addElement("shivaji");

        System.out.println(v);

        System.out.println(s1.capacity()); //
        v.insertElementAt("hii", 0);
        System.out.println(v);


    }
}
