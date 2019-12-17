/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/23/2019
 * Assignment: Lab9Part2
 * File: Lab9Part2
 * Purpose: To find and return the middle value of a string if odd and the middle values if even
 */
public class Lab9Part2 {
  
  
  public static void main(String[] args) { 
    System.out.println(Middle("miami"));
    System.out.println(Middle("five"));
    System.out.println(Middle("quick"));
  }
  
  /**
    To find and return the middle value of a string if odd and the middle values if even
    @param  Str is the string that the users wants to know the middle of
    @return will return the middle values of the string
   * 
   */
  public static String Middle(String str){
    
    String middle = "";
      
    if(str.length() % 2 == 0){
      
      middle = middle + str.charAt((str.length()/2)-1) + str.charAt((str.length()/2));
    }
    else if(str.length() % 2 != 0){
        
       middle = middle + str.charAt((str.length()/2));
    } 
     return middle;
  }
  
}
