package classlab.week5;
import java.util.Scanner;

public class InvalidCharacterDriver {

	public static void main(String[] args){
		String input;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Character (000 to quit): ");
		input = scan.nextLine();
		while(!input.equals("000"))
		{
			try {
				if(input.charAt(0) <= 90 && input.charAt(0) >= 65)
					System.out.println("Valid Character");
				else
					throw new InvalidCharacterException("Not a valid character");
			}catch(IndexOutOfBoundsException e)
			{
				System.err.println("Input Is Empty");
			}catch(InvalidCharacterException e)
			{
				System.err.println(e.getMessage());
			}
			System.out.print("Enter a Character (000 to quit): ");
			input = scan.nextLine();
		}
	}

}
