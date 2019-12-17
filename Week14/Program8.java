import java.util.*;

public class Program8 {

	public static void main(String[] args) {
	
	    int itemtype = 0;
	    
		//making an instances of the Calendar class
		Calendar CurrentDate = Calendar.getInstance(); 
		
		Calendar DueDate = Calendar.getInstance();
	    
	    Scanner scan = new Scanner( System.in );
	    
	    //item 1 is 14 days and item 2 is 21 days
	    System.out.println("Please enter the type of item being checked out");
	    System.out.println("For new releases please enter a 1");
	    System.out.println("For regular books please enter a 2");
	    System.out.println("For Videos please enter a 3");
	    itemtype = scan.nextInt();
	    
	    CurrentDate = GetCurrentDateMenu();
	    
	    DueDate = GetDueDate(CurrentDate, itemtype);
	    
	    DisplayDueDate(DueDate);
	    
	    scan.close();

	    
	}
	
	/**
	 *To get the date the item is being checked out
	 *@return A calendar instance with the current date with the user's input
	 */
	 public static Calendar GetCurrentDateMenu() {
		 
		 int month = 0;
		 int day = 0;
		 int year = 0;
		 
		//making an instance of the Calender class
		Calendar CurrentDate = Calendar.getInstance();
		 
		    Scanner scan = new Scanner( System.in );
		 
		    //Having the user enter the month
		    System.out.println("Please enter the month this item is being checked below");
		    System.out.println("Enter 1 for January or 12 for December");
		    month = (scan.nextInt() - 1);
	    
		    
		    //Having the user enter the day of the month
		    System.out.println("Please enter the day of the month this item is being checked below");
		    day = scan.nextInt();
		    
		    
		    //Having the user enter the year
		    System.out.println("Please enter the year this item is being checked below");
		    year = scan.nextInt();
		    
			CurrentDate.set(year, month, day);
		 
		 return CurrentDate;
	 }
	 
	
	/**
	*To get the due date of an item
	*@param CurrentDate The date the item was checked outed
	*@param itemtype the type of item that was checked outed
	*@return A calendar instance with the due date of the item
	*/
	 public static Calendar GetDueDate(Calendar CurrentDate, int itemtype) {
		 
			//making an instance of the Calendar class based on the Current date
			Calendar DueDate = CurrentDate;
			
			int NewReleases = 14;
			int RegularBooks = 21;
			int Videos = 3;
			
			//Adding the straight time the item can be checked outed
			if(itemtype == 1) {
				
				DueDate.add(Calendar.DATE, NewReleases);
			}
			else if(itemtype == 2) {
				
				DueDate.add(Calendar.DATE, RegularBooks);
			}
			else if(itemtype == 3) {
				
				DueDate.add(Calendar.DATE, Videos);
			}
			
			
			//Checking to see if the due date is on a Sunday.
			if(DueDate.get(Calendar.DAY_OF_WEEK) == 1) {
				
				DueDate.add(Calendar.DATE, 1);
			}
			
		 return DueDate;
	 }
	 

	/**
	*To display the due date of the item
	*@param DueDate A calendar object with the due date of the checked outed item
	*/
	 public static void DisplayDueDate(Calendar DueDate) {
		 
		 System.out.println("\nThe Due Date for the item is");
		 System.out.println((DueDate.get(Calendar.MONTH) + 1 ) + "/" + DueDate.get(Calendar.DAY_OF_MONTH) + "/" + DueDate.get(Calendar.YEAR));
	 }
}
