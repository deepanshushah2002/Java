import java.util.Scanner;

public class SimpleInterest {
    static float simpleinterest(float p, float r, float t) {
        float SI = (p * r * t) / 100;
        return SI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Principle");
        float p = sc.nextInt();
        System.out.println("Enter a Rate");
        float r = sc.nextInt();
        System.out.println("Enter a Time");
        float t = sc.nextInt();
        float res = simpleinterest(p, r, t);
        System.out.println("Your value is: " + res);
        sc.close();
    }
}
