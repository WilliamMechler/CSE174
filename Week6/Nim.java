/**
 * Name: William Mechler
 * Course: CSE 174
 * Instructor: Dave Woods
 * Date: 10/6/2019
 * Assignment: Program 4
 * File: Nim
 * Purpose: To play the game of Nim with a human player
 *          against a AI player
 */

import java.util.Scanner;


public class Nim {
  
  
  public static void main(String[] args) { 
    //a flag to see if the game is still being played
    int flag = 1;
    //The human's number they picked and ai's pick
    int  humanpick = 0;
    int aipick = 0;
    //Ai levels 1 = Basic / 2 = Smart
    int ai = 0;
    
    //Turn 1 = human / 2 = ai
    int turn = 0;
    
    //The pile and the temp pile
    int pile = 0;
    int temppile = 0;
    
    Scanner scan = new Scanner( System.in );
    
    //Making the pile
    pile = 10 + (int)(Math.random() * ((100 - 10) + 1));
    
    //Seeing if the Ai will be smart or basic
    //Min + (int)(Math.random() * ((Max - Min) + 1))
    ai = 1 + (int)(Math.random() * ((2 - 1) + 1));
    
    //seeing who goes frist
    turn = 1 + (int)(Math.random() * ((2 - 1) + 1));
    
   
    
    //human goes frist
    if(turn == 1){
      if(ai == 1){
         System.out.println("You're lucky, the ai is playing in it's basic mode \n");
      }
      else if(ai == 2){
        System.out.println("Good luck, the ai is playing in it's advanced mode \n");
      }
      do{
        
        //Getting human's pick
        System.out.println("The current pile " +pile);
        System.out.println("Please enter a value between 1 and " + (pile/2) );
        while(!scan.hasNextInt()) {    
          System.out.println("Please enter a value between 1 and " + (pile/2) +" Must be a integer");    
          scan.next();     
        }    
        humanpick = scan.nextInt();
        
        temppile = pile - humanpick;
        
        //checking to see if that was a winning move
        if(temppile == 1){
          System.out.println("Good job you beat the ai! You win");
          flag = 2;
          break;
        }
        else if(temppile == 0){
          System.out.println("You took the last marble. You loss");
          flag = 2;
          break;
        }
        else{
          pile = temppile;
        }
        
        //ai's move Min + (int)(Math.random() * ((Max - Min) + 1))
        //Basic ai
        if(ai == 1){
          
          aipick = 1 + (int)(Math.random() * (((pile/2) - 1) + 1));
          
          
          temppile = pile - aipick;
          
          //checking to see if that was a winning move
          if(temppile == 1){
            System.out.println("The ai won, you lost.");
            flag = 2;
            break;
          }
          else if(temppile == 0){
            System.out.println("The ai took the last marble, you win");
            flag = 2;
            break;
          }
          else{
            pile = temppile;
          }
          
        }//Smart ai
        else if(ai == 2){
          
          //testing to see if the ai has to play a dumb move
          if(pile == 1 || pile == 3 || pile == 7 || pile == 15 || pile == 31 || pile == 63){
            
            aipick = 1 + (int)(Math.random() * (((pile/2) - 1) + 1));
            
            temppile = pile - aipick;
            
          }//testing to see if the ai can make a smart move 1, 3, 7, 15, 31, or 63
          else{
            
            if(pile > 63){
              
              aipick = (pile - 63);
              
              temppile = pile - aipick;
              
            }
            else if(pile >31){
              
              aipick = (pile - 31);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >15){
              
              aipick = (pile - 15);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >7){
              
              aipick = (pile - 7);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >3){
              
              aipick = (pile - 3);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >1){
              
              aipick = (pile - 1);
              
              temppile = pile - aipick;
              
              
            }
            
            
          } // end of ai's smart moveset
          
          
          
          //checking to see if that was a winning move
          if(temppile == 1){
            System.out.println("The ai won, you lost.");
            flag = 2;
            break;
          }
          else if(temppile == 0){
            System.out.println("The ai took the last marble, you win");
            flag = 2;
            break;
          }
          else{
            pile = temppile;
          }
          
        }// end of ai moveset
        
        
        
        
      } while(flag == 1);
      
    } // end of human going frist
    
    
    //Ai goes frist
    if(turn == 2){
       if(ai == 1){
         System.out.println("You're lucky, the ai is playing in it's basic mode \n");
      }
      else if(ai == 2){
        System.out.println("Good luck, the ai is playing in it's advanced mode \n");
      }
      do{
        
        //Start of ai turns
        //Basic ai
        if(ai == 1){
          
          aipick = 1 + (int)(Math.random() * (((pile/2) - 1) + 1));
          
          
          temppile = pile - aipick;
          
          //checking to see if that was a winning move
          if(temppile == 1){
            System.out.println("The ai won, you lost.");
            flag = 2;
            break;
          }
          else if(temppile == 0){
            System.out.println("The ai took the last marble, you win");
            flag = 2;
            break;
          }
          else{
            pile = temppile;
          }
          
        }//Smart ai
        else if(ai == 2){
          
          //testing to see if the ai has to play a dumb move
          if(pile == 1 || pile == 3 || pile == 7 || pile == 15 || pile == 31 || pile == 63){
            
            aipick = 1 + (int)(Math.random() * (((pile/2) - 1) + 1));
            
            temppile = pile - aipick;
            
          }//testing to see if the ai can make a smart move 1, 3, 7, 15, 31, or 63
          else{
            
            if(pile > 63){
              
              aipick = (pile - 63);
              
              temppile = pile - aipick;
              
            }
            else if(pile >31){
              
              aipick = (pile - 31);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >15){
              
              aipick = (pile - 15);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >7){
              
              aipick = (pile - 7);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >3){
              
              aipick = (pile - 3);
              
              temppile = pile - aipick;
              
              
            }
            else if(pile >1){
              
              aipick = (pile - 1);
              
              temppile = pile - aipick;
              
              
            }
            
            
          } // end of ai's smart moveset
          
             //checking to see if that was a winning move
          if(temppile == 1){
            System.out.println("The ai won, you lost.");
            flag = 2;
            break;
          }
          else if(temppile == 0){
            System.out.println("The ai took the last marble, you win");
            flag = 2;
            break;
          }
          else{
            pile = temppile;
          }
          
          
          
          //Getting human's pick
          System.out.println("The current pile " +pile);
          System.out.println("Please enter a value between 1 and " + (pile/2) );
          while(!scan.hasNextInt()) {    
            System.out.println("Please enter a value between 1 and " + (pile/2) +" Must be a integer");    
            scan.next();     
          }    
          humanpick = scan.nextInt();
          
          temppile = pile - humanpick;
          
          //checking to see if that was a winning move
          if(temppile == 1){
            System.out.println("Good job you beat the ai! You win");
            flag = 2;
            break;
          }
          else if(temppile == 0){
            System.out.println("You took the last marble. You loss");
            flag = 2;
            break;
          }
          else{
            pile = temppile;
          }
          
          
        }
        
      }while(flag == 1);
      
      
    }//end of main
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
