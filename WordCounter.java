/*
10. Word counter 
Write a program that asks the user for the name of a file. 
The program should display the number of words that the file contains.
*/

import java.util.*;
import java.io.*;

public class WordCounter
{
   public static void main(String[]args)throws IOException
   {
      ArrayList<String> list = new ArrayList<String> ();
      list.add("one");
      list.add("two");
      list.add("three");
      list.add("four");
      list.add("five");
      list.add("six");
      list.add("seven");
      list.add("eight");
      list.add("nine");
      list.add("ten");
      list.add("teen");
      
      list.add("eleven");
      list.add("twelve");
      list.add("thirdteen");
      list.add("fourteen");
      list.add("fifteen");
      list.add("sixteen");
      list.add("seventeen");
      list.add("eighteen");
      list.add("nineteen");
      list.add("twenty");
      
      list.add("thirty");
      list.add("forty");
      list.add("fifty");
      list.add("sixty");
      list.add("seventy");
      list.add("sixty");
      list.add("seventy");
      list.add("eighty");
      list.add("ninety");
      
      list.add("hundred");
      list.add("thousand");
      list.add("million");
      list.add("billion");
      list.add("trillion");
      
      list.add("first");
      list.add("second");
      list.add("third");
      list.add("fourth");
      list.add("fifth");
      list.add("sixth");
      list.add("seventh");
      list.add("eighth");
      list.add("ninth");
      list.add("tenth");
      
      list.add("eleventh");
      list.add("twelfth");
      list.add("thirteenth");
      list.add("fourteenth");
      list.add("fifteenth");
      list.add("sixteenth");
      list.add("seventeenth");
      list.add("eighteenth");
      list.add("nineteenth");
      list.add("twentieth");
      
      list.add("thirtieth");
      list.add("fortieth");
      list.add("fiftieth");
      list.add("sixtieth");
      list.add("seventieth");
      list.add("eightieth");
      list.add("ninetieth");
      list.add("hundredth");
      list.add("thousandth");
      list.add("millionth");
      list.add("billionth");
      list.add("trillionth");
      
      /* test the ArrayList
      for (String number : list) 
         System.out.println("Number = " + number);
      */
      
      
        String sentence = "";
        String fileName ="";
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the name of the file: ");
        fileName = s.nextLine();
        File file = new File(fileName); 
        
        Scanner sc = new Scanner(file); 
        
  
        while (sc.hasNextLine()) 
        {
           sentence = sc.nextLine();
           String[] word = sentence.split("[ -.!?]");
           
           for(int i=0; i<word.length; i++)
           {
                if(list.contains(word[i].toLowerCase()))
                     System.out.println( "Number "+(i+1)+" in the file: " + word[i]);
            }
        
         }//end while      
      
      
  
      
   }
}