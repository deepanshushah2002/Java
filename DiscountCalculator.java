import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Bill");
        int bill = sc.nextInt();
        int n = bill / 100;
        int discount = 0;
        if (1000 <= bill && 4999 >= bill) {
            discount = bill - (n * 5);
            System.out.println("Your Discount Bill is : " + discount);
        } else if (5000 <= bill && 9999 >= bill) {
            discount = bill - (n * 10);
            System.out.println("Your Discount Bill is : " + discount);
        } else if (10000 <= bill && 19999 >= bill) {
            discount = bill - (n * 15);
            System.out.println("Your Discount Bill is : " + discount);
        } else if (25000 <= bill) {
            discount = bill - (n * 25);
            System.out.println("Your Discount Bill is : " + discount);
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}
