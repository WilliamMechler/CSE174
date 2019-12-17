//Name: William Mechler
//Instructor: Dave Woods
//CSE 174
//Date:9/5/2019
//Filename: MyFirstProgran.java
//Description: Practice with writing, saving, and compiling code

import java.util.Scanner; // Scanner needed for user input

//Demonstrates some basic programming concepts by
//getting infomation form the keyboard, displaying results
//to the screen, and playing an interactive game with
//the user.
public class MyFirstProgram2{
  
  //The starting point for thr program. This method
  //calls on the other three methods as needed.
  public static void main(String[] args){
    
    //Declaring local variables for use later in the method
    String firstName, lastName;
    int goalNumber, userGuess, countGuesses;
    int triangleHeight;
    Scanner keyboardReader = new Scanner(System.in);
    
    //Get the user's name
    System.out.print("Enter your frist and last name: ");
    firstName = keyboardReader.next();
    lastName = keyboardReader.next();
    
    //Display a marquee with a personalized greeting.
    drawBorder(40,'*');
    printWelcome(firstName,lastName);
    drawBorder(40,'*');
    
    //explain game
    printGameIntro(firstName);
    
    //Set up game
    goalNumber = (int) (1+20*Math.random());
    countGuesses = 1;
    
    //Get the first guess
    drawBorder(40,'*');
    System.out.print("Enter guess #" + countGuesses + ": ");
    userGuess = keyboardReader.nextInt();
    
    //Loop until the user correctly guesses
    while (userGuess != goalNumber){
      
      if ( userGuess < goalNumber) {
        System.out.println("Too low. Guess higher.");
      }
      else{
        System.out.println("Too high. Guess lower.");
      }
      
      countGuesses = countGuesses + 1;
      
      System.out.print("Enter guess #" + countGuesses + ": ");
      userGuess = keyboardReader.nextInt();
      
    } // end of while loop
    
    //User wins if it takes fewer than 5 guesses
    if (countGuesses < 5){
      System.out.print("Congratulations " +firstName+ ", ");
      System.out.println("you got it in " + countGuesses + " tries");
      System.out.println("you are a good guesser.");
    }
    else{
      System.out.print("OK " +firstName+", ");
      System.out.println("you got it, but took 5 or more tries.");
    }
    
    //some artwork
    drawBorder(40,'*');
    System.out.println("And now, we bring you a triangle of money!");
    System.out.println("How many rows do you want the triangle to be?");
    triangleHeight = keyboardReader.nextInt();
    
    //display the triangle:
    for (int rowCount = 1; rowCount <= triangleHeight; rowCount++){
      drawBorder(rowCount, '$');
    }
  }// end of main method
  
  //prints a personalized welcome message to the screen.
  public static void printWelcome(String fn, String ln){
    System.out.println("Dear " + fn + " " + ln +",");
    System.out.println("Weclome to my first program!");
    System.out.println("I hope you enjoy the show.");
    System.out.println(" Sincerely, \n William Mechler");
  }// end of printWelcome method
  
  //prints a personalized introduction of the game
  //to the screen
  public static void printGameIntro(String name){
    System.out.println("Let's play a game, " +name+ ".");
    System.out.println("I'm thinking of a number from 1 to 20.");
    System.out.println("See if you get it in fewer than 5 tries . . .");
  }// end of printGameIntro method
  
  //prints to the screen a border of any length,
  //using the specified symbol
  public static void drawBorder(int length, char symbol){
    for(int i = 1; i<= length; i++){
      System.out.print(symbol);
    }
    System.out.println();
  }// end of drawBorder method
  
}//end class