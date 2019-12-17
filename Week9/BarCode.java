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

public class BarCode {
  
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

	System.out.println(DigitToBar(2));
	System.out.println(BarToDigit("::|:|"));
    System.out.println(zipCodeToBarCode("17013"));
    System.out.println(barCodeToZipCode("| :::|| |:::| ||::: :::|| ::||: |::|: |"));
   
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
	  
	  //Seeing if the number will match any of the given codes
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
	  //Setting the code to nothing
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
