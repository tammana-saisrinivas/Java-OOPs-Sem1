public class BinaryToDecimal 
{
    public static void main(String[] args) 
	{
        String binaryString = "1010";
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal value of " + binaryString + " is: " + decimalValue);
    }
}
