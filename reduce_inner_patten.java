import java.util.Scanner;

public class reduce_inner_patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
            System.out.print(n - j);
            }
            for (int l = 0; l < 2 * (n - i) - 1; l++) {
            System.out.print(n - i);
            }
            for (int k = n-i+1; k < n+1; k++) {
            System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int m = n; m >= i+2; m--) {
            System.out.print(m);
            }
            for (int p = 0; p < 2 * i + 1 ; p++) {
                System.out.print(i+1);
            }
            for (int o = 2 + i; o <= n; o++) {
            System.out.print(o);
            }
            System.out.println();
        }
        sc.close();
    }
}