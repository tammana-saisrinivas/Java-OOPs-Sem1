import java.util.Scanner;

public class Invertedtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the triangle: ");
        int height = sc.nextInt();

        for (int i = height; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print hashes
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        sc.close();
    }
}