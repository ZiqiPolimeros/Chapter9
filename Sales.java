public class Sales
{
   public static void main(String[]args)
   {
      String data="1245.67,1490.07,1679.87,2371.46,1783.92,1461.99,2059.77,"+
                  "2541.36,2965.88,1965.32,1845.23,7021.11,9652.74,1469.36,"+
                  "2513.45,1963.22,1568.35,1966.35,1893.25,1025.36,1128.36";
      int index = 3;
      int weekday =7;
   
      for(int i=0;i<index;i++)
       { 
         for(int j=0;j<weekday;j++)
         {
           String [][] temp;
           temp[i][j]= data.split(",");
           double [][] sale; 
           sale[i][j]= Double.parseDouble(temp[i][j]);
           
           //display
           System.out.println(sale[i][j]);
                
        }//end 2nd for
        }//end 1st for
       

       

   }
}