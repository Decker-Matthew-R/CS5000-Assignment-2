//Import Scanner Utility
import java.util.Scanner;

public class GuessingGameDecker 
{
	public static void main(String[] args)
	{
		//Assign Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Assign Randomly Generated Variable to Guess
		int rand = (int)(Math.random() * 100);
		
				
		//Display the introduction to the game and how to play the game of Guess It
		System.out.println("Welcome to the Game of Guess It!");
		System.out.println("I will choose a number between 0 and 99");
		System.out.println("You will try to guess that number. If your guess wrong, I will tell you if you guessed too high or too low.");
		System.out.println("You will have 4 tries to guess the correct number. Good luck!");
		System.out.println("");
	
		
		//Prompt user to guess and run if else statement against parameters
		System.out.print("What is your guess? ");
		int guess = input.nextInt();
		
		
	   if (guess != rand)
	   {
			if (guess < rand)
				System.out.println("Too Low!");
		
			else if (guess > rand)
				System.out.println("Too High!");
         System.out.print("What is your guess? ");
         guess = input.nextInt();
	   }	
	   
      
      if (guess != rand)
	   {
			if (guess < rand)
				System.out.println("Too Low!");
		
			else if (guess > rand)
				System.out.println("Too High!");
         System.out.print("What is your guess? ");
         guess = input.nextInt();
	   }	
	   	
	   
	   
      
      if (guess != rand)
	   {
			if (guess < rand)
				System.out.println("Too Low!");
		
			else if (guess > rand)
				System.out.println("Too High!");
         System.out.print("What is your guess? ");
         guess = input.nextInt();
	   }
     
     
       if (guess != rand)
	   {
			if (guess < rand)
				System.out.println("The correct answer was "+ rand + "." + " Good by, it was fun.  Play again soon.");
		
			else if (guess > rand)
				System.out.println("The correct answer was "+ rand + "."+ " Good by, it was fun.  Play again soon.");
         
         guess = input.nextInt();
	   }

      
      else
		   System.out.println("Correct! Good Job! You Win!");


   
   
	}
}

