import java.util.*;
public class caesar {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
System.out.println("Enter the String :");
String str=sc.nextLine();
String lstr = str.toUpperCase();
int length = lstr.length();
int i;

System.out.println("The Caser code is:");
for(i=0;i<length;i++){
char ch=str.charAt(i);
int n=ch;
if(n>=88){
char ch2=(char)(n-23);

System.out.print(ch2);
}else{
char ch3=(char)(n+3);
System.out.print(ch3);
}

}
}
}
