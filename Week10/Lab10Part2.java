/**
 * Auto Generated Java Class.
 */

import java.util.Scanner;
import java.lang.Math.*;

public class Lab10Part2 {
  
  
  public static void main(String[] args) { 
    
    //Making the scanner
    Scanner scan = new Scanner(System.in);
    //asking for the range of the random generation
    int range = 0;
    //asking for the amount of random numbers generated
    int amount = 0;
    
    //Getting the range for the generation
    System.out.println("Enter the range of the generation, please only enter a whole number");
    range = scan.nextInt();
    
    //Getting the amount of numbers to generate
    System.out.println("Enter the amount of number you want to be generate, please only enter a whole number");
    amount = scan.nextInt();
    
    //Calling the method
    randomTest(range,amount);
    
  }//End of main
  
  
  /**
   Generates numbers bewteen the range
   @param range is the range the number will be generated
   @param amount is the amount of numbers will be generated
   */
  public static void randomTest(int range, int amount){
    
    //The array for keeping track of the generated numbers
    int[] testArr = new int[range];
    
    //The temp random number
    int temp = 0;
    
    for(int i = 0; i < amount; i++){
      
      //Making the random number for this loop
      temp = (int)(Math.random() * range);
      
      //Testing to see where the temp number should be put
      for(int j = 0; j < testArr.length; j++){
        
        if(temp == (j)){
          
          testArr[j] = testArr[j] + 1;
          
        }
      }
    }
    
    for(int x =0; x < testArr.length; x++){
    
      //Outputting the info
      System.out.println( x + "  " + testArr[x]);
    }
    
  }// end of randomTest method
  
}
