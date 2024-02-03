import java.util.*;
import java.io.*;

public class TWOD_ARRAY {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];
        int[][] Sum = new int[3][3];
        // int totalSumOfArray = 0;

        /*
         * int arr[][];
         * arr = int[2][25]
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number that you want to calucalate: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the 2nd number that you want to calucalate: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < Sum.length; i++) {
            for (int j = 0; j < Sum.length; j++) {
                Sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i = 0; i < Sum.length; i++) {
            for (int j = 0; j < Sum.length; j++) {
                System.out.println("Data from row" + i + " column is: " + j + " And data is : " + Sum[i][j]);
            }
        }
    }
}
