import java.util.Scanner;

public class percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter a no. of subject");
            int n = sc.nextInt();
            System.out.println("Enter a total Marks");
            int a = sc.nextInt();
            int c = (a/n);
            System.out.println("The percentage is "+c+"%");
        }
        sc.close();
    }
}
