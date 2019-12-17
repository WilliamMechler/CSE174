
/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/22/2019
 * Assignment: Program 6
 * File: Program6
 * Purpose: To turn a fix file formatted text file into a fix formatted csv file
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program6 {

  //Start and end of Data
  public static final int FirstStart = 0;
  public static final int FirstEnd = 14;
  public static final int LastStart = 15;
  public static final int LastEnd = 29;
  public static final int SocialStart = 60;
  public static final int SocialEnd = 68;
  public static final int DOBStart = 69;
  public static final int DOBEnd = 78;
  
 public static void main(String[] args) throws FileNotFoundException {
  
  //Scanner to read file
  Scanner scan = new Scanner(new File("C:\\Users\\mechlewg\\Desktop\\ReadWrite.txt"));
  
  //Making printWriting
  PrintWriter writer = new PrintWriter(new File("C:\\Users\\mechlewg\\Desktop\\ProgramOutput.txt"));
  
  //Skipping the frist line
  String trash = scan.nextLine();
  
  //Reading through the file
  while(scan.hasNextLine()) {
 
   WriteCsvField(writer,scan.nextLine());
  }
  
  //Closing the scanner and print writer
  scan.close();
  writer.close();
  
 }
 
 
 /**
 *Getting a substring from a string given it's start and end position
 *@param line The string being split up
 *@param start Where the data starts in the String
 *@param end Where the data ends in the String
 *@return The String parsed from the String
 */
 public static String ParseField(String line, int start, int end) {
  
  //The start of the sub string
  String sub = "";
  
  for(int i = start; i<= ( end ); i++) {
   
   sub = sub + String.valueOf(line.charAt(i));
  }
  
  return (sub.toLowerCase().trim());
 }
 
 
 /**
 *Finding the age of someone given their date of birth
 *@param date is the date of birth of the person
 *@return The age of the person given the current date
 */
 public static int CalcAge(String date) {
  
  //The age of the person
  int age = 0;
  
  //The current day month and year
  int Cday = 22;
  int Cmonth = 10;
  int Cyear = 2019;
  
  //temp values for the day, month and year --> date 01/34/6789
  int day = Integer.parseInt(String.valueOf(date.substring(0,2)));
  int month = Integer.parseInt(String.valueOf(date.substring(3, 5)));
  int year = Integer.parseInt(String.valueOf(date.substring(6, 10)));
  
  
  if(month < Cmonth) {
   
   age = Cyear - year;
  }
  else if (month == Cmonth) {
   
   if(day >= Cday) {
    
    age = Cyear - year ;
   }
   else {
    
    age = Cyear - year - 1;
   }
   
  }
  else if (month > Cmonth) {
   
   age = Cyear - year - 1;
  }
  
  return age;
 }
 
 
 
 /**
 *To write the infomation to a CSV file
 *@param writer the printer writer used to output the data to a new file
 *@param Line the string used to get the info to make the new file
 */
 public static void WriteCsvField(PrintWriter writer,String Line) {
  
  //Printing the infomation to the new file
  writer.print(ParseField(Line,FirstStart,FirstEnd) + ",");
  
  writer.print(ParseField(Line,LastStart,LastEnd) + ",");
  
  writer.print(ParseField(Line,SocialStart,SocialEnd) + ",");
  
  writer.print(ParseField(Line,DOBStart,DOBEnd) + ",");
  
  writer.print(CalcAge(ParseField(Line,DOBStart,DOBEnd)));
  
  writer.println("\n");
  
 }

}

