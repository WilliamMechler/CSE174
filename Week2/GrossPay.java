/**
 * Auto Generated Java Class.
 */

import java.util.Scanner; // Scanner needed for user input

public class GrossPay {
  
  
  public static void main(String[] args) { 
    double hours;
    double wage;
    Scanner keyboardReader = new Scanner(System.in);
    
    System.out.print("Enter your hours worked: ");
    hours = keyboardReader.nextDouble();
    System.out.print("");
    System.out.print("Enter your wage: ");
    wage = keyboardReader.nextDouble();
   
    
    Calc(hours, wage);
    
  }
  
  public static void Calc(double hours, double wage){
    double gross;
    
    gross = hours * wage;
    
    System.out.println("Your grosspay is " +"$" + gross);
  }
  
  /* ADD YOUR CODE HERE */
  
}
