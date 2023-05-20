import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1'st value");
        int a = sc.nextInt();
        System.out.println("Enter a 2'nd value");
        int b = sc.nextInt();
        System.out.print("1. (+)   2. (-)    3. (*)  ");
        System.out.println("  4. (/)   5. (%)");
        int n = sc.nextInt();
        int c;
        switch (n) {
            case 1:
                c=a + b ;
                System.out.print(c);
                break;
            case 2:
                c=a - b ;
                System.out.print(c);
                break;
            case 3:
                c=a * b ;
                System.out.print(c);
                break;
            case 4:
                c=a / b ;   
                System.out.print(c);
                break;
            case 5:
                c=a % b ;
                System.out.print(c);
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
