public class StringOperationsDemo
{
  public static void main(String[]args)
  {
  String string1= "the dog jumped over the fence";
  String string2= "the";
  String string3= "that"; 
  char[] c={'p','9','e','h'};
  
  //display WordCound method
  System.out.println("String1 has "+ stringOperations.WordCount(string1) + " letters.");
  
  //display arryToString method
  System.out.println(stringOperations.arrayToString(c));
  
  //display mostFrequent method
  System.out.println(stringOperations.mostFrequent(string1));
  
  //display replaceSubstring method
  System.out.println(stringOperations.replaceSubstring(string1,string2,string3));
  
  
  }
}