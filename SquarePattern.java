import java.util.Scanner;

public class SquarePattern {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        
        // i=rows,j=columns
        for (int i = 0; i < size; i++) {
            
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        

        sc.close();
    }
}


    

