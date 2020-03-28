/*
12. Miscellaneous string operations 
Write a class with the following static methods: 
•	WordCount. 
This method should accept a reference to a String object as an argument and return the number of words contained in the object. 
•	arrayToString. 
This method accepts a char array as an argument and converts it to a String object. 
The method should return a reference to the String object. 
•	mostFrequent. 
This method accepts a reference to a String object as an argument and returns the character 
that occurs the most frequently in the object. 
•	replaceSubstring. 
This method accepts three references to String objects as  arguments. 
Let’s call them string1, string2, and string3. It searches string1 for all occurrences of string2. 
When it finds an occurrence of string2, it replaces it with string3. 
For example, suppose the three arguments have the following values: 
string1: “the dog jumped over the fence” 
string2: “the” 
string3: “that” 
With these three arguments, the method would return a reference to a String object with the value “that dog jumped over that fence”.
Demonstrate each of these methods in a complete program.
*/

public class stringOperations 
{

  public static int WordCount(String word)
  {
    int count=0;
    
    for(int i=0; i<word.length(); i++)
    { 
     if(Character.isLetter(word.charAt(i)))
       count++;  
    }
    return count;
  }
  public static String arrayToString(char[] c)  
  {
    return String.valueOf(c);
  }
  

  public static char mostFrequent(String str)
  {
    char mostOccurence=' ';
    int most = 0;
    
    for(int i=0; i<str.length(); i++)
    {
      int count = 0;
      char ch = str.charAt(i);
      
      for(int j=0; j<str.length(); j++)
      {
         if(ch == str.charAt(j))
           count++;
      }
      if(count >= most)
      {
        most = count;
        mostOccurence = ch;
      }
    }
    
    return mostOccurence;
  
  }
  
  
  public static String replaceSubstring(String string1,String string2,String string3)
  {    
    return string1.replaceAll(string2,string3);
  }


}
