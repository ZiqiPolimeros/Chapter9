/*
13. Alphabetic Telephone number Translator 
Many companies use telephone numbers like 555-GET-FOOD so the number is easier for their customers to remember. 
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion: 
A, B, and C = 2 
D, E, and F = 3 
G, H, and I = 4 
J, K, and L = 5 
M, N, and O = 6 
P, Q, R, and S = 7 
T, U, and V = 8 
W, X, Y, and Z = 9

 Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX. 
 The application should display the telephone number with any alphabetic characters 
 that appeared in the original translated to their numeric equivalent. 
 For example, if the user enters 555-GET-FOOD the application should display 555-438-3663.
*/

import java.util.*;

public class Alphabetic
{
  public static void main (String[]args)
  {
   String tel="";
   String num="";
   
   System.out.println("Enter a telephone number: ");
   Scanner s = new Scanner(System.in);
   num = s.nextLine().toUpperCase();
   
   while(!(isFormat(num)))
   {
      System.out.println("Invalid data.\n"
                        +"A telephone number that is three numbers  - three letters - four letters. \n"
                        +"The format is ***-***-****\n"
                        +"Enter a telephone unmber: ");
      num = s.nextLine().toUpperCase();
                    
   }
   
   for(int i =0; i<num.length();i++)
   {
     char c = num.charAt(i);
     
     if(Character.isDigit(c))
       tel += c;
     else if(Character.isLetter(c))
       tel += Translator(c);
     else
       tel += c;
   
   }//end for
   
   //display
   System.out.println("The telephone number: " + tel);
  
  }//end main method
  
  public static boolean isFormat(String str)
  {
    boolean b = false;
    
    for(int i=0; i<str.length();i++)
    {
        char c1=str.charAt(0);
        char c2=str.charAt(1);
        char c3=str.charAt(2);
        char c4=str.charAt(3);
        char c5=str.charAt(4);
        char c6=str.charAt(5);
        char c7=str.charAt(6);
        char c8=str.charAt(7);
        char c9=str.charAt(8);
        char c10=str.charAt(9);
        char c11=str.charAt(10);
        char c12=str.charAt(11);        
        
        if(Character.isDigit(c1)
         &&Character.isDigit(c2)
         &&Character.isDigit(c3)
         && c4=='-'&& c8=='-'
         &&Character.isLetter(c5)
         &&Character.isLetter(c6)
         &&Character.isLetter(c7)
         &&Character.isLetter(c9)
         &&Character.isLetter(c10)
         &&Character.isLetter(c11)
         &&Character.isLetter(c12))
           b = true;
                               
    }//end for
    
    return b; 
  }//end isFormat
  
  public static String Translator(char c)
  {
         String str="";
     
        
         if(c=='A'||c=='B'||c=='C')
          str="2";

         else if(c== 'D'||c=='E'||c=='F')
          str="3";

         else if(c== 'G'||c=='H'||c=='I')
          str="4";

         else if (c=='J'||c=='K'||c=='L')
          str="5";
          
         else if (c=='M'||c=='N'||c=='O')
          str="6";

         else if(c=='P'||c=='Q'||c=='R'||c=='S')
          str="7";         

         else if(c=='T'||c=='U'||c=='V')
          str="8";

         else if(c=='W'||c=='X'||c=='Y'||c=='Z')
          str="9";
          
       return str;  

  }//end Translator
  
}//end class