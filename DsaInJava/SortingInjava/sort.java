package DsaInJava.SortingInjava;
// package DsaInJava;

public class sort {
    void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    // buuble sorting technique
    // time complexity O(n^2)
    void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort sc = new sort();
        int arr[] = { 12, 65, 9, 599, 9, 91, 1 };
        // int[] arr = new int[10];
        sc.printArray(arr);
        sc.bubble(arr);
        sc.printArray(arr);

    }
}
