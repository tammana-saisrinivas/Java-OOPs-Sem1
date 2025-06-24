import java.util.Scanner;

public class PrintArraysInStars {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.print("Enter the number of items: ");
int NUM_ITEMS = sc.nextInt();


int[] items = new int[NUM_ITEMS];


if (NUM_ITEMS > 0) {
System.out.print("Enter the value of all items (separated by space): ");
for (int i = 0; i < NUM_ITEMS; ++i) {
items[i] = sc.nextInt();
}
}


for (int idx = 0; idx < items.length; ++idx) {
System.out.print(idx + ": ");
for (int starNo = 1; starNo <= items[idx]; ++starNo) {
System.out.print("*");
}
System.out.println(" (" + items[idx] + ")");
}

sc.close();
}
}



