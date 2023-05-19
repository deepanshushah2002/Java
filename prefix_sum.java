import java.util.Scanner;

public class prefix_sum {
    public static void main(String[] args) {
        //Prefix Sum
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int a[] = new int[n];
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter"+(i+1)+":- ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b += arr[i];
            a[i] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}