// import java.util.*;

// public class function {
//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         System.out.println("sum of two no is: " + sum(n, m));
//         sc.close();
//     }
// }

// import java.util.*;

// public class function {
//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         } else {
//             return n * factorial(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter the number for which you want to calculate the factorial: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("The factorial of your number is: " + factorial(n));
//         sc.close();
//     }
// }
import java.util.*;

public class function {
    public static int calculatAvg3(int n, int m, int q) {
        return (n + m + q) / 3;
    }

    public static void printOdd() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum all the 1 to 10 is: " + sum);
    }

    public static void vote() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("able to vote");

        } else {
            System.out.println("not eligible to vote....");
        }
        sc.close();
    }

    public static void CmndivsiorBtn2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers for comman devisior: ");
        int a = sc.nextInt();
        a = Math.abs(a);
        int b = sc.nextInt();
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        ;
        System.out.println("comman devisior is :" + a);
        sc.close();
    }

    public static int fibonaseries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number that you want the fibbonaseries no: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("the fibona number is: " + num);
        } else {
            int total = (num - 1) + (num - 2);
            System.out.println("the fibona number is: " + total);
        }
        return 0;
    }

    public static void userWant() {
        int mergi = 0;
        int arr[];
        arr = new int[10];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("enter the size that you have to enter :");
        Scanner sc = new Scanner(System.in);
        mergi = sc.nextInt();
        System.out.println("enter the array elemnt");
        for (int i = 0; i < mergi; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                zero += 1;
            } else if (arr[i] > 0) {
                positive += 1;
            } else {
                negative += 1;
            }
        }
        System.out.println("total zero in the array of five is : " + zero + "\ntotal entered positive numbers are : "
                + positive + "\n total number of negative numbers is: " + negative);
        sc.close();
    }

    public static void main(StringInJava[] args) {
        int ch = 0;
        do {
            System.out.println(
                    "1. avg of 3 numbers\n2. sum 1 to 10 odd numbers\n3. exit\n4. Vote \n 5. userwant\n6. fiboneseries\n");
            System.out.println("enter the choice : ");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            int n, m, s;

            switch (ch) {
                case 1:
                    System.out.println("enter the three values to get the average: ");
                    n = sc.nextInt();
                    m = sc.nextInt();
                    s = sc.nextInt();
                    int avg = calculatAvg3(n, m, s);
                    System.out.println("Average: " + avg);
                    break;
                case 2:
                    printOdd();
                    break;
                case 3:
                    System.out.println("exiting ");
                    break;
                case 4:
                    vote();
                    break;
                case 5:
                    userWant();
                    break;
                case 6:
                    fibonaseries();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            sc.close();
        } while (ch != 3);
    }
}
