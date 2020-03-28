/*
9. sum of Digits in a string 
Write a program that asks the user to enter a series of single digit numbers with nothing separating them. 
The program should display the sum of all the single digit numbers in the string. 
For example, if the user enters 2514, the method should return 12, 
   which is the sum of 2, 5, 1, and 4. 
The program should also display the highest and lowest digits in the string. 
(Hint: Convert the string to an array.)

Pseudo Code Algorithm
   1.Declare variables
      String str
      int sum = 0
   2.Create Scanner object
   3.Ask user for digits(in string)
   4. Separate each digit(character) into a number or make each digit starting from the left to right intor a number
        find a way of converting a character to an integer
   5. assign first integer to largest
   6. assign first integer to smallest
   7. if next integer>largest, then largest = next integer.
   8. if next integer<smallest, then smallest = next integer.
   
   4.travers the array, convert character to string,then convert string to integer, 
   sum integers, determine the largest and the smallest
      a.to determine largest
        assign 1st value to largest, then compare with the next value.
        toCharArray();
      b. to determine smallest
         assign 
   
*/
import java.util.Scanner;
public class SumOfDigits
{
  public static void main(String[]args)
  {
     String str;
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your numbers: ");
     str = s.nextLine();
     
     //display
     System.out.println("The sum of the single digits in your numbers: " + Sum(str));
     System.out.println("The highes number of the single digits in your numbers: " + highest(str));
     System.out.println("The lowest number of the single digits in your numbers: " + lowest(str));
     
     
  }//end main method
  
  public static int Sum(String str)
  {
     int sum = 0;
     
     for(int i=0; i<str.length(); i++)
     {
       if(Character.isDigit(str.charAt(i)))
       {
         sum += Integer.parseInt(String.valueOf(str.charAt(i)));
       }
     }
     return sum;

  }
  
  private static int highest(String str)
  {
    int hightest = Integer.parseInt(String.valueOf(str.charAt(0)));
    for(int i=1; i< str.length(); i++)
    {
       if(Integer.parseInt(String.valueOf(str.charAt(i))) > hightest )
          hightest = Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    return hightest;
  
  }
  
  private static int lowest(String str)
  {
    int lowest = Integer.parseInt(String.valueOf(str.charAt(0)));
    for(int i=1; i< str.length(); i++)
    {
       if(Integer.parseInt(String.valueOf(str.charAt(i))) < lowest )
          lowest = Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    return lowest;
  
  }
  
  
 
}