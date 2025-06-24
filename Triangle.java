
    import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();

        
        for (int i = 1; i <= height; i++) {
            // Print space
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            // Print #
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("#");
            }
            System.out.println();
        }


        sc.close();
    }
}


