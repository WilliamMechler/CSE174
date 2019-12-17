/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 9/18/2019
 * Assignment: Lab 4 - Programming part 1
 * File:ProficiencyPractice
 * Purpose: To have the user enter a short sentence and display 
 * infomation about the sentence
 */

import java.util.Scanner;

public class Proficiency1Practice {
  
  
  public static void main(String[] args) {
    
    //temp = the whole sentence and temparray is an array of the words in temp
    String temp = "";
    String [] temparray;
    
    //The three words to put in order
    String a = "";
    String b = "";
    String c = "";
    
    //The final output with temp when sorting
    String A = "";
    String B = "";
    String C = "";
    String T = "";
    
    /*User input*/
    System.out.println("Please enter a complete sentence.");
    Scanner scan = new Scanner( System.in );
    temp = scan.nextLine();
    
    
    //using the split method to make an array of the words in the sentence 
    temparray = temp.split(" ");
    
    //using the length method to output the total number of characters
    System.out.println("The total number of characters are.");
    System.out.println(temp.length() + "\n");
    
    //Outputing the first word in the sentence
    System.out.println("The frist word is below.");
    System.out.println(temparray[0] + "\n");
    
    //Using the length method to find the length of the first word
    System.out.println("The frist word as this many characters.");
    System.out.println(temparray[0].length() + "\n");
    
    //Asking the user for three words
    System.out.println("Please enter three words seperated by a space");
    temp = scan.nextLine();
    scan.close();
    //using split method to seperated the three words
    temparray = temp.split(" ");
    
    //Assigning each word to a variable
    a = temparray[0].toLowerCase();
    b = temparray[1].toLowerCase();
    c = temparray[2].toLowerCase();
    
    
    //Testing to see if a is the largest
    if( a.compareTo(b) <= 0 && a.compareTo(c) <= 0){
      A = a;
      if( b.compareTo(c) < 0){
        B = b;
        C = c;
      }
      else{
        B = c;
        C = b;
      }
    }
    //Testing to see if b is the largest
    if( b.compareTo(a) <= 0 && b.compareTo(c) <= 0){
      A = b;
      if( a.compareTo(c) < 0){
        B = a;
        C = c;
      }
      else{
        B = c;
        C = a;
      }
    }
    //Testing to see if c is the largest
    if( c.compareTo(a) <= 0 && c.compareTo(b) <= 0){
      A = c;
      if( a.compareTo(b) < 0){
        B = a;
        C = b;
      }
      else{
        B = b;
        C = a;
      }
    }
    //outputing the three words in order
    System.out.println("The three words are sorted alphabetical below");
    System.out.println(A + " " + B + " " + C);
  } // End of main
  
  /* ADD YOUR CODE HERE */
  
}
