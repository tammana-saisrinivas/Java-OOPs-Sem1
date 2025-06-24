import java.util.Scanner;

public class CapriconNumbers {
    int num;
    //Constructor
    CapriconNumbers(int num){
    this.num=num;
    }
    // Methods
    public static boolean isKaprekar(int num) {
        if (num == 1) {//1 is Capricon number
            return true;
        }
        
        int sq = num * num;
        String str = Integer.toString(sq);
        int len = str.length();

        for (int i = 1; i < len; i++) {
            // Splitting the square into two parts
            String part1 = str.substring(0, i);
            String part2 = str.substring(i);

            // Converting parts to integers
            int num1 = Integer.parseInt(part1);
            int num2 = Integer.parseInt(part2);

            if (num1 + num2 == num) {
                return true;
            }
        }

     return false;
    }
    public  void CapriCheck(){
    if(isKaprekar(num)){
        System.out.println("It is a Kaprekar Number");
        }else{
        System.out.println("It is not a Kaprekar Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //Object
      CapriconNumbers Obj=new CapriconNumbers(num);
      Obj.CapriCheck();
        sc.close();
    }
}
