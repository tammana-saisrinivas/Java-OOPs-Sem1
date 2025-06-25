
import java.util.Scanner;

public class Exchangecipher {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
System.out.println("Enter the  Code :");
String str=sc.nextLine();
String lstr = str.toUpperCase();
int length = lstr.length();
int i;

System.out.println("The Exchanged code is:");
for(i=0;i<length;i++){
char ch=str.charAt(i);
int n=ch;
char ch3=(char)(155-n);
System.out.println(ch3);
}
}
}