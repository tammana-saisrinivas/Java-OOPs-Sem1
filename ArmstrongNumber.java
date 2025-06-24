import java.util.*;
public class ArmstrongNumber {
public static void main(String args[]){
int sum=0;
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the integer");
int n=sc.nextInt();
int Orgno =n;
System.out.println("The sum of cubes is :");
while (n > 0) {
    int digit = n % 10;
    n=n/10;
    if(n>0){
System.out.print(digit+"^ +");
    }else{
System.out.print("=");
    }
    sum += Math.pow(digit, 3);
}
System.out.println(sum);
if(sum==Orgno){
    System.out.println("It is a  Armstrong numbers ");
}else{
    System.out.println("It is not Armstrong numbers");
}


}

}
