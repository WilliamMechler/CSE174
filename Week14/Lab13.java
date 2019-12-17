/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 12/3/2019
 * Assignment: Lab 13
 * File: Lab13
 * Purpose: To implement and test the findInsertPosition method 
 */

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

		//making an array list of initial grades
		ArrayList<Integer> SortedList = new ArrayList<Integer>();

    //the returned Position
    int tempPosition = 0;

    SortedList.add(3);
    SortedList.add(5);
    SortedList.add(6);

  tempPosition = findInsertPosition(SortedList, 1);
  SortedList.add(tempPosition, 1);

  tempPosition = findInsertPosition(SortedList, 4);
  SortedList.add(tempPosition, 4);

  tempPosition = findInsertPosition(SortedList, 7);
  SortedList.add(tempPosition, 7);


  for(int i = 0; i < SortedList.size(); i++){

    System.out.println(SortedList.get(i));

  }

}

  /**
  *Will take in an integer and add it to a sorted arraylist of sorted integer
  *@param list list is an arraylist of sorted integers
  *@param newValue newValue is the integer the user wants to add to the arraylist 
  *@return Will return the position in the arraylist the new integer should be added to the arraylist
  */
  public static int findInsertPosition(ArrayList<Integer> list, int newValue){

    if(newValue < list.get(0)){

      
      return 0;

    }

    if(newValue > list.get(list.size()-1)){

      
      return (list.size());

    }

    for(int i = 1; i < list.size(); i++){

    if( newValue < list.get(i) && newValue > list.get(i-1)){

      return i;

    }

   }

    return 1;
  }
}