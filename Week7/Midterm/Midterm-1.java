/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/20/2019
 * Assignment: Midterm
 * File: Midterm
 * Purpose: To read a text file in a fixed format to get infomation from.
 * Then to output that same file with messing it up.
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Midterm {

 public static void main(String[] args) throws FileNotFoundException {
  
  //Scanner to read file
  Scanner scan = new Scanner(new File("C:\\Users\\willm\\Desktop\\midterm.txt"));
  
  //Printer to write to new file
  PrintWriter out = new PrintWriter("C:\\Users\\willm\\Desktop\\midterm-out.txt");
  
  //Flag for skipping the first six lines
  int flag = 0;
  
  //Fix Format info
  String fn = "";
  String ln ="";
  int age = 0;
  double CIncome = 0.0;
  double CSaving = 0.0;
  double Raise = 0.0;
  
  //The Given values
  double Interest = .07;
  int Reage = 70;
  double Withper = .04;
  double Saverate = .15;
  
  //Found info
  double HighI = 0.0;
  double SaveYear = 0.0;
  double TotalS = 0.0;
  double ReIncome = 0.0;
  
  //counting current income
  int AgeGroup[] = new int[6];
  double minCI = Double.MAX_VALUE;
  double maxCI = 0;
  double sumCI = 0;
  
  //counting total savings
  double minTS = Double.MAX_VALUE;
  double maxTS = 0;
  double sumTS = 0;
  
  //counting Retirement Income
  double minRI = Double.MAX_VALUE;
  double maxRI = 0;
  double sumRI = 0;
  double AvgReIn[] = new double[6];
  
  //counting total people
  int totalpeople = 0;
  
  //counting sum of retirement Incom based on age
  
  while(scan.hasNextLine()) {
   
   //Skipping the first six lines
   if(flag == 0) {
    
    fn = scan.nextLine();
    out.println(fn);
    fn = scan.nextLine();
    out.println(fn);
    fn = scan.nextLine();
    out.println(fn);
    fn = scan.nextLine();
    out.println(fn);
    fn = scan.nextLine();
    out.println(fn);
    fn = scan.nextLine();
    out.println(fn);
    
    flag++;
   }
   
   
   
   // reading the info for each person
   fn = scan.nextLine().trim();
   ln = scan.nextLine().trim();
   age = Integer.parseInt(scan.nextLine().trim());
   CIncome = Double.parseDouble(scan.nextLine().trim());
   CSaving = Double.parseDouble(scan.nextLine().trim());
   Raise = Double.parseDouble(scan.nextLine().trim());
   
   //Outputting to new file
   out.println(fn);
   out.println(ln);
   out.printf("%5s%-10d%6s"," ",age,"\n");
   out.printf("%5s%-10.2f%6s", " ",CIncome,"\n");
   out.printf("%5s%-10.2f%6s", " ",CSaving,"\n");
   out.printf("%5s%-10.4f%6s", " ",Raise,"\n");
   
   //Using the equations given to us
   HighI = (CIncome *Math.pow((1+Raise), (Reage - age)));
   SaveYear = (HighI * Saverate);
   //totalsavings=((currentSavings +( SavePerYear *.38 )) * power(1+ Interest,(RetirementAge-age)) +( SavePerYear *.62))
   TotalS = ((CSaving +(SaveYear *.38))*Math.pow((1+Interest), (Reage - age)) + (SaveYear * .62)); 
   ReIncome = ((TotalS * Withper) /12);
   
   //testing for min and max for current income
   if(CIncome > maxCI) {
    maxCI = CIncome;
   }
   if(CIncome < minCI) {
    minCI = CIncome;
   }
   sumCI = sumCI + CIncome;
   
   //testing for the min and max for total savings
   if(TotalS > maxTS) {
    maxTS = TotalS;
   }
   if(TotalS < minTS) {
    minTS = TotalS;
   }
   sumTS = sumTS + TotalS;
   
   //testing for the min and max for retirement income
   if(ReIncome > maxRI) {
    maxRI = ReIncome;
   }
   if(ReIncome < minRI) {
    minRI = ReIncome;
   }
   sumRI = sumRI + ReIncome;
   
   
   //age groups 20-29 30-39 40-49 50-59 60-69 other
   // age array  0      1    2     3     4     5
   if(age >= 20 && age <= 29) {
    AgeGroup[0] = AgeGroup[0] +1;
    AvgReIn[0] = AvgReIn[0] + ReIncome;
   }
   else if(age >= 30 && age <= 39) {
    AgeGroup[1] = AgeGroup[1] +1;
    AvgReIn[1] = AvgReIn[1] + ReIncome;
   }
   else if(age >= 40 && age <= 49) {
    AgeGroup[2] = AgeGroup[2] +1;
    AvgReIn[2] = AvgReIn[2] + ReIncome;
   }
   else if(age >= 50 && age <= 59) {
    AgeGroup[3] = AgeGroup[3] +1;
    AvgReIn[3] = AvgReIn[3] + ReIncome;
   }
   else if(age >= 60 && age <= 69) {
    AgeGroup[4] = AgeGroup[4] +1;
    AvgReIn[4] = AvgReIn[4] + ReIncome;
   }
   else {
    AgeGroup[5] = AgeGroup[5] +1;
    AvgReIn[5] = AvgReIn[5] + ReIncome;
   }
   
   //counting the number of people
   totalpeople++;
   
  } // end of reading and writing the files
  
  //Closing my scanner and print writer
  out.close();
  scan.close();
  
  //the age bracket
  System.out.println("Below is the number of individuals by age bracket \n");
  System.out.printf("%-10s%3d","20-29",AgeGroup[0] );
  System.out.println();
  System.out.printf("%-10s%3d","30-39",AgeGroup[1] );
  System.out.println();
  System.out.printf("%-10s%3d","40-49",AgeGroup[2] );
  System.out.println();
  System.out.printf("%-10s%3d","50-59",AgeGroup[3] );
  System.out.println();
  System.out.printf("%-10s%3d","60-69",AgeGroup[4] );
  System.out.println();
  System.out.printf("%-10s%3d","Other",AgeGroup[5] );
  System.out.println();
  System.out.println();
  
  //min max avg current income
  System.out.println("Below is the min, max, and average of the current income of all individuals \n");
  System.out.printf("%-10s%1s%,-20.2f","Min", "$" ,(minCI) );
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","Max", "$" ,(maxCI) );
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","Average", "$" ,(sumCI / totalpeople) );
  System.out.println();
  System.out.println();
  
  //min max avg total savings
  System.out.println("Below is the min, max, and average for the total savings of all individuals \n");
  System.out.printf("%-10s%1s%,-20.2f","Min", "$" ,(minTS) );
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","Max", "$" ,(maxTS) );
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","Average", "$" ,(sumTS / totalpeople) );
  System.out.println();
  System.out.println();
  
  //min max avg retirement income
  System.out.println("Below is the min, max, and average for the retirement income of all individuals \n");
  System.out.printf("%-10s%1s%,-20.2f","Min", "$" ,(minRI) );
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","Max", "$" ,(maxRI) );
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","Average", "$" ,(sumRI / totalpeople) );
  System.out.println();
  System.out.println();
  
  //Average for retirement
  System.out.println("Below is the average retirement income divided into the age groups \n");
  System.out.printf("%-10s%,-20.2f","20-29",(AvgReIn[0] / AgeGroup[0]));
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","30-39", "$" ,(AvgReIn[1] / AgeGroup[1]));
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","40-49", "$" ,(AvgReIn[2] / AgeGroup[2]));
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","50-59", "$" ,(AvgReIn[3] / AgeGroup[3]));
  System.out.println();
  System.out.printf("%-10s%1s%,-20.2f","60-69", "$" ,(AvgReIn[4] / AgeGroup[4]));
  System.out.println();
  System.out.printf("%-10s%,-20.2f","Other",(AvgReIn[5] / AgeGroup[5]));
  System.out.println();
  System.out.println();
  
  
 }

}
