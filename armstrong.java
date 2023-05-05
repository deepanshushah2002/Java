import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int va, t = 0;
        va = n;
        while (va > 0) {
            t++;
            va /= 10;
        }
        va = n;
        int arms = 0;
        while (n != 0) {
            int g = n % 10;
            arms = arms + (int) Math.pow(g, t);
            n /= 10;
        }
        if (arms == va) {
            System.out.println("this is armstrong");
        } else {
            System.out.println("this is not armstrong");
        }
        sc.close();
    }
}
