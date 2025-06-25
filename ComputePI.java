 import java.util.*;
 class ComputePI {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of max denominator");
int n=sc.nextInt();
double sum=0;
for(int den=1;den<=n;den+=2)
{
    if(den %4==1){
        sum+=4.0/den;
    }else if (den %4==3) {
        sum-=4.0/den;
    }else{
        System.out.println("Impossible");
    }
}
System.out.println("Sum:"+sum);
    }
}
