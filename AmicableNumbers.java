import java.util.*;
class AmicableNumbers{
public static  int SumofDivisors(int num){
int sum=0;
for(int i=1;i<=num/2;i++){
    if(num%i==0)
    System.out.print(i+",  ");
        sum+=i;
    }

return sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number:");
int num1=sc.nextInt();
System.out.println("Enter 2nd number :");
int num2=sc.nextInt();
int sum1=SumofDivisors(num1);
int sum2=SumofDivisors(num2);
if(sum1==num2 && sum2==num1){
System.out.println("They are Amicable");
}else{
System.out.println("They are not Amicable");
}

}

}