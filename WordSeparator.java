/*
14. Word separator 
Write a program that accepts as input a sentence in which all of the words are run together, 
but the first character of each word is uppercase. 
Convert the sentence to a string in which the words are separated by spaces and only the first word starts with an uppercase letter. 
For example, the string “StopAndSmellTheRoses.” would be converted to “Stop and smell the roses.”

StringBuilder sb = 
sb.insert(i," ");

*/

import java.util.Scanner;
import java.io.*;

public class WordSeparator
{
   public static void main(String[]args)
   {
     String str = "";
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your sentence: ");
     str=s.nextLine();
     
     //display
     System.out.println("Your sentence is:"+ Convert(str));
     
   
   }//end main method
   
   
   
   public static String Convert(String s)
   {
     String str = ""; 
     str +=s.charAt(0);
     char letter =' ';

     for(int i = 1; i< s.length(); i++)
     {
       
       if(Character.isUpperCase(s.charAt(i)))
       {
         letter = Character.toLowerCase(s.charAt(i));
         str += " " + letter;
       }else 
         str += s.charAt(i);
      
     }

     return str;
   
   }//end Convert method
   
}//end class