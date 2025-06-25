import java.util.Scanner;

public class Deciphercaeser {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
System.out.println("Enter the Caser Code :");
String str=sc.nextLine();
String lstr = str.toUpperCase();
int length = lstr.length();
int i;

System.out.println("The Deciphered code is:");
for(i=0;i<length;i++){
char ch=str.charAt(i);
int n=ch;
if(n>=65  && n<=67){
char ch2=(char)(n+21);

System.out.print(ch2);
}else{
char ch3=(char)(n-3);
System.out.print(ch3);
}

}
}
}