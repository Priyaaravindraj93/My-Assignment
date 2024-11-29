package week1.day2;

public class FibonacciSeries 
{
	
	 public static void main(String args[])
    {
        int num1 = 0, num2 = 1, num3, count=8;

        for (int i = 0; i < count; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
 
      

    } }
