import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Main {
    public static void main(String[] args) {
    /* Declare/initiate variables */
      Scanner scan = new Scanner(System.in);
      
      /*Call Methods*/
      System.out.println( "Enter the length and width of a rectangle.");
      System.out.println( "Enter the first positive number->");
      double x = scan.nextDouble();
      System.out.println( "Enter a second positive number->");
      double y = scan.nextDouble();
      double area = calcArea( x, y );
      double perim = calcPerim( x, y );
      System.out.println( " The area is " + area + " and the perimeter is " + perim +".");

    }

    public static double calcPerim(double x, double y){
     //Making a temp to be a place holder for perim
     double temp = 0.0;
     // Calculate the perimeter here
    temp = (x * 2) + (y * 2);

     return temp;
   }//End method

    public static double calcArea(double x, double y){
     //Making a temp to be a place holder for area
     double temp = 0.0;
     // Calculate the perimeter here
    temp = x * y;

     return temp;
   }//End method
    
   
}