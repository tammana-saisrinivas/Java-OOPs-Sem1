import java.util.*;
public class Add2Integer {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a= sc.nextInt();
        System.out.println("Enter second integer:");
        int b=sc.nextInt();
        sc.close();
        int sum;
        sum=a+b;
        System.out.println("The sum of integers " + a +" and "+ b+" is :"+sum);
    }
}
