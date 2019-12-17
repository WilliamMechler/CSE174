/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/18/2019
 * Assignment: Lab 4 - Programming part 2
 * File:Proficiency2Practice
 * Purpose: To find the furture value of money in a bank account base on
 *          user input
 */
import java.lang.Math.*;
import java.util.Scanner;

public class Proficiency2Practice {
  
  
  public static void main(String[] args) { 
    Double P = 0.0;
    Double ir = 0.0;
    Double five = 0.0;
    Double ten = 0.0;
    Double twenty = 0.0;
    Scanner scan = new Scanner( System.in );
    
    System.out.println("Please enter your starting investment");
    P = scan.nextDouble();
    
    System.out.println("Please enter your interest rate");
    ir = scan.nextDouble();
    
    scan.close();
    
    //Using Math.pow
    five = P * (Math.pow((1+ir),5));
    ten = P * (Math.pow((1+ir),10));
    twenty = P * (Math.pow((1+ir),20));
    
    //Outputting the top of the block of text
    System.out.println("With an investment of " + P );
    System.out.println("at an interest rate of " + (ir * 100) + "% " + "compounded annually:");
    
    //Outputing the five years
    System.out.printf("   the future value in 5 years is $%-20.2f" , five);
    System.out.println("");
    
    //Outputting the ten years
    System.out.printf("   the future value in 10 years is $%-20.2f" , ten);
    System.out.println("");
    
    //Outputting the 20 years
    System.out.printf("   the future value in 20 years is $%-20.2f" , twenty );

    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
