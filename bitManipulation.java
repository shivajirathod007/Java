/*
        * *************BIT MASK(Manipulation)**************
        * 1.---> Get Bit ---> getting the bit from the position
        * Step -->
        * 1: Bit Mask = 1<<Position
        * 2: operation = AND(&)
        * 
        * 2.---> Set Bit ----> Setting a bit means changing a specific bit from 0 to 1.
        * This is like turning on a switch.
        * Step -->
        * 1: Bit Mask = 1<<Position
        * 2: operation = OR(|)
        * 
        * 3.---> Clear Bit-----> Clearing a bit means changing a specific bit from 1 to
        * 0. This is like turning off a switch.
        * Step -->
        * 1: Bit Mask = 1<<Position
        * 2: operation = AND With NOT(& || ~) ---first we've to change the bit into 1's
        * after that AND opeartion
        * 
        * 4.---> Update Bit----> Updating a bit in bit manipulation is essentially a
        * combination of clearing the bit and then setting it to a specific value (0 or
        * 1)
        * Step -->
        * same as set & clear bit (both combination)
        * 
        * 
        * 
        */

import java.util.Scanner;

public class bitManipulation {
    Scanner sc = new Scanner(System.in);

    // get bit
    void getBit() {
        System.out.println("enter the number:");
        int num = sc.nextInt();
        // byte show = (byte) num;
        System.out.println("the byte code: " + Integer.toBinaryString(num));
        System.out.println("enter the position the bit do you want");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        if ((bitMask & num) == 0) {
            System.out.println("bit is 0 at this position : " + pos);

        } else
            System.out.println("bit is 1 at this position : " + pos);

    }

    void SetBit() {
        System.out.println("enter the number:");
        int num = sc.nextInt();
        // byte show = (byte) num;
        System.out.println("the byte code: " + Integer.toBinaryString(num));
        System.out.println("enter the position to change specific bit from 0 to 1");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int newNum = bitMask | num;
        System.out.println("new number is: " + newNum);
        System.out.println("the byte code: " + Integer.toBinaryString(newNum));

    }

    void clearBit() {
        System.out.println("enter the number:");
        int num = sc.nextInt();
        // byte show = (byte) num;
        System.out.println("the byte code: " + Integer.toBinaryString(num));
        System.out.println("enter the position to change specific bit from 1 to 0");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int notbitMask = ~(bitMask);
        int newNum = notbitMask & num;
        System.out.println("new number is: " + newNum);
        System.out.println("the byte code: " + Integer.toBinaryString(newNum));

    }

    void updateBit() {
        System.out.println("enter the number:");
        int num = sc.nextInt();
        // byte show = (byte) num;
        System.out.println("the byte code: " + Integer.toBinaryString(num));
        System.out.println("enter the position to change specific bit from 0 to 1");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        System.out.println("this update of bit is for 1 or 0 enter 0 or 1 ");
        int ch = sc.nextInt();
        if (ch == 0) {
            int notbitMask = ~(bitMask);
            int newNum = notbitMask & num;
            System.out.println("new number is: " + newNum);
            System.out.println("the byte code: " + Integer.toBinaryString(newNum));
        } else {
            int newNum = bitMask | num;
            System.out.println("new number is: " + newNum);
            System.out.println("the byte code: " + Integer.toBinaryString(newNum));
        }

    }

    public static void main(String[] args) {
        // get bit
        bitManipulation sc = new bitManipulation();
        sc.getBit();
        sc.SetBit();
        sc.clearBit();
        sc.updateBit();
    }
}
