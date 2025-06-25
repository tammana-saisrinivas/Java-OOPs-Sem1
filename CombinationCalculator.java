import java.util.Scanner;

public class CombinationCalculator {
    private int n;
    private int r;

    // Constructor to initialize n and r
    public CombinationCalculator(int n, int r) {
        this.n = n;
        this.r = r;
    }

    // Method to calculate factorial
    private long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    // Method to calculate nCr
    public long calculateCombination() {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for n: ");
        int n = scanner.nextInt();

        System.out.print("Enter value for r: ");
        int r = scanner.nextInt();

        CombinationCalculator calculator = new CombinationCalculator(n, r);
        System.out.println(n + "C" + r + " = " + calculator.calculateCombination());

        scanner.close();
    }
}
