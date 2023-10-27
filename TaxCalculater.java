import java.util.Scanner;

public class TaxCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int salary = sc.nextInt();
        int n = salary / 100;
        if (10000 <= salary && 19999 >= salary) {
            System.out.println("Your tax is :" + n * 10);
        } else if (20000 <= salary && 29999 >= salary) {
            System.out.println("Your tax is :" + n * 15);
        } else if (30000 <= salary) {
            System.out.println("Your tax is :" + n * 25);
        } else {
            System.out.println("No tax");
        }
        sc.close();
    }
}
