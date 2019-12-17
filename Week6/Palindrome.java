/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/2/2019
 * Assignment: Lab 6 - Palindrome
 * File: Palindrome
 * Purpose: To have the user enter an unknown string and to test to see
 *          if that string is a palindrome
 */
import java.util.Scanner;

public class Palindrome {
  
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);
    String in = "";
    String test = "";
    int flag = 0;


    //Asking the user to input a word or sentence
    System.out.println("Please enter a word or sentence below that you beileve to be a palindrome");
    in = scan.nextLine();

    //Closing the scanner
    scan.close();

    //Making the testing variable with no spaces and all lower case
    test = in.replaceAll(" ", "").toLowerCase();

    //testing to make sure it is a palindrome
    for(int i = 0; i<=test.length()-1; i++){

      //breaking the loop if it is not a palindrome
      if(test.charAt(i) != test.charAt((test.length()-1)-i)){
        System.out.println("Your input >  " + in);
        System.out.println("It is not a palindrome");
        flag = 1;
        break;
      }
    }

    //if it makes it out of the loop than it is a palindrome
    if(flag == 0){
      System.out.println("Your input >  " + in);
      System.out.println("It is a palindrome");
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
