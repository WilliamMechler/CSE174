/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/20/2019
 * Assignment: Lab 12 Part 2
 * File: Lab12Part2
 * Purpose: To test out the Calendar class for java
 */

import java.util.*;
import java.util.Scanner;

public class Lab12Part2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		//Geting the month
		System.out.println("Please enter the current month");
		int Currentmonth = (scan.nextInt()) - 1;
		
		//Geting the day
		System.out.println("Please enter the current day of the month");
		int Currentday = (scan.nextInt());
		
		//Geting the year
		System.out.println("Please enter the current year");
		int Currentyear = (scan.nextInt());
		
		//making an instance of the Calender class
		Calendar Cal = Calendar.getInstance(); 
		
		Cal.set(Currentyear, Currentmonth, Currentday);
		
		//Geting the year
		System.out.println("Please enter the amount of days you want to add to the date");
		int Amount = (scan.nextInt());
		
		//Adding the amount to the date
		Cal.add(Calendar.DATE, Amount);
		
		//displaying the date
		System.out.println(DisplayDayOfWeek(Cal) + "," + DisplayMonth(Cal) + "." + Cal.get(Calendar.DAY_OF_MONTH) + ","  + Cal.get(Calendar.YEAR));
	} 
	
	/**
	 *To display the day of the week as a string
	 *@param C is the current date being input
	 *@return The day of the week in English
	 */
	 public static  String DisplayDayOfWeek(Calendar C) {
		 
		  String day = "";
		  
		  //Testing what day of the week it is
		   switch(C.get(Calendar.DAY_OF_WEEK)){
		    case 1:
		        day="Sunday";
		        break;
		    case 2:
		        day="Monday";
		        break;
		    case 3:
		        day="Tuesday";
		        break;
		    case 4:
		        day="Wednesday";
		        break;
		    case 5:
		        day="Thursday";
		        break;
		    case 6:
		        day="Friday";
		        break;
		    case 7:
		        day="Saturday";
		        break;
		   }
		 
		 //Return the String value of the day of the week  
		 return day;
	 
} 
	 
	/**
    *To display the month as a string
	*@param C is the current date being input
	*@return The month of the date in English 
	*/
	public static  String DisplayMonth(Calendar C) {
			
		 String month = "";
		  
		  //Testing what day of the week it is  
		   switch(C.get(Calendar.MONTH)){
		    case 0:
		        month="January";
		        break;
		    case 1:
		        month="February";
		        break;
		    case 2:
		    	month="March";
		        break;
		    case 3:
		    	month="April";
		        break;
		    case 4:
		    	month="May";
		        break;
		    case 5:
		    	month="June";
		        break;
		    case 6:
		    	month="July";
		        break;
		    case 7:
		        month="August";
		        break;
		    case 8:
		        month="September";
		        break;
		    case 9:
		        month="October";
		        break;
		    case 10:
		        month="November";
		        break;
		    case 11:
		        month="December";
		        break;
		   }
		 
		 //Return the String value of the day of the week  
		 return month;
		
		
	}
	
	

}
