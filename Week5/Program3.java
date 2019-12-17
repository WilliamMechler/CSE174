/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/27/2019
 * Assignment: Program 3
 * File: program3
 * Purpose: Tohave the user frist enter the type of item they are
 *          checking out and the date they checked it out on
 *          than to show the user the due date for that item
 */

import java.util.Scanner;

public class Program3 {
  
  
  public static void main(String[] args) { 
    int due = 0;
    int temp = 0;
    int day = 0;
    int month = 0;
    int year = 0;
    int itemtype = 0;
    int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    Scanner scan = new Scanner( System.in );
    
    //item 1 is 14 days and item 2 is 21 days
    System.out.println("Please enter the type of item being checked out");
    System.out.println("For new releases please enter a 1");
    System.out.println("If not a new release please enter a 2");
    itemtype = scan.nextInt();
    

    //Having the user enter the month
    System.out.println("Please enter the month this item is being checked below");
    System.out.println("Enter 1 for January or 12 for December");
    temp = scan.nextInt();
    month = (temp - 1);
    
     //Having the user enter the day of the month
    System.out.println("Please enter the day of the month this item is being checked below");
    day = scan.nextInt();
    
    //Having the user enter the year
    System.out.println("Please enter the year this item is being checked below");
    year = scan.nextInt();
    
    //closeing scanner
    scan.close();
    
    if(itemtype == 1){
      temp = (day+14);
      
      if(temp > months[month]){
        
        due = (temp - months[month]);
        
         System.out.println("The due date for this item will be");
         System.out.println(months[month]);
         
         //testing for end of year
         if(month == 11){
          System.out.println( 1 +"/" + due + "/" + (year + 1));
         }
         else{
         System.out.println( (month + 2) +"/" + due + "/" + year);
        }
      }
      else{
         
         due = temp;
        
         System.out.println("The due date for this item will be");
         System.out.println(months[month]);
         System.out.println( (month + 1) +"/" + due + "/" + year);
      }
    }
    else if(itemtype == 2){
      temp = (day+21);
      
      if(temp > months[month]){
      
         due = (temp - months[month]);
        
         System.out.println("The due date for this item will be");
         
         //testing for end of year
         if(month == 11){
          System.out.println( 1 +"/" + due + "/" + (year + 1));
         }
         else{
         System.out.println( (month + 2) +"/" + due + "/" + year);
        }
      }
      else{
        
        due = temp;
        
         System.out.println("The due date for this item will be");
         
         //testing for end of year
         if(month == 11){
          System.out.println( 1 +"/" + due + "/" + (year + 1));
         }
         else{
         System.out.println( (month + 1) +"/" + due + "/" + year);
        }
      }
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
