/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/20/2019
 * Assignment: 
 * File: 
 * Purpose: 
 */



//Importing scanner
import java.util.Scanner;

public class BarCodeConverter {
  
	//public finals for the bar codes
	public static final String Bar0 = "||:::";
	public static final String Bar1 = ":::||";
	public static final String Bar2 = "::|:|";
	public static final String Bar3 = "::||:";
	public static final String Bar4 = ":|::|";
	public static final String Bar5 = ":|:|:";
	public static final String Bar6 = ":||::";
	public static final String Bar7 = "|:::|";
	public static final String Bar8 = "|::|:";
	public static final String Bar9 = "|:|::";
	
	
  public static void main(String[] args) { 

	//System.out.println(DigitToBar(2));
	//System.out.println(BarToDigit("::|:|"));
    //System.out.println(zipCodeToBarCode("17013"));
    //System.out.println(barCodeToZipCode("| :::|| |:::| ||::: :::|| ::||: |::|: |"));
    MenuMain();
  }
  
  //for used of the menu
  public static void MenuMain(){
  
	  //checking if in range
	  boolean inRange = false;
	  //Used to check user's input
	  String trash = "";
	  //User's Choice
	  int choice = 0;
	  // Making my scanner
	  Scanner scan = new Scanner( System.in );
	  
	  //Making space
	  System.out.println("\n");
	  System.out.println("\n");
	  System.out.println("\n");
	  //Printing out the menu
	  System.out.println("Menu:");
	  System.out.println("-----------------------");
	  System.out.println("1) Zip Code -> Bar Code");
	  System.out.println("2) Bar Code -> Zip Code");
	  System.out.println("3) Display Check Digit and Check Bar");
	  System.out.println("4) Exit");
	  System.out.println("-----------------------");
	  System.out.print("Choice: ");
	  
	 //checking for valid input
	 while(inRange == false) {
		  while(!scan.hasNextInt()) {
			  System.out.println("Invaild input, please enter a whole number from 1 to 4");
			  
			  trash = scan.next();
			  
		  }
		  
		  choice = scan.nextInt();
		  
		  if((choice > 0) && (choice < 5)) {  
		        inRange = true;
		  }
		  
		  if(!inRange) 
	      {
			  System.out.println("Invaild input, please enter a whole number from 1 to 4");           
	      } // End if statement.
	 }  
	  //Closing scan
	 scan.close();
	  //Calling up the different sub menu methods on what the user inputed
	  if(choice == 1) {
		  MenuZipToBar();
	  }
	  
	  if(choice == 2) {
		  MenuBarToZip();
	  }
	  
	  if(choice == 3) {
		  MenuCheck();
	  }
	  
	  if(choice == 4) {
		  MenuExit();
	  }
	  
	 
  }
  
  public static void MenuZipToBar(){
	  boolean inRange = false;
	  //Used to check user's input
	  String trash = "";
	  //User's Choice
	  int input = 0;
	  // Making my scanner
	  Scanner scan = new Scanner( System.in );
	//Asking for the area code
	System.out.println("Please enter an area code that is five digits long.");
	
	 //checking for valid input
	 while(inRange == false) {
		  while(!scan.hasNextInt()) {
			  System.out.println("Invaild input, please enter an area code from 11111 to 99999");
			  
			  trash = scan.next();
			  
		  }
		  
		  input = scan.nextInt();
		  
		  if((input > 11111) && (input < 99999)) {  
		        inRange = true;
		  }
		  
		  if(!inRange) 
	      {
			  System.out.println("Invaild input, please enter a whole number from 11111 to 99999");           
	      } // End if statement.
	 }  
	 
	 //Closing scan
	 scan.close();
	 //outputting the bar code 
	 System.out.println(zipCodeToBarCode(String.valueOf(input)));
	 //Going back to the main menu
	 MenuMain();
	 
	 
  }
  
  public static void MenuBarToZip(){
	
	//User's input
	String input = "";
	//What the zip is that equals the input bar code
	String output = "";
	// Making my scanner
	Scanner scan = new Scanner( System.in );
	//Asking for the area code
	System.out.println("Please enter the whole bar code below including the enclosing braces");
	input = scan.nextLine();
	
	output = barCodeToZipCode(input);
	
	//Checking to see if the bar code entered is invalid 
	if(output == null) {
		
		//Error message
		System.out.println("The Bar Code entered is invalid");
		
		//Going back to Main Menu
		MenuMain();
		
	}
	
	System.out.println("The Bar Code is equal to " + output);
  }
  
  public static void MenuCheck(){
	  
		//User's input
		String input = "";
		//What the zip is that equals the input bar code
		String outBar = "";
		//Finding the check number
		int check = 0;
		int Sum =0;
		int LeftOver =0;
		// Making my scanner
		Scanner scan = new Scanner( System.in );
	  
	  System.out.println("Please enter your zip code below. The zip code must be five numbers long");
	  input = scan.nextLine();
	  
	  //Checking to see if the entered zip code is valid
	  if(input.trim().length() != 5) {
		  
		  System.out.println("The zip code is invalid");
		  //Going back to main menu
		  MenuMain();
	  }
	  
	  outBar = zipCodeToBarCode(input);
	  
	  //looping thought the zip code to get the check number
	  for(int i = 0; i <=4; i++) {
		  
		  //Getting to sum of the area code for the check
		  Sum = Sum + Integer.parseInt(String.valueOf(input.charAt(i)));
	  }
	  
	  //The total of the area code % 10
	  LeftOver = Sum % 10;
	  
	  //10 minus the % of 10 to get the check
	  check = 10 - LeftOver;
	  
	  System.out.println("The Check digit is " + check);
	  System.out.println("The Bar Code equal to the entered zip code is " + outBar);
	  
	  //Going back to main menu
	  MenuMain();
	  
  }
  
  public static void MenuExit(){
	  //Quitting the program
	  System.exit(0);
  }
  
  //Turning one piece of a bar code into a number
  public static int BarToDigit(String Bar){
  int temp = -1;
  
  //checking to see if the Bar entered is valid and if it matches any.
  if(Bar.equals(Bar0)) {
	  temp = 0;
	  return temp;
  }
  
  if(Bar.equals(Bar1)) {
	  temp = 1;
	  return temp;
  }
  
  if(Bar.equals(Bar2)) {
	  temp = 2;
	  return temp;
  }
  
  if(Bar.equals(Bar3)) {
	  temp = 3;
	  return temp;
  }
  
  if(Bar.equals(Bar4)) {
	  temp = 4;
	  return temp;
  }
  
  if(Bar.equals(Bar5)) {
	  temp = 5;
	  return temp;
  }
  
  if(Bar.equals(Bar6)) {
	  temp = 6;
	  return temp;
  }
  
  if(Bar.equals(Bar7)) {
	  temp = 7;
	  return temp;
  }
  
  if(Bar.equals(Bar8)) {
	  temp = 8;
	  return temp;
  }
  
  if(Bar.equals(Bar9)) {
	  temp = 9;
	  return temp;
  }
  
  //returning a 10 to signal a false bar code
  return temp;
  
  }
  
  //Turning a signal digit to it's matching bar
  public static String DigitToBar(int Digit) {
	  String temp = null;
	  
	  if(Digit == 0) {
		  temp = Bar0;
		  return temp;
	  }

	  if(Digit == 1) {
		  temp = Bar1;
		  return temp;
	  }
	  
	  if(Digit == 2) {
		  temp = Bar2;
		  return temp;
	  }
	  
	  if(Digit == 3) {
		  temp = Bar3;
		  return temp;
	  }
	  
	  if(Digit == 4) {
		  temp = Bar4;
		  return temp;
	  }
	  
	  if(Digit == 5) {
		  temp = Bar5;
		  return temp;
	  }
	  
	  if(Digit == 6) {
		  temp = Bar6;
		  return temp;
	  }
	  
	  if(Digit == 7) {
		  temp = Bar7;
		  return temp;
	  }
	  
	  if(Digit == 8) {
		  temp = Bar8;
		  return temp;
	  }
	  
	  if(Digit == 9) {
		  temp = Bar9;
		  return temp;
	  }
	  
	  //Returning F to signal an invalid number
	  return temp;
	  
  }
  
  //Turns an 5 digit area code into a bar code
  public static String zipCodeToBarCode(String input) {
	  //Starting the enclosing of the bar code
	  String OutBar = "| ";
	  //Making sure the user's input is trimmed down
	  String zip = input.trim();
	  
	  int Sum = 0;
	  int LeftOver = 0;
	  int Check = 0;
	  
	  //Checking to see if the area code is valid
	  if(zip.length() != 5 || Integer.parseInt(zip) < 10000 || Integer.parseInt(zip) > 99999) {
		  
		  return null;
	  }
	  
	  //looping thought the area code to build the base bar code
	  for(int i = 0; i <=4; i++) {
		  
		  //Building the base BarCode
		  OutBar = OutBar + DigitToBar(Integer.parseInt(String.valueOf(zip.charAt(i)))) + " ";
		  
		  //Getting to sum of the area code for the check
		  Sum = Sum + Integer.parseInt(String.valueOf(zip.charAt(i)));
	  }
	  
	  //The total of the area code % 10
	  LeftOver = Sum % 10;
	  
	  //10 minus the % of 10 to get the check
	  Check = 10 - LeftOver;
	  
	  //Adding the check to the Bar Code
	  OutBar = OutBar + DigitToBar(Check) + " ";
	  
	  
	  //Closing the end bar
	  OutBar = OutBar + "|";
	  
	  
	  return OutBar;
  }
  
  //Turns a bar code into a area code
  public static String barCodeToZipCode(String input) {
	  String zip = "";
	  
	  int Sum = 0;
	  int LeftOver = 0;
	  int Check = 0;
	  
	  //making sure the user's input is trimmed
	  String BarCode = input.trim();
	  
	  if(BarCode.charAt(0) != '|' || BarCode.charAt(BarCode.length()-1) != '|') {
		  
		  return null;
		  
	  }
	  
	  //Splitting up the bar code
	  String[] Bars = BarCode.split(" ");
	  
	  for(int i = 1; i <= 5; i++) {
		  
		  zip = zip + BarToDigit(Bars[i]);
		  Sum = Sum + BarToDigit(Bars[i]);
		  
	  }
	  
	  //Checking to see if the Check is correct
	  LeftOver = Sum % 10;
	  
	  Check = 10 - LeftOver;
	  
	  if(Check != BarToDigit(Bars[6])) {
		  
		  
		  return null;
	  }
	  else {
		  
		  
		
		  return zip;
	  }
	  
  }
  

}
