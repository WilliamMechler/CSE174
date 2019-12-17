/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date:10/23/2019
 * Assignment: Lab9Part1
 * File: Lab9Part1
 * Purpose: To make a method that will count how many times a character is in a String
 */
public class Lab9Part1 {
  
  
  public static void main(String[] args) { 
    System.out.println(CharCount("hello",'l'));
    System.out.println(CharCount("hello",'0'));
    System.out.println(CharCount("hello",'e'));
    System.out.println(CharCount("willl",'l'));
    System.out.println(CharCount("willl",'0'));
    System.out.println(CharCount("willl",'e'));
  }
  
  /**
    Counts the number of times a character is in a string
    @param  Input is the string we want to test 
    @parsm  Test is the character we are testing for
    @return will return the numbers of times a character is in a string
   */
  public static int CharCount(String Input, char Test){
    int Count = 0;
    for ( int i = 0; i < Input.length(); i++)
    {
      if ( Input.charAt( i) == Test) {
        Count++;
      }
    }
    return Count;
  }
}