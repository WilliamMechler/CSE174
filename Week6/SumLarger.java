/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/2/2019
 * Assignment: Lab 6 - SumLarger
 * File: SumLarger
 * Purpose: To have the user enter an unknown number of integers
 *          to see A. how many they entered and B. the summ of those numbers
 */
import java.util.Scanner;

public class SumLarger {
  
  
  public static void main(String[] args) { 
     Scanner scan = new Scanner(System.in);
    int initial = 0;
    int sum = 0;
    int count = 0;
    int num = 1;
    
    //Telling the user to input a value
    System.out.println("Please enter your initial integer.");
    
    //Making sure the next int is a integer
    while(!scan.hasNextInt()) {
    System.out.println("Please enter your initial integer. Must be a integer");
    scan.next(); 
    }
    initial = scan.nextInt();
    
    //Inside the loop till the input number is 0
    while(num != 0){
      
      //Telling the user to input a integer
      System.out.println("Please enter a integer.");
      
      //Making sure the inputted value is an integer
      while(!scan.hasNextInt()) {
        System.out.println("Please enter a integer. Must be a integer");
        scan.next(); 
      }
      num = scan.nextInt();
      
      //Testing to see if the inputed value is greater than the initial value
      if(num > initial){
        sum = sum + num;
        count = count + 1;
      }
      
    }//end of loop
    
    //Outputing the sum and the count of the numbers greater than the initial value
    System.out.println("The sum of the numbers entered over your initial value is \n" + sum);
    System.out.println("The total of the numbers entered over your initial value is \n" + count);
    
    //Closeing the scanner
    scan.close();
    
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
