import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count");
        int num = sc.nextInt();
        int a=0;
        while (num != 0) {
            num = num/10;
            a = a+1;
        }
        System.out.println("Your Total number of digit is: "+a);
        sc.close();
    }
}
