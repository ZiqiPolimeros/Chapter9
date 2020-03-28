/*
1. Backward String

Write a method that accepts a String object as an argument 
and displays its contents back-ward.
 For instance, if the string argument is “gravity” the method should display -“ytivarg”.

Demonstrate the method in a program that asks the user to input a string 
and then passes it to the method.
*/
/*
Pseudo code Algorithm
1.create a static method
  name: reverse
  return type: void
  parameters: String s
  process: display s backwards
           go to the last charactor in s, print it
           go to the second charactor in s, print it
           continue untill I reach the 1st charactor in s, print them.
  
2. in main method
   create scanner object
   ask an accept a string from user
   call the reverse method
   display
*/
import java.util.Scanner;
public class BackwardString
{
   public static void main(String[]args)
   {
      String str="";
      
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your sentence: ");
      str=s.nextLine();
      
      //display
      reverse(str);
      reverse2(str);
      
   }//end main method
   
   public static void reverse(String s)
   {
     String str="";
     for(int i =0; i<s.length(); i++)
         str += s.charAt(s.length()-i-1);
     System.out.println("The backward string of your sentence : " + str);
     
   }
   public static void reverse2(String s)
   {
      String str="";
      for(int i= (s.length()-1); i>=0; i--)
          str += s.charAt(i);
      System.out.println("The backward string of your sentence : " + str);
   }


}