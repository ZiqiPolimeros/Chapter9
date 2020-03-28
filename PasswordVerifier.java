/*
5. password Verifier 
Imagine you are developing a software package for Amazon.com 
that requires users  to enter their own passwords. 
Your software requires that users’ passwords meet the following criteria: 
•	The	password	should	be	at	least	six	characters	long. 
•	The	password	should	contain	at	least	one	uppercase
	and	at	least	one	lowercase	letter. 
•	The	password	should	have	at	least	one	digit. 
Write a class that verifies that a password meets the stated criteria.
 Demonstrate the class in a program that allows the user to enter a password 
 and then displays a message indicating whether it is valid or not.
*/

import java.util.Scanner;

public class PasswordVerifier
{
  public static void main(String[]args)
  {
    String pw = "";
    Scanner s = new Scanner(System.in);
       
    System.out.println("Enter your password: ");
    pw = s.nextLine();
    
    while(!isQualified(pw))
    {
      System.out.println("Invalid password.\n"+
                         "Your password should contain at least 6 digits, at least one capital letter, one small letter and one number.\n"+
                         "Enter your password again: ");
      pw = s.nextLine();                 
    }
    //display
    System.out.println("The password you enter: " + pw);
    
  
  }//end main method
  
  public static boolean isQualified(String pw)
  {
    boolean b = false;
    if(isLong(pw) && hasUppercase(pw)
     && hasLowercase(pw) && hasDigit(pw))
        b = true;
        
    return b;
  
  }
//private methods
  private static boolean isLong(String pw)
  {
    boolean b = false;
    if(pw.trim().length()>6)
       b = true;
    return b;
  }
  public static boolean hasUppercase(String pw)
  {
    boolean b = false;
    for(int i=0; i<pw.length(); i++)
    {
       if(Character.isUpperCase(pw.charAt(i)))
          b = true;
    }
    return b; 
  }
  public static boolean hasLowercase(String pw)
    {
    boolean b = false;
    for(int i=0; i<pw.length(); i++)
    {
       if(Character.isLowerCase(pw.charAt(i)))
          b = true;
    }
    return b; 
  }
  public static boolean hasDigit(String pw)
  {
    boolean b = false;
    for(int i=0; i<pw.length(); i++)
    {
       if(Character.isDigit(pw.charAt(i)))
          b = true;
    }
    return b; 
  }
}