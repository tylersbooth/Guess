//Project for CS Due: December 3rd
import java.util.*;

public class Guess {
   public static void main(String[] args){
      giveIntro();  
      
      int count = 0;
      int guess = 0;
      double guesses = 0.0;
      int max = 0;
      int totalguesses = 0;
      int game = 1;
     
      guessNumber(guess, guesses, max, totalguesses, game); 
   }
public static void giveIntro(){
      System.out.println("This program allows to to play a game of guessing.");
      System.out.println("I will think of a number between 1-100 \nand it will allow you to guess until you get it correct.");
      System.out.println("For each guess, I will tell you whether the correct answer \nis greater or less than your guess.");
      System.out.println();
   }
public static void guessNumber(int guess, double guesses, int max, int totalguesses, int game){
      Scanner console = new Scanner(System.in);
      System.out.println("I'm thinking of a number.....");
      Random r = new Random();
      int count = 0;
      
      
      int cGuess = r.nextInt(101); // Random number between 1-100
      while(guess!= cGuess){
         count++;
         System.out.println("Your guess?");
         guess = console.nextInt();  
         if(guess > cGuess){
            System.out.println("lower"); 
         }else if (guess < cGuess){
            System.out.println("higher");   
         }
      }  
      if(guess == cGuess){
         if(max < count){
            max = count;
 }  
        totalguesses += count;
         
         System.out.println("You got it right in " + count + " guesses");
         playAgain(count,guess,guesses, max, totalguesses, game);
      }
   }
public static void playAgain(int count, int guess, double guesses, int max, int totalguesses, int game){
      Scanner console = new Scanner(System.in); 
      System.out.println("Do you want to play again");
      String answer = console.next();
      if(answer.equalsIgnoreCase("Yes")){
         game++;
         guessNumber(guess, guesses, max, totalguesses, game);
      }else if(answer.equalsIgnoreCase("No")){
         getReport(count, guess, guesses, max, totalguesses, game);
      }
   if(max > count){
      max = count;
   }  
  } 
public static void getReport(int count, int guess, double guesses, int max, int totalguesses, int game){  
      System.out.println("Overall Total:");
      System.out.println("total games: " + game);
      System.out.println("total guesses: " + totalguesses);
      System.out.println("guesses/games: " + (double) totalguesses/game);
      System.out.println("max guesses: " + max);
   }      
}
