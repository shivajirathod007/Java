
/*
 *  In the java Strings are Immutable
 *      
 *    
 *  
 */
import java.util.*;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Shiva");
        System.out.println(str);
        StringBuilder str1 = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        // taking input from the user 1st technique:
        str1.append(sc.nextLine());
        // taking input from the user 2nd Step:
        String data = sc.nextLine();
        StringBuilder str2 = new StringBuilder(data);
        System.out.println(str2);

        // delete the extra "n"
        str2.delete(1, 2);
        System.out.println(" after deletion parformed on the StringBuilder: " + str2);

        // char at index 0
        System.out.println(str.charAt(0));

        // set char at index (for modifiying purpose) we use the SetChar();
        str.setCharAt(0, 'a');

        // to insert the New elment in the String we use the "insert(index_n0,"data");"
        str.insert(str.length(), "ji");
        System.out.println(str);

        StringBuilder br = new StringBuilder("P");
        br.append("O"); // str = str + "O";
        br.append("O");
        br.append("J");
        br.append("A");
        System.out.println(br);

        /*
         * reversing the String using StringBuilder in the java
         */

        StringBuilder str3 = new StringBuilder();
        System.out.print("enter the String to be reversed: ");
        str3.append(sc.nextLine());
        // System.out.println(str3);
        for (int i = 0; i < str3.length() / 2; i++) {
            int front = i;
            int rear = str3.length() - 1 - i; // n-1-0 = -
            char frontChar = str3.charAt(front);
            char lastChar = str3.charAt(rear);

            str3.setCharAt(front, lastChar);
            str3.setCharAt(rear, frontChar);

        }
        System.out.println(str3);

        sc.close();
    }
}
