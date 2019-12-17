/**
 * This file contains a static method that can be used to get valid input
 * from the console.
 * this version has a main that tests how to get the month day and year of a date
 * using the validInteger method
 * File: Validate.java
 * Version: 10/7/19
 * Author: Werner, Woods
 */

import java.util.Scanner;
public class Main
{
  // this main method is for testing the static methods in the Validate class
  // with various inputs
  public static void main(String[] args) {
    //testing validInteger
    int low = 1;
    int high = 12;
    double high2 = 0.0;
    double myDou = 0.0;
    System.out.print("Enter the month: ");         
    int myInt = validInteger(low,high);
    System.out.println(myInt+" is in the correct range.");
    // 2nd set of test data
    System.out.print("Enter the day: ");    
    low = 1; high = 31;
    myInt = validInteger(low,high);
    System.out.println(myInt+" is in the correct range.");
    // 3rd set of test data
    low = -1; high = 100;     
    System.out.println("Enter a number between "+low+ " and "+high); 
    myInt = validInteger(low,high);
    System.out.println(myInt+" is in the correct range.");
    // 4th set of test data
    low = 0; high2 = Double.MAX_VALUE;     
    System.out.println("Enter a number between "+low+ " and "+high2); 
    myDou = inputPositiveDouble(low,high2);
    System.out.println(myDou+" is in the correct range.");
    
  }//end main
  /**
   This method promplts a user for an integer in a range and returns the number.
   If the user enters a number out of range, the number is discarded and
   the user is asked to re-enter the number.
   If the user enters a non-integer, the input is discarded and 
   the user is asked to enter an integer.
   @param low - lowest integer user can enter
   @param high - highest integer allowed to be entered
   @return int between low and high inclusive
   */
  
  public static int validInteger(int low, int high){
    // initialize local variables
    boolean inRange = false;
    int userNum = 0;
    Scanner scan = new Scanner(System.in);
    // Prompt the user for a integer in range
    System.out.print("Enter an integer between " + low + " and " 
                       + high+" inclusive: ");            
    
    // Use a while loop to check if the number was in the 
    // correct range.
    while(inRange == false) {
      while(!scan.hasNextInt()) {            
        // If the user did not enter an integer discard  
        // whatever is in the input stream and prompt the user 
        // another time for an integer in range
        String garbage = scan.nextLine();
        System.out.print("Enter an integer between " + low + " and " 
                           + high+" inclusive: ");            
      } // End while loop.
      
      // read the integer
      userNum = scan.nextInt( );
      // check range
      if((userNum >= low) && (userNum <= high)) {  
        inRange = true;
      } // End if statement.
      
      // If the user entered a number that was not within the
      // specified range, it asks them to enter another 
      // integer.
      if(!inRange) 
      {
        System.out.print("Enter an integer between " + low + " and " 
                           + high+" inclusive: ");              
      } // End if statement.
      
    } // End while loop.
    return userNum;
  }// end validInteger

    public static double inputPositiveDouble (int low, double high){
    // initialize local variables
    boolean inRange = false;
    double userNum = 0;
    Scanner scan = new Scanner(System.in);
    // Prompt the user for a integer in range
    System.out.print("Enter an double between " + low + " and " 
                       + high+" inclusive: ");            
    
    // Use a while loop to check if the number was in the 
    // correct range.
    while(inRange == false) {
      while(!scan.hasNextDouble()) {            
        // If the user did not enter an integer discard  
        // whatever is in the input stream and prompt the user 
        // another time for an integer in range
        String garbage = scan.nextLine();
        System.out.print("Enter an integer between " + low + " and " 
                           + high+" inclusive: ");            
      } // End while loop.
      
      // read the integer
      userNum = scan.nextDouble();
      // check range
      if((userNum >= low) && (userNum <= high)) {  
        inRange = true;
      } // End if statement.
      
      // If the user entered a number that was not within the
      // specified range, it asks them to enter another 
      // integer.
      if(!inRange) 
      {
        System.out.print("Enter an Double between " + low + " and " 
                           + high+" inclusive: ");              
      } // End if statement.
      
    } // End while loop.
    return userNum;
  }// end inputPositiveDouble 
}

    
  

