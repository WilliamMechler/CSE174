/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/9/2019
 * Assignment: Lab7Part1
 * File: Lab7Part1
 * Purpose: To open a file and then to write "Hello World!" to that file
 *          then to read that out
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab7Part1 {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter out = new PrintWriter("C:\\Users\\mechlewg\\Desktop\\hello.txt");
    	        out.print("Hello World!");
    	        out.close();
		Scanner scan = new Scanner(new File("C:\\Users\\mechlewg\\Desktop\\hello.txt"));
	    
	    
	    if(scan.hasNext()){
	    
	      String x = scan.nextLine();
	      
	      System.out.println(x);
	    }
	
	   
	    scan.close();

	}

}
