package classSamples.exceptions.CreatingExceptions;
import java.util.Scanner;

public class MidtermCustomException {
	public static void main(String[] args) throws MidtermInvalidCodeException, MidtermInvalidCodeLengthException {
		// create a program that takes 5 alphanumeric input
		// the first two letters of the input should be numbers
		//the last three letters of the input should be SSS, CSS, ISS, WAS
		// if the length is greater than 5, InvalidCodeLengthException exception should be thrown and handled
		// if the first two character arnt numbers, handle exception
		// if the last three doesn;t match the given codes, throw and handle InvalidCodeException
		Scanner scan = new Scanner(System.in);
		
		MidtermInvalidCodeException invalidCode = new MidtermInvalidCodeException("Input Code Is Invalid");
		MidtermInvalidCodeLengthException invalidLen = new MidtermInvalidCodeLengthException("Input Code Must Be 5 Characters Long");
		
		System.out.println("Enter a Code (XXX to Terminate): ");
		String input = scan.nextLine();
		while(!input.equals("XXX"))
		{
			try {
				//Checking if the input is invalid based off of length and the first 2 characters
					try {
						String test = input.substring(0,5); //Checks if the input is 5 characters long
						int first2Num = Integer.parseInt(input.substring(0, 2)); //Checks if the first 2 characters are numbers
					}
					catch(StringIndexOutOfBoundsException e)
					{
						throw invalidLen;
					}
					catch(NumberFormatException e)
					{
						throw invalidCode;
					}
					
				String last3 = input.substring(2); //Takes the last 3 characters
				if(last3.equals("SSS") || last3.equals("CSS") || last3.equals("ISS") || last3.equals("WAS"))
					{
					//Input was valid, asks the user for another code
						System.out.println("Valid Code");
						System.out.println("Enter Another Code (XXX to Terminate): ");
						input = scan.nextLine();
					}
				else //If the last 3 characters were invalid
					throw invalidCode;
			}
			catch(MidtermInvalidCodeException e) //Catches if the input either doesn't start with 2 numbers or if the last 3 characters are invalid
			{
				System.err.println(e.getMessage());
				System.out.println("Enter a Code (XXX to Terminate): ");
				input = scan.nextLine();
			}
			catch(MidtermInvalidCodeLengthException e) //Catches if the input is not 5 characters long
			{
				System.err.println(e.getMessage());
				System.out.println("Enter a Code (XXX to Terminate): ");
				input = scan.nextLine();
			}

		}
		System.err.println("Program Terminated"); //Program was terminated
	}
}