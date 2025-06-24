import java.util.*;
public class AutomorphicNumber {
int n;
int sq=n*n;
//Constructor
AutomorphicNumber(int n,int sq) {
this.n=n;
this.sq=sq;
}
//Method
public void AutoNum(){
int lastn=n%10;
int lastsq=sq%10;
if(lastn==lastsq){
System.out.println("It is a Automorphic Number");
}else{
System.out.println("It is not a Automorphic Number");
}
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n=sc.nextInt();
int sq=n*n;
System.out.println("Square of the Given Number: "+sq);
//Object
AutomorphicNumber Obj=new AutomorphicNumber(n,sq);
Obj.AutoNum();
sc.close();
}
}