import java.util.*;
public class CheckHex {
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the String :");
String str=sc.nextLine();
int len=str.length();
boolean Hex=true;
for(int i=0;i<len;i++){
char ch=str.charAt(i);
if (!((ch>= '0' && ch <= '9')  ||ch >= 'A' && ch <= 'F')  ||(ch >= 'a' && ch <= 'f')) {
Hex=false;
break;
}
}
if(Hex==true){
System.out.println(str+" is Hexadecimal");
}else{
System.out.print(str+" is not Hexadecimal");
}
sc.close();
}
}