/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/25/2019
 * Assignment: Lab5 - IfTemp
 * File:IfTemp
 * Purpose: To have the user enter a temperature as and int
 *          And to output the season
 */

import java.util.Scanner;

public class IfTemp {
  
  
  public static void main(String[] args) { 
    
    //Making the scanner and the int for user input
    Scanner scan = new Scanner( System.in );
    int input = 0;
    
    //A do while loop to make sure the user enters a valid input
    do{
      
      //asking for a temperature
      System.out.println("Please a temperature below");
      input = scan.nextInt();
      
      //testing to see if the temperature is valid
      if(input > 110 || input < 5){
        
        //output message
        System.out.println("Current temperature is outside valid range");
        System.out.println("Please enter another temperature \n");
        
      }
      
      //end of while if the user entered a valid temperature
    }while(input > 110 || input < 5);
    
    //Closing the scanner
    scan.close();
    
    //testing to see what season it probably is
    if(input >= 90){
      System.out.println("It's probably summer");
    }
    else if(input >= 70 && input < 90){
      System.out.println("It's probably spring");
    }
    else if(input >= 50 && input < 70){
      System.out.println("It's probably fall");
    }
    else if(input < 50){
      System.out.println("It's probably winter");
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
