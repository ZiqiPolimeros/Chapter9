/*
3. Sentence Capitalizer
Write a method that accepts a String object as an argument and returns a copy of the string
with the first character of each sentence capitalized. For instance, if the argument is “hello.
my name is Joe. what is your name?” the method should return the string “Hello. My name
is Joe. What is your name?” Demonstrate the method in a program that asks the user to input a string and then passes it to the method. The modified string should be displayed on
the screen.

Pseudo Code Algorithm
1.write a method
   name: Capitalizer
   agument: string
   parameters: string
   process: 
      Convert the parameter to StringBuilder object 
      if length of StringBuilder is >0, then capitalize the first letter
      Find the periods before the last character
      Capitalize the 2nd character after the peirods in 
      Return the string
*/

import java.util.Scanner;
public class SentenceCapitalizer
{
   public static void main(String[]args)
   {
     String str;
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your sentence: ");
     str = s.nextLine();
     StringBuilder sb = new StringBuilder(str);
     
     //display
     System.out.println("Your sentence :" + Capitalizer(str));
     //System.out.println("Your sentence :" + Capitalizer(sb));
     System.out.println("Your sentence :" + Capitalizer(str));
     
   }//end main method
   public static String Capitalizer(String s)
   {
     String[] str = s.split("\\.");
     String sentence = "";
     sentence += Character.toUpperCase(str[0].charAt(0));
     
     for(int j=1; j<str[0].length(); j++)
        sentence += str[0].charAt(j);

     for(int i=1; i<str.length; i++)
        sentence += Character.toUpperCase(str[i].charAt(1)) + str[i].substring(2)+ ". ";

     return sentence;
   }
   
   public static String Capitalizer(StringBuilder sb)
   {
      
      for(int i= 0; i<sb.length(); i++)
      {
        if(sb.charAt(i)=='.'|| sb.charAt(i)=='?'|| sb.charAt(i)=='!')
             sb.setCharAt((i+2),Character.toUpperCase(sb.charAt(i+2)));
            
      }
      return sb.toString();
   
   }
   public static String sentenceCap(String str)
   {
     int i;
     StringBuilder temp = new StringBuilder(str);
     if(temp.length()>0)
         temp.setChartAt(0,Character.toUpperCase(temp.charAt(0)));
         i = tem.indexOf(". ");
         while(i != -1)
         {
           i++;
           while(i< temp.length() && temp.charAt(i) == ' ')
             i++;
           temp.setCharAt(i,Character.toUpperCase(temp.charAt(i)));
           i= temp.indexOf(". ",i);
         }
         return temp.toString();
   }
  
}