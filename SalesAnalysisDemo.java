import java.io.*;

import java.util.Scanner;
 
 public class SalesAnalysisDemo
 {

  
   //main method
   public static void main(String[]args) throws IOException
   {
   
      //variables
      final int weekday=7;
      int index = 3;
      double[][] sale=new double[index][weekday];
      String data;
  
     try {
      File myObj = new File("SalesData.txt");
      Scanner myReader = new Scanner(myObj);

      
      while (myReader.hasNextLine()) {

           data = myReader.nextLine();
           String[] dataArray = data.split(",");
         
            int i=0;

            for(int j=0;j<weekday;j++)
            {
                 sale[i][j] =  Double.parseDouble(dataArray[j]);

                // System.out.printf("a[%d][%d]= %d\n",i,j,sale[i][j]); 
             } 
             
             i++;       
      }//end while
     
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    
    
          SalesAnalysis analysis = new SalesAnalysis(sale);
           
           //display the total sales for each week
           System.out.println("The	total	sales	for week 1: "+ analysis.getWeekTotal(1));
           System.out.println("The	total	sales	for week 2: "+ analysis.getWeekTotal(2));
           System.out.println("The	total	sales	for week 3: "+ analysis.getWeekTotal(3));
           
           //display the	average	daily	sales	for	each	week 
           System.out.println("The average daily sales for week 1 : "+analysis.getDayAverage(1));
           System.out.println("The average daily sales for week 2 : "+analysis.getDayAverage(2));
           System.out.println("The average daily sales for week 3 : "+analysis.getDayAverage(3));
           
           //display the	total	sales	for	all	of	the	weeks 
           System.out.println("The	total	sales	for	all	of	the	weeks: "+ analysis.getTotal() );
           
           //display The	average	weekly	sales 
           System.out.println("The	average	weekly	sales: "+ analysis.getWeekAverage());
           
           //display The	week	numbers	that	had	the	highest and lowest	amount	of	sales 
           System.out.println("The week that had the highest amount of sales is week "+ analysis.getHighest()  );
           System.out.println("The week that had the lowes amount of sales is week "+ analysis.getLowest()  );
           
}
}
 
   
