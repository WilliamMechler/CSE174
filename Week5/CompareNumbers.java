/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/25/2019
 * Assignment: Lab5 - Comparenumbers
 * File: CompareNumbers
 * Purpose: To have the user enter input there rating of the resturtant
 *          and total cost to calculate the tip
 */

import java.util.Scanner;

public class CompareNumbers {
  
  
  public static void main(String[] args) { 
    
     //Making the scanner and the doubles for user input
    Scanner scan = new Scanner( System.in );
    double num1 = 0.0;
    double num2 = 0.0;
    
    //Making two ints for testing
    int test1 = 0;
    int test2 = 0;
    
    System.out.println("Enter a floating point number 1 below");
    num1 = scan.nextDouble();
    
    System.out.println("Enter a floating point number 2 below");
    num2 = scan.nextDouble();
    
    scan.close();
    
    test1 = (int)(num1*100);
    test2 = (int)(num2*100);
    
    if(test1 == test2){
      System.out.println("The floating point numbers are equal up to two decimals points");
    }
    else{
      System.out.println("The floating point numbers are not equal up to two decimals points");
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
