import java.util.Scanner;

public class hollowRightTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hollowrighttringle number");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                 if (i == 0 || i == n || j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
