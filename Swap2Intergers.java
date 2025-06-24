import java.util.*;
public class Swap2Intergers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Integer:");
        int a=sc.nextInt();
        System.out.println("Enter Second Integer:");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println(" First Integer is :"+ a);
        System.out.println("Second Integer is :"+c);
    }
}
