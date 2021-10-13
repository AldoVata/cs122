package ProgrammingEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	
	public static void main(String[]args)
	{
		int computerChoice, userGuess, numGuess;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("I'm Thinking Of A Number Between 1-10, Guess What It Is: ");
		computerChoice = (int)((Math.random())*10)+1;
		numGuess = 0;
		
		try {
			userGuess = scan.nextInt();
			while(userGuess != computerChoice)
			{
				numGuess++;
				System.out.println("Wrong! Guess Again: ");
				userGuess = scan.nextInt();
			}
			numGuess++;
			System.out.println("Correct! You guessed "+numGuess+" times");
		}
		catch(Exception e) {
			System.err.println("Guess Is Not An Integer");
		}
		
	}
}
