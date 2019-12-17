/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/9/2019
 * Assignment: Lab7Part2
 * File: Lab7Part2
 * Purpose: To open a file and and read that info into another file after
 *          modify the data
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab7Part2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//making my scanner and print writer
		Scanner scan = new Scanner(new File("C:\\Users\\mechlewg\\Desktop\\Lab7Input.txt"));
		PrintWriter out = new PrintWriter("C:\\Users\\mechlewg\\Desktop\\Lab7Ouput.txt");
		
		//counting the lines
		int count = 0;
		
		//a string used to store the line by line data
		String temp = "";
		
		//looping through the file
		while(scan.hasNextLine()) {
			count++;
			//setting temp to the line
			temp = scan.nextLine();
			//outputting to new file
			out.println("/* " + count + " */ " + temp);
		}
		
		scan.close();
		out.close();
		
		
	}

}
