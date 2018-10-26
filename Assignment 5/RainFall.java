 /****    
 *
 * Name: Dhairya Sonara
 * Student Number: T00609422
 * Section Number: 4
 * Seminar Number: 5
 * Due Date: Wednesday October 24, 2018
 *
 * Program Purpose: Print a graph of the average rainfall against the 2018
 *                  rainfall for the first six months. It also counts the
 *                  average total rainfall and the total for 2018 then finds
 *                  the difference between them as well as which month had
 *                  the most rain in 2018 (for the first six months).
 *
 ****/


import java.util.*;
import java.io.*;

public class RainFall
{
  public int Rainfall(int id)
  {
    return id;
  }
  
  public static void main(String[] args) throws IOException
     {
          File inputFile = new File( "RainIn.txt" );
          Scanner input = new Scanner( inputFile );
          
          PrintWriter output = new PrintWriter("RainOut.txt");
          
        
          
         // output.println("Rainfall comparison for January to June 2018");
         // output.println("");
          
          int count = 1, monthNumber = 0;
          double sum30 = 0, sum2018 = 0, rainMax = -1, compareMax = 0;
          double stars = 0, exPoints = 0;
          String month = (""), highestMonth = ("");
                        
          while ( input.hasNext( ) )
          {
               double rain30 = input.nextDouble();
               double rain2018 = input.nextDouble();
               
               if (count == 1)
                    month = ("January ");
               else if (count == 2)
                    month = ("February");
               else if (count == 3)
                    month = ("March   ");
               else if (count == 4)
                    month = ("April   ");
               else if (count == 5)
                    month = ("May     ");
               else
                    month = ("June    ");
               
               output.print(month + "    |");
               
               stars = rain30 * 5 + 0.5;
               
               for (int i = 1; i <= stars; i++)
                    output.print("*");
               
               output.printf("%n            |");
               
               exPoints = rain2018 * 5 + 0.5;
                    
               for (int i = 1; i <= exPoints; i++)
                    output.print("!");
                              
               if (count <= 5)
                    output.printf("%n            |%n");
               else
                    output.printf("%n            |----1----2----3----4----5----6----7----8%n");
               
               sum30 += rain30;
               sum2018 += rain2018;
               
               if (rain2018 > rainMax)
               {
                    rainMax = rain2018;
                    compareMax = rain30;
                    monthNumber = count;
               }
                              
               count++;
                    
          }
          
          output.printf("%nLEGEND:%n");
          output.printf("%n* - 30 year average rainfall for a given month (normal rainfall)%n");
          output.printf("%n! - 2018 rainfall for a given month%n");
          output.printf("%nTotal 30 year average rainfall was %.1fmm.%n", sum30);
          output.printf("%nTotal rainfall for 2018 was %.1fmm.%n", sum2018);
          
          if (sum30 > sum2018)
               output.printf("%n2018 was a drier year than normal by %.1fmm.%n%n", (sum30 - sum2018));
          else
               output.printf("%n2018 was a wetter year than normal by %.1fmm.%n%n", (sum2018 - sum30));

          if (monthNumber == 1)
               highestMonth = ("January");
          else if (monthNumber == 2)
               highestMonth = ("February");
          else if (monthNumber == 3)
               highestMonth = ("March");
          else if (monthNumber == 4)
               highestMonth = ("April");
          else if (monthNumber == 5)
               highestMonth = ("May");
          else
               highestMonth = ("June");
          
          output.println("The month with the highest rainfall in 2018 was " + 
                         highestMonth + " with " + rainMax + "mm.");
          
          output.println("");
          output.print(highestMonth);
          
          if (rainMax > compareMax)
               output.printf(" was a wetter month than normal by %.1fmm.%n", (rainMax - compareMax));
          else
               output.printf(" was a drier month than normal by %.1fmm.%n", (compareMax - rainMax));
          
          
          output.close();
     }
     
       public String toString(String s)
          {
            return s;
          }
}