/**
Pset1 for Java class
Date:  11-5-2014
By:  Kevin Wilson
program generates 1-half of a pyramid filled in with hashtag systems (#). It is to be printed right justified.
*/

import java.util.Scanner;


public class Pset1 
{
    public static void main(String[] varArgs) 
    {
        System.out.println("\nHalf of a pyramid, made out of hastag symbols, will be generated as a ");
        System.out.println("result of user input for height. It will appear on the screen right justified\n");

        StringBuilder lineBuilder = new StringBuilder();
        Scanner input = new Scanner(System.in);
        int high;    // row height
        int indx;    // index holder
        
           do
           {
              System.out.println("\nFor the height, enter a positive whole number that is less than 24  " ); 
              high = input.nextInt();
                   if (high > 23)
                   {
                       System.out.print("\nInvalid number!\n");
                   }
                   if (high < 0)
                   {
                       System.out.print("\nInvalid number!\n");
                   }

           } while (high > 23 || high < 0); 
     
        System.out.println("\nYou entered  " + high);

        if (high == 0)
        { 
           System.out.println("\n!! A pyramid cannot be generated for " + high + " rows high!!");
        }
        else 
           {
              System.out.println("\nHere is a half pyramid that is " + high + " rows high and is right justified\n");  
                

                 for (int r = high; r > 0; r--)             // loop to generate num of rows for height
                 {
                   indx = 0;
                   for (int s = 1; s < r; s++)              // first print blank spaces on a line
                   {
                       System.out.print(" ");
                       indx = s;                            // set index holder to index on line where spaces end
                   }           

                     for (int ht = indx; ht < high; ht++)   // begin printing # to fill in rest of the line
                     {
                        System.out.print("#");
                     }

                  System.out.println(lineBuilder.toString());

                 }
           } 

    }
}
     