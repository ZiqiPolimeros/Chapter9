/*
4. Vowels and consonants 
Write a class with a constructor that accepts a String object as its argument. 
The class should have a method that returns the number of vowels in the string, 
and another method that returns the number of consonants in the string. 
Demonstrate the class in a program that performs the following steps: 
1. The user is asked to enter a string. 
2. The program displays the following menu: 
   a. Count the number of vowels in the string 
   b. Count the number of consonants in the string 
   c. Count both the vowels and consonants in the string 
   d. Enter another string 
   e. Exit the program 
3. The program performs the operation selected by the user and repeats until the user selects e, 
to exit the program.
*/
import java.util.Scanner;

public class VowelsAndConsonants
{
   public static void main(String[]args)
   {

     Menu();     
       
   }//end main method
  
 
   public static void Menu()
   {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your sentence: ");
     String sentence = s.nextLine();
     
     System.out.println("The vowels and consonants program  menu: \n"+
                        "  a. Count the number of vowels in the string \n"+
                        "  b. Count the number of consonants in the string \n"+
                        "  c. Count both the vowels and consonants in the string \n"+ 
                        "  d. Enter another string \n"+
                        "  e. Exit the program  ");
     String option = s.nextLine();
 
     
     Options(option,sentence);

   }
   
   public static void Options(String option, String str)
   {   
          String option1 = option.toLowerCase().trim();

       do
       {
           if(option1.equals("a"))
           {
             System.out.println("The number of vowels in your sentence: "+ Vowels(str));
           }
           else if(option1.equals("b")) 
           {
             System.out.println("The number of consonants in your sentence: "+ Consonants(str));
           }
           else if(option1.equals("c")) 
           {
             System.out.println("The number of vowels in your sentence: "+ Vowels(str));
             System.out.println("The number of consonants in your sentence: "+ Consonants(str));
           }
           else if(option1.equals("d")) 
           {   
              Menu();
               
           }
           else if(option1.equals("e")) 
           {
              System.exit(0);
           }
           else
           {
              System.out.println("Invalid Data");
           }
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a new option");
              option1 = s.nextLine();
         
   }while(option1.equals("a")||option1.equals("b")||option1.equals("c")||option1.equals("d"));  
   }

   
   public  VowelsAndConsonants(String str)
   {
     this.str = str;
   }
   public static int Vowels(String str)
   { 
     int count=0;
     
     for(int i =0; i<str.length(); i++)
     {
       if(str.charAt(i)=='a' || str.charAt(i)=='e' ||
          str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
           count++;
     }
     return count;
   
   }
   public static int Consonants(String str)
   {
      int count = 0;
     for(int i =0; i<str.length(); i++)
     {
       if(Character.isLetter(str.charAt(i)))
       {
       if(!(str.charAt(i)=='a' || str.charAt(i)=='e' ||
          str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'))
           count++;
     }
     }
     return count;
      
   }
   
   private String str="";

}