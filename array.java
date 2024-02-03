public class array {
    public static void main(StringInJava[] arg) {
        int arr[];
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int n=i;
          
            arr[i] = n;
            

        }
        System.out.print("array index is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
