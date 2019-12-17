/** 
  * Name: William Mechler 
  * Course: CSE 174 MA 
  * Instructor: Dave Woods 
  * Lab 3 - Part 2
  * Purpose: To create seven variables for each java data types to get
  *          ues to formatting
  */
public class DataTypePractice {
  
  
  public static void main(String[] args) { 
    int aint = 150;
    long along = 15987321;
    byte abyte = 118;
    short ashort = 23023;
    float afloat = 89.34f;
    double adouble = 48.8762;
    char achar = '$';
    int largestint= 2147483647;
    
    System.out.printf("%-10s%10d" ,"aint",aint);
    System.out.println("");
    System.out.printf("%-10s%10d" ,"along",along);
    System.out.println("");
    System.out.printf("%-10s%10d" ,"abyte",abyte);
    System.out.println("");
    System.out.printf("%-10s%10d" ,"ashort", ashort);
    System.out.println("");
    System.out.printf("%-10s%10.2f" ,"afloat",afloat);
    System.out.println("");
    System.out.printf("%-10s%10.2f" ,"adouble",adouble);
    System.out.println("");
    System.out.printf("%-10s%10.2s","achar" , achar);
    System.out.println("");
    System.out.println("largestint  " + largestint);
  }
  
  /* ADD YOUR CODE HERE */
  
}