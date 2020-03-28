/*
 sales Analysis 
 The file SalesData.txt, in this chapter’s source code folder, 
 contains the dollar amount of sales that a retail store made each day for a number of weeks. 
 Each line in the file contains seven numbers, which are the sales numbers for one week. 
 The numbers are separated by a comma. 
 The following line is an example from the file: 
 2541.36,2965.88,1965.32,1845.23,7021.11,9652.74,1469.36 
 
 Write a program that opens the file and processes its contents. 
 The program should display the following: 
 •	The	total	sales	for	each	week 
 •	The	average	daily	sales	for	each	week 
 •	The	total	sales	for	all	of	the	weeks 
 •	The	average	weekly	sales 
 •	The	week	number	that	had	the	highest	amount	of	sales 
 •	The	week	number	that	had	the	lowest	amount	of	sales
 */
 

 
 public class SalesAnalysis
 {
    //fields
   final int weekday=7;
   int index=3;
   double[][] sale=new double[index][weekday];
    
   public SalesAnalysis(double[][] s)
   { 
     int i=0;
     int j=0;

     sale[i][j]=s[i][j];
   }
   public double getWeekTotal(int index)
   {
     double weekTotal=0;
     for(int j=0;j<sale[index-1].length;j++)
         weekTotal += sale[index-1][j];
     return weekTotal;
   }
   public double getDayAverage(int index)
   {
     double average=0;
     average = (getWeekTotal(index))/weekday;
     
      return average;
      
   }
   public double getTotal()
   {
     double Total=0;
     for(int i=0;i<sale.length;i++)
     {
       for(int j=0;j<sale[i].length;j++)
       {
         Total += sale[i][j];
        }
      }
     return Total;
   
   }
   public double getWeekAverage()
   {
     return getTotal()/index;
   }
   public int getHighest()
   {
     int i=0;
     double higest=sale[i][0];
    
     for( i=0;index<sale.length;index++)
     {
       for(int j=0;j<weekday;j++)
       {
         if(sale[i][j]>higest)
           higest=sale[i][j];
       }
     }
     return i+1;
   }
   public int getLowest()
   {
     
     int i=0;
     double lowest=sale[i][0];
    
     for( i=0;index<sale.length;index++)
     {
       for(int j=0;j<weekday;j++)
       {
         if(sale[i][j]<lowest)
           lowest=sale[i][j];
       }
     }
     return i+1;

     
   }
   
 }