/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/25/2019
 * Assignment: Lab5 - CalcTip
 * File:CalcTip
 * Purpose: To have the user enter input there rating of the resturtant
 *          and total cost to calculate the tip
 */

import java.util.Scanner;

public class CalcTip {
  
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner( System.in );
    int rate = 0;
    double total = 0;
    double tip = 0;
    double temp = 0;
    
    //asking for a rating
    System.out.println("Please rate your satisfaction from 1-5");
    rate = scan.nextInt();
    
    //asking for total
    System.out.println("Please enter your total cost before the tip");
    total = scan.nextDouble();
    
    //closing the scanner
    scan.close();
    
    switch(rate){
      case 1:
        tip = (total * .10);
        System.out.println("Your tip percentage is below");
        System.out.println("10%");
        System.out.println("Your tip amount is below");
        System.out.printf("%1s%-6.2f", "$" ,tip);
        System.out.println("");
        System.out.println("Your total amount after tip is");
        temp = total + tip;
        System.out.printf("%1s%-6.2f", "$", temp);
        break;
        
      case 2:
        tip = (total * .125);
        System.out.println("Your tip percentage is below");
        System.out.println("12.5%");
        System.out.println("Your tip amount is below");
        System.out.printf("%1s%-6.2f", "$",tip);
        System.out.println("");
        System.out.println("Your total amount after tip is");
        temp = total + tip;
        System.out.printf("%1s%-6.2f", "$", temp);
        break;
      
      case 3:
        tip = (total * .15);
        System.out.println("Your tip percentage is below");
        System.out.println("15%");
        System.out.println("Your tip amount is below");
        System.out.printf("%1s%-6.2f", "$",tip);
        System.out.println("");
        System.out.println("Your total amount after tip is");
        temp = total + tip;
        System.out.printf("%1s%-6.2f", "$", temp);
        break;
        
      case 4:
        tip = (total * .20);
        System.out.println("Your tip percentage is below");
        System.out.println("20%");
        System.out.println("Your tip amount is below");
        System.out.printf("%1s%-6.2f", "$", tip);
        System.out.println("");
        System.out.println("Your total amount after tip is");
        temp = total + tip;
        System.out.printf("%1s%-6.2f","$", temp);
        break;
        
      case 5:
        tip = (total * .25);
        System.out.println("Your tip percentage is below");
        System.out.println("25%");
        System.out.println("Your tip amount is below");
        System.out.printf("%1s%-6.2f", "$", tip);
        System.out.println("");
        System.out.println("Your total amount after tip is");
        temp = total + tip;
        System.out.printf("%1s%-6.2f","$", temp);
        break;
    }
    
     
  }
  
  /* ADD YOUR CODE HERE */
  
}
