package classlab.week9;
import java.util.Scanner;

public class StringTooLongExceptionDriver {

	public static void main(String[] args) throws StringTooLongException {
		StringTooLongException error = new StringTooLongException("Input is Too Long");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A String (DONE to Terminate): ");
		String input = scan.nextLine();
		
		while(!input.equals("DONE"))
		{
			if(input.length() >= 20)
				throw error;
			System.out.println("Enter Another String (DONE to Terminate): ");
			input = scan.nextLine();
		}
		System.err.println("Program Terminated");
	}

}
