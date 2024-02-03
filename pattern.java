import java.util.Scanner;

public class pattern {
    public static void main(StringInJava[] arg) {
        // ***********************************************************
        // int n, m;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the n && m : ");
        // n = sc.nextInt();
        // m = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // sc.close();
        // }
        // }

        /*
         * output =
         * enter the n && m :
         * 4
         * 5
         *****
         * 
         * *
         * *
         *****
         * 
         * 
         */

        // ***********************************************************************

        // half peramid

        // Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // in.close();
        // }
        // }
        /*
         * o/p:
         * 5
         *
         **
         ***
         ****
         *****
         */
        // *************************************************

        // inverted half pattern
        // Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }
        // in.close();

        // }
        // }

        /*
         * output:
         * 4
         ****
         ***
         **
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for (int i = 0; i <= n; i++) {
            // inner loop 1
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
                for (int j2 = 0; j2 <= i; j2++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }

}