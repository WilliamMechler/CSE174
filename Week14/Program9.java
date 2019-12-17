/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 12/4/2019
 * Assignment: Program 9
 * File: Program9
 * Purpose: 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Program9 {

	public static void main(String[] args) {
	
		//making an array list of initial grades
		ArrayList<Double> SortedList = new ArrayList<Double>();
		
		AddNumbers(SortedList);
		
		DisplayList(SortedList);
		

	}
	
	/**
	 *To have the user enter doubles to be put into the array list
	 *@param list the array list that the user's input will be added to
	 */
	public static void AddNumbers(ArrayList<Double> list) {
		
		boolean AddNumber = true;
		
		 // Making my scanner
		 Scanner scan = new Scanner( System.in );
		 
	do {
		
		System.out.println("Enter a double below to add it to the arraylist. \nOR enter anything else to see the final array list");
		if(scan.hasNextDouble()) {
			
			Double num = scan.nextDouble();
			
			SortNewNumber(list, num);
			
		}
		else {
			
			AddNumber = false;
		}
		
	}while( AddNumber);
	
	
  }
	
	/**
	 *To sort the new numbers being added to the array list
	 *@param list list is the array list the double will be added to
	 *@param newValue newValue is the new double being added to the array
	 */
	public static void SortNewNumber(ArrayList<Double> list, Double newValue) {
		
		if(list.size() == 0){

		    
			list.add(newValue);
			
			return;

		  }
		
		if(newValue < list.get(0)){

		    
			list.add(0, newValue);
			
			return;

		  }

		  if(newValue > list.get(list.size()-1)){

		    
		   
			  list.add(list.size(), newValue);
			  
			  return;

		  }

		  for(int i = 1; i < list.size(); i++){

		  if( newValue < list.get(i) && newValue > list.get(i-1)){

		  
			  list.add(i, newValue);
			  
			  return;

		  }

		 }
		
	}
	
	//here
	/**
	 *To display the array list to the console
	 *@param list the array list to be displayed to the console
	 */
	public static void DisplayList(ArrayList<Double> list) {
		
		for(Double item : list) {
			System.out.println(item);
		}
	}

}
