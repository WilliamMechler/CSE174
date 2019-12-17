/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/20/2019
 * Assignment: Lab 12 Part 1
 * File: Lab12Part1
 * Purpose: To sort an array of integers and strings using a bubble sort
 */
public class Lab12Part1 {
  
  public static void main(String[] args) { 
     
    int NumArray [] = {5,6,3,2,10,11,12,9,1,0};
    String StrArray [] = {"Dog","cat","dog","123","apple","each","zoo","Apple"};
    
   //Sorting the integer array
   int [] NewNumArray = IntgerSort(NumArray);
   
   //Setting the old array to the sorted array
   NumArray = NewNumArray;
    
   //Sorting the string array
   StringSort(StrArray);
   
   //Sorting the String array
   String [] NewStrArray = StringSort(StrArray);
   
   //Setting the old array to the sorted array
   StrArray = NewStrArray;
   
   //Outputting the two arrays to test that they actually sorted
   
   for(int i = 0; i < NumArray.length; i++) {
	   
	   System.out.println(NumArray[i]);
   }
   
  for(int j = 0; j < StrArray.length; j++) {
	   
	  System.out.println(StrArray[j]);
	   
   }
    
    
  }
  
 /**
 *Sorting an Integer array using the bubble sort
 *@param arr is the Integer array to be sorted
 *@return A sorted Integer array
 */
 public static int[] IntgerSort(int arr[]) {
	 
	 
     for (int i = 0; i < arr.length; i++) {
    	 
         for (int j = 0; j < arr.length-i-1; j++) {
        	 
             if (arr[j] > arr[j+1]) 
             { 
                 int swap = arr[j];
                 
                 arr[j] = arr[j+1]; 
                 
                 arr[j+1] = swap; 
             } 
             
         }// end of inner loop
     }// end of outer loop
	 
   return arr;
} 
  
  
/**
 *Sorting an Integer array using the bubble sort
 *@param arr is the String array be sorted
 *@return A sorted string array
 */
 public static String[] StringSort(String arr[]) {
  
		for (int j = 0; j < arr.length; j++) {
			
		   	   for (int i = j + 1; i < arr.length; i++) {
		   		   
				
				if (arr[i].compareTo(arr[j]) < 0) {
					
					String swap = arr[j];
					
					arr[j] = arr[i];
					
					arr[i] = swap;
					
				}
				
			   } // end of inner loop
			   
			}// end of outer loop
		
    return arr;
}
 
}
