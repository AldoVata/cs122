package classlab.week9;

import java.util.Scanner;

public class InvalidDocumentCodeExceptionDriver {

	public static void main(String[] args) throws InvalidDocumentCodeException {
		InvalidDocumentCodeException error = new InvalidDocumentCodeException("Document Designation is Improper");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Document Designation (DONE to Terminate): ");
		String input = scan.nextLine();
		
		while(!input.equals("DONE"))
		{
			if(input.charAt(0) != 'U' && input.charAt(0) != 'C' && input.charAt(0) != 'P' || input.length() != 2)
				throw error;
			System.out.println("Enter Another Document Designation (DONE to Terminate): ");
			input = scan.nextLine();
		}
		System.err.println("Program Terminated");

	}

}
