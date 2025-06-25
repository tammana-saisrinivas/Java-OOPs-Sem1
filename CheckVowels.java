import java.util.*;

public class CheckVowels {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String:");
String str = sc.nextLine();

int vowelcount = 0;
int digitcount = 0;
int consonantcount = 0;
int length = str.length();

// Convert the string to lowercase to handle both uppercase and lowercase vowels
String lstr = str.toLowerCase();

// Method or loop
for (int i = 0; i < length; i++) {
char ch = str.charAt(i);

if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
vowelcount++;
} else if (ch >= '0' && ch <= '9') {
digitcount++;
} else if (Character.isLetter(ch)) {  // Checks if the character is a letter (consonant or vowel)
consonantcount++;
}
}

// Print the counts
System.out.println("No. of Vowels: " + vowelcount);
System.out.println("No. of Digits: " + digitcount);
System.out.println("No. of Consonants: " + consonantcount);

// Calculate percentages
double vowelpercentage = (double) vowelcount / length * 100;
double digitpercentage =  digitcount / length * 100;
double consonantpercentage = (double) consonantcount / length * 100;

System.out.printf("Vowel percentage = %.2f%%, Consonant percentage = %.2f%%, Digit percentage = %.2f%%\n",
vowelpercentage, consonantpercentage, digitpercentage);

sc.close();
}
}


