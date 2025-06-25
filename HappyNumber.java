import java.util.*;
class HappyNumber{
int n;
//Constructor
HappyNumber(int n){
this.n=n;
}
//Method

public void HappyN(){
if(n%10==1){
System.out.println("It is a Happy Number");
} else{
System.out.println("It is not a Happy number");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number :");
int n=sc.nextInt();
//Object
HappyNumber Obj=new HappyNumber(n);
Obj.HappyN();
sc.close();
}
}

