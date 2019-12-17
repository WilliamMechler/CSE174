/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/23/2019
 * Assignment: Lab9Part3
 * File: Lab9Part3
 * Purpose: To find the number of vowels in a string
 */
public class Lab9Part3 {
  
  
  public static void main(String[] args) { 
    System.out.println(countVowels("eeee"));
    System.out.println(countVowels("EEEE"));
    System.out.println(countVowels("Eelt"));
    System.out.println(countVowels("wwwe"));
    System.out.println(countVowels("Aovb"));
                                                             
  }
  
  /**
    To find the number of vowels in a string
    @param  Str is the string that the users wants to know amount of vowels are in it
    @return will return the numbers of vowels in a string
   * 
   */
  public static int countVowels(String str){
    
    int totalVowels = 0;
    
    for(int i = 0; i < str.length(); i++){
      
      if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
        totalVowels++;
      }
      if(str.charAt(i) == 'e' || str.charAt(i) == 'E') {
        totalVowels++;
      }
      if(str.charAt(i) == 'i' || str.charAt(i) == 'I') {
        totalVowels++;
      }
      if(str.charAt(i) == 'o' || str.charAt(i) == 'O') {
        totalVowels++;
      }
      if(str.charAt(i) == 'u' || str.charAt(i) == 'U') {
        totalVowels++;
      }
    }
    
    return totalVowels;
    
  }
  
}
