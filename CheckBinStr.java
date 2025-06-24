import java.util.*;
public class CheckBinStr {


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String str=sc.nextLine();
int len=str.length();
int i;
boolean Binary=true;
for(i=0;i<len;i++){
char ch=str.charAt(i);
if(ch!='0'&& ch!='1'){
Binary=false;
break;
}

}
if(Binary==true){
System.out.println(str+" is Binary");
}else{
System.out.print(str+" is not Binary");
}
sc.close();
}
}