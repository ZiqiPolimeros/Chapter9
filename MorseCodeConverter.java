/*
16. Morse code converter 
Morse code is a code where each letter of the English alphabet, each digit, 
and various punctuation characters are represented by a series of dots and dashes. 
Table 9-14 shows part of the code. 
Write a program that asks the user to enter a string, and then converts that string to Morse code. 
Use hyphens for dashes and periods for dots.

Table 9-14 Morse code
Character   Code   Character   Code   Character   Code   Character   Code 
space       space  6           -….    G           --.    Q           --.       
comma       --..-- 7           --…    H           ….     R           .-. 
period      .-.-.- 8           ---..  I           ..     S           … 

question 
mark        ..--.. 9           ----.  J           .---   T           -
0           -----  A           .-     K           -.-    U           ..-
1           .----  B           -…     L           .-..   V           …
2           ..---  C           -.-.   M           --     W           .-
3           …--    D           -..    N           -.     X           -..
4           ….-    E           .      O           ---    Y           -.-
5           …..    F           ..-.   P           .--.   Z           --..

*/

import java.util.Scanner;

public class MorseCodeConverter
{
  public static void main(String[]args)
  {
    String str="";
    
    Scanner s= new Scanner(System.in);
    System.out.println("Enter your sentence: ");
    str=s.nextLine();
    
    //display
    System.out.println("The morse code of your sentence: \n"+ getMorseCode(str.toUpperCase()));
  
  }
 
 
   // static mathod
   public static String getMorseCode(String str)
   {
      String moreseCodeStr="";
      String moreseCode="";
      
      for(int i=0; i<str.length();i++)
      {
        switch(str.charAt(i))
        {
          case ' ':
          moreseCode=" ";
          break;
          case ',':
          moreseCode="--..--";
          break;
          
          case '.':
          moreseCode=".-.-.-";
          break;
          case '?':
          moreseCode="..--..";
          break;
          
          case '0':
          moreseCode="-----";
          break;
          case '1':
          moreseCode=".----";
          break;
          
          case '2':
          moreseCode="..---";
          break;
          case '3':
          moreseCode="...--";
          break;
          
          case '4':
          moreseCode="....-";
          break;
          case '5':
          moreseCode=".....";
          break;
          
          case '6':
          moreseCode="-....";
          break;
          case '7':
          moreseCode="--...";
          break;
          
          case '8':
          moreseCode="---..";
          break;
          case '9':
          moreseCode="----.";
          break;
          
          case 'A':
          moreseCode=".-";
          break;
          case 'B':
          moreseCode="-...";
          break;
          
          case 'C':
          moreseCode="-.-.";
          break;
          case 'D':
          moreseCode="-..";
          break;
          
          case 'E':
          moreseCode=".";
          break;
          case 'F':
          moreseCode="..-.";
          break;
          
          case 'G':
          moreseCode="--.";
          break;
          case 'H':
          moreseCode="….";
          break;
          
          case 'I':
          moreseCode="..";
          break;
          case 'J':
          moreseCode=".---";
          break;
          
          case 'K':
          moreseCode="-.-";
          break;
          case 'L':
          moreseCode=".-..";
          break;
          
          case 'M':
          moreseCode="--";
          break;
          case 'N':
          moreseCode="-.";
          break;
          
          case 'O':
          moreseCode="---";
          break;
          case 'P':
          moreseCode=".--.";
          break;
          
          case 'Q':
          moreseCode="--.";
          break;
          case 'R':
          moreseCode=".-.";
          break;
          
          case 'S':
          moreseCode="...";
          break;
          case 'T':
          moreseCode="-";
          break;
          
          case 'U':
          moreseCode="..-";
          break;
          case 'V':
          moreseCode="...-";
          break;
          
          case 'W':
          moreseCode=".--";
          break;
          case 'X':
          moreseCode="-..-";
          break;
          
          case 'Y':
          moreseCode="-.--";
          break;
          case 'Z':
          moreseCode="--..";
          break;
   
      
        }
        moreseCodeStr+=moreseCode;
      }
      return moreseCodeStr;
   
   }



}