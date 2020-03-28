/*
8. sum of numbers in a string 
Write a program that asks the user to enter a series of numbers separated by commas. 
Here is an example of valid input: 7,9,10,2,18,6 
The program should calculate and display the sum of all the numbers.

Pseudo Code Algorithm
    Declare variables
    Ask user for numbers (in String) separated by comma
    tokenize the string by, and store in string array
    traverse the array, convert string to number, then sum the numbers
    output sum
*/

import java.util.Scanner;

public class sumOfNumbers
{
  public static void main(String[]args)
  {
    String str="";
    int sum=0;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter your numbers which is separated by commas: ");
    str=s.nextLine();
    String[] strArray = str.split(",");
    
    for(int i=0; i<strArray.length;i++)
       sum += Double.parseDouble(strArray[i]);
    
    //display
    System.out.println(sum);
    
  }

}
