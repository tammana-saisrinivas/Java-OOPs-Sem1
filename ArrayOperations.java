import java.util.*;
public class ArrayOperations {
public static void main(String args){
int[] arr1={ 1,2,3};
int[] arr2={4,5,6};
int[] result=new int[arr1.length];
for(int i=0;i<arr1.length;++i){
result[i]=arr1[i]+arr2[i];
}
System.out.println(Arrays.toString(result));
}
}
