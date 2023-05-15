import java.util.Scanner;

public class reduce_inner_patten {
    public static void main(String[] args) {
        System.out.print("Enter the number of digits : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n - j + " ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print(n - i + " ");
            }
            for (int l = n - i + 1; l < n + 1; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n; j >= i + 2; j--) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(i + 1 + " ");
            }
            for (int l = 2 + i; l <= n; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}