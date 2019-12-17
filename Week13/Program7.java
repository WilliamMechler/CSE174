/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/20/2019
 * Assignment: Program 7
 * File: Program7
 * Purpose: 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program7 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner to read file
		File InputFile = new File("C:\\Users\\willm\\Desktop\\Grades1.txt");
		Scanner scan = new Scanner(InputFile);
		
		//Scanner for user input
		Scanner UserInput = new Scanner(System.in);
		
		//making an array list of initial grades
		ArrayList<Double> InitialGrades = new ArrayList<Double>();
		
		//making an array list for adjusted grades
		ArrayList<Double> AdjustedGrades = new ArrayList<Double>();
		
		//The amount of students enrolled in a class
		int EnrolledStudents = 0;
		
		//Asking for the amount of students in a enrolled in a class
		System.out.println("Please enter the amount of students enrolled in your class");
		EnrolledStudents = UserInput.nextInt();
		
		InitialGrades = OpenFile(EnrolledStudents, scan);
		
		DisplaySummary(InitialGrades);
		
		AdjustedGrades = MenuAdjustGrades(InitialGrades);
		
		MenuWriteOutputFile(InitialGrades, AdjustedGrades);
	}
	
	/**
	 *To open the file and make an array list of the initial grades
	 *@param Length length is the amount of students enrolled in the class
	 *@param file file is the file being opened
	 *@return The day of the week in English
	 */
	public static ArrayList<Double> OpenFile(int length, Scanner file){
		
		//making an array list of initial grades
		ArrayList<Double> FileGrades = new ArrayList<Double>();
		
		while(file.hasNextLine()) {
			
			FileGrades.add(Double.parseDouble(file.nextLine()));
			
		}
		
		return FileGrades;
	}
	
	
	/**
	 *To find the amount of students with an A
	 *@param Grades Grades is the array list with all of the grades
	 *@return The amount of students with an A
	 */
	public static int CountGradeA(ArrayList<Double> Grades) {
		
		int count = 0;
		
		for (Double grade: Grades) {
			if(grade >= 90.0) {
				count++;
			}
			
		}
		
		return count;
	}
	
	/**
	 *To find the amount of students with an B
	 *@param Grades Grades is the array list with all of the grades
	 *@return The amount of students with an B
	 */
	public static int CountGradeB(ArrayList<Double> Grades) {
		
		int count = 0;
		
		for (Double grade: Grades) {
			
			if(grade >= 80.0 && grade < 90.0) {
				count++;
			}
			
		}
		
		return count;
	}
	
	/**
	 *To find the amount of students with an C
	 *@param Grades Grades is the array list with all of the grades
	 *@return The amount of students with an C
	 */
	public static int CountGradeC(ArrayList<Double> Grades) {
		
		int count = 0;
		
		for (Double grade: Grades) {
			
			if(grade >= 70.0 && grade < 80.0) {
				count++;
			}
			
		}
		
		return count;
	}
	
	/**
	 *To find the amount of students with an D
	 *@param Grades Grades is the array list with all of the grades
	 *@return The amount of students with an D
	 */
	public static int CountGradeD(ArrayList<Double> Grades) {
		
		int count = 0;
		
		for (Double grade: Grades) {
			
			if(grade >= 60.0 && grade < 70.0) {
				count++;
			}
			
		}
		
		return count;
	}
	
	/**
	 *To find the amount of students with an F
	 *@param Grades Grades is the array list with all of the grades
	 *@return The amount of students with an F
	 */
	public static int CountGradeF(ArrayList<Double> Grades) {
		
		int count = 0;
		
		for (Double grade: Grades) {
			
			if(grade < 60.0) {
				count++;
			}
			
		}
		
		return count;
	}
	
	/**
	 *To find the total amount of students
	 *@param Grades Grades is the total list of grades
	 *@return The total amount of students
	 */
	public static int CountStudents(ArrayList<Double> Grades) {
		int count = 0;
		
		count = count + CountGradeA(Grades);
		count = count + CountGradeB(Grades);
		count = count + CountGradeC(Grades);
		count = count + CountGradeD(Grades);
		count = count + CountGradeF(Grades);
		
		return count;
	}
	
	/**
	 *To find the lowest grade
	 *@param Grades Grades is the total list of grades
	 *@return The lowest grade
	 */
	public static Double GetLowestGrade(ArrayList<Double> Grades) {
		Double low = Double.MAX_VALUE;
		
		for (Double grade: Grades) {
			
			if(grade < low) {
				low = grade;
			}
			
		}
		
		return low;
	}
	
	/**
	 *To find the lowest grade
	 *@param Grades Grades is the total list of grades
	 *@return The lowest grade
	 */
	public static Double GetHighestGrade(ArrayList<Double> Grades) {
		Double high = 0.0;
		
		for (Double grade: Grades) {
			
			if(grade > high) {
				high = grade;
			}
			
		}
		
		return high;
	}
	
	/**
	 *To find the average grade
	 *@param Grades Grades is the total list of grades
	 *@return The average grade
	 */
	public static Double GetAvgGrade(ArrayList<Double> Grades) {
		Double sum = 0.0;
		
		for (Double grade: Grades) {
			
			sum = sum + grade;
			
		}
		
		return (sum / Grades.size());
	}
	
	/**
	 *To find the average grade
	 *@param Grades Grades is the total list of grades
	 */
	public static void DisplaySummary(ArrayList<Double> Grades) {
		
		
	System.out.println("Grade Summary" + "\n");
	
	System.out.println("Lowest Grade" + "   " + GetLowestGrade(Grades) + "\n");
	
	System.out.println("Highest Grade" + "  " + GetHighestGrade(Grades) + "\n");
	
	System.out.println("Grade Count" + "\n");
	
	System.out.println("A  " + CountGradeA(Grades) + "\n");
	
	System.out.println("B  " + CountGradeB(Grades) + "\n");
	
	System.out.println("C  " + CountGradeC(Grades) + "\n");
	
	System.out.println("D  " + CountGradeD(Grades) + "\n");
	
	System.out.println("F  " + CountGradeF(Grades) + "\n");
		
		
	}
	
	/**
	 *To ask the user how they would like to adjust the grades
	 *@param Grades An arraylist containing all of the inital grades
	 *@return An arraylist of the grades changed by the last adjustment
	*/
	public static ArrayList<Double> MenuAdjustGrades(ArrayList<Double> Grades){
		
		//making an array list of grades to be adjusted
		ArrayList<Double> AdjustedGrades = Grades;
		
		//Scanner for user input
		Scanner scan = new Scanner(System.in);
		
		
		
		boolean MakeAdjustments = true;
		
		//The option the user picked
		int Userinput = 0;
		
		do {
			
			//To control the loop
			boolean valid = false;
			
			//Resetting the AdjustedGrades
            AdjustedGrades = Grades;
			
			//Asking for which type of adjustment the user wants to do
			System.out.print("\n \nEnter 1 to add a fixed adjustment to ever grade  \nEnter 2 to adjust everystudent’s grade by a percentage");  
			while(valid == false) {
			      while(!scan.hasNextInt()) {            
			       
			        String garbage = scan.nextLine();
			        System.out.print("Please enter a 1 or a 2 ");           
			      } // End while loop.
			      
			      // read the integer
			      Userinput = scan.nextInt();
			      
			      if(Userinput == 1 || Userinput == 2) {
			    	  valid = true;
			      }

			}
			
			if(Userinput == 1) {
				
				DisplaySummary(AdjustedGrades = AdjustGradesFix(Grades));
				
			}
			
			if(Userinput == 2) {
				
				DisplaySummary(AdjustedGrades = AdjustGradesPercentage(Grades));
			}
			
			System.out.println(" \n \nDo you want to make another adjustment 1 to contuine");
			int ans = scan.nextInt();
			
			if(ans == 1) {
				
				MakeAdjustments = true;
			}
			else {
				
				MakeAdjustments = false;
			}
			
			
		}while(MakeAdjustments);
		
		
		
		return AdjustedGrades;
		
	}
	
	/**
	 *To adjust the grades at a fix adjustment
	 *@param Grades the arraylist with the grades to be adjusted
	 *@return Will return the Grades after thir adjustments
	*/
	public static ArrayList<Double> AdjustGradesFix(ArrayList<Double> Grades){
		
		//Scanner for user input
		Scanner scan = new Scanner(System.in);
		
		//making an array list of grades to be adjusted
		ArrayList<Double> AdjustedGrades = new ArrayList<Double>();
		
		System.out.println("Please enter the fix adjustment you wish to add to each students grades below");
		double adjustment = Double.parseDouble(scan.nextLine().trim());
		
		 for (int i = 0; i < Grades.size(); i ++) {
			
			 Double temp = (Grades.get(i) + adjustment);
			 AdjustedGrades.add(temp);

		 }
		
		
		 
		 return AdjustedGrades;
		
	}
	
	/**
	 *To adjust the grades at a percentage adjustment
	 *@param Grades the arraylist with the grades to be adjusted
	 *@return Will return the Grades after thir adjustments
	*/
	public static ArrayList<Double> AdjustGradesPercentage(ArrayList<Double> Grades){
		
		
		//Scanner for user input
		Scanner scan = new Scanner(System.in);
		
		//making an array list of grades to be adjusted
		ArrayList<Double> AdjustedGrades = new ArrayList<Double>();
		
		System.out.println("Please enter the percentage adjustment you wish to add to each students grades below");
		double adjustment = Double.parseDouble(scan.nextLine().trim());
		
		 for (int i = 0; i < Grades.size(); i ++) {
			
			 Double temp = (Grades.get(i) + (Grades.get(i) * (adjustment/100)));
			 AdjustedGrades.add(temp);

		 }
		
		
		 
		 return AdjustedGrades;
	}
	
	
	/**
	 *To adjust the grades at a percentage adjustment
	 *@param InitalGrades the arraylist with the intial grades
	 *@param AdjustedGrades the arraylist with intial grades
	 *@throws FileNotFoundException 
	*/
	public static void MenuWriteOutputFile(ArrayList<Double> InitialGrades, ArrayList<Double> AdjustedGrades) throws FileNotFoundException {
		
		//Scanner for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter 1 if you want to save your adjustments\nEnter a 2 if you want to discard your adjustments");
		int ans = scan.nextInt();
		
		if(ans == 1) {
			WriteOutputFile(AdjustedGrades);
		}
		if(ans == 2) {
			WriteOutputFile(InitialGrades);
		}
	}
	

	/**
	 *To print out the output file
	 *@param Grades the arraylist of grades to be printed out onto a text file
	 *@throws FileNotFoundException 
	*/
	public static void WriteOutputFile(ArrayList<Double> Grades) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter("C:\\Users\\willm\\Desktop\\Grades-Final.txt");
		
		for(Double grade: Grades) {
			out.print(grade);
			out.print("\n");
		}
		
		out.close();
	}

}

