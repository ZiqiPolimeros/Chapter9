/*
15. pig Latin 
Write a program that reads a sentence as input and converts each word to “Pig Latin”. 
In one version of Pig Latin, you convert a word by removing the first letter, 
placing that letter at the end of the word, and then appending “ay” to the word. 
Here is an example:
English: I SLEPT MOST OF THE NIGHT 
Pig Latin: IAY LEPTSAY OSTMAY FOAY HETAY IGHTNAY
*/

import java.util.Scanner;

public class PigLatin
{
  public static void main(String[]args)
  {
    String str;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your sentence: ");
    str = s.nextLine();
    
    //display
    System.out.println("The pig latin of your sentence: \n" + PigLatin.convertToPigLatin(str) );
  
  }

  public static String convertToPigLatin(String str)
  {
     String pigLatin="";
     String[] word = str.split(" "); 
     
     for(int i=0; i<word.length; i++)
        pigLatin += word[i].substring(1,word[i].length())
                  + word[i].charAt(0)
                  + "AY" + " ";     
     
     
     return pigLatin;
     
  
  }
}