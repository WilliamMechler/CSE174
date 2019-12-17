/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/25/2019
 * Assignment: Lab5 - Sum Positives
 * File: SumPositives
 * Purpose: To add up all positives numbers and not the negatives
 */

import java.util.Scanner;

public class SumPositives {
  
  
  public static void main(String[] args) { 
    
    //making the scanner and the running total
    Scanner scan = new Scanner( System.in );
    int sum = 0;
    
    //start of for loop
    for(int i = 1; i <= 5; i++){
      
      int temp = 0;
      
      //asking the user to enter a number
      System.out.println("Enter number " + i);
      temp = scan.nextInt();
      
      //if the number is not a negative than it is added to the running total
      if(temp > 0){
       sum = sum + temp; 
      }
      
    }//end of for loop
    
    //closeing the scanner
    scan.close();
    
    //outputting the total of the positive numbers
    System.out.println("The total of the positive numbers are " + sum);
    
  }//end of main
  
  
  /* ADD YOUR CODE HERE */
  
}
