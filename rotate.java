import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of array");
        int a = sc.nextInt();
        System.out.println("Enter a number of rotate");
        int k = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        while (k != 0) {
            {
                int n = arr.length;
                int temp = arr[arr.length - 1];
                for (int i = n - 2; i >= 0; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = temp;
                k -= 1;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
