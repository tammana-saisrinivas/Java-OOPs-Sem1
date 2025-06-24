import java.util.*;

public class SumofInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n=n/10;
        }

        System.out.println("SUM: " + sum);
    }
}
