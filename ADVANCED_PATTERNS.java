// import java.util.*;

// public class ADVANCED_PATTERNS {
// public static void main(String[] arg) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the num: ");
// int n = sc.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// int spaces = 2 * (n - i);
// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// // 2nd part

// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// int spaces = 2 * (n - i);
// for (int j = 1; j <= spaces; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// sc.close();
// }

// }
// /*
// Enter the num: 5
// * *
// ** **
// *** ***
// **** ****
// **********
// **********
// **** ****
// *** ***
// ** **
// * *

// */

// import java.util.*;

// public class ADVANCED_PATTERNS {
// public static void main(String[] arg) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter the number : ");
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// // spaces
// for (int j = 0; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 0; j <= n; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// sc.close();
// }
// }

// /*
// *
// * enter the number : 5
// ******
// ******
// ******
// ******
// ******
// *
// */

import java.util.*;

public class ADVANCED_PATTERNS {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            //
            for (int j = i; j <= i; j++) {

            }

        }
        sc.close();
    }
}
