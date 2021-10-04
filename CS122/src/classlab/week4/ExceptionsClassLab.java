package classlab.week4;

import java.util.Scanner;

public class ExceptionsClassLab {

	public static void main(String[] args) {
		String code;
		int input1;
		String input2;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Integer (000 to quit): ");
		code = scan.nextLine();
		
		while(!code.equals("000"))
		{
			try 
			{
				input1 = Integer.parseInt(code);
				System.out.println("Input is an Integer");
			}
			catch(NumberFormatException exception)
			{
				System.out.println("Input is not an Integer");
			}
			System.out.print("Enter Integer (000 to quit): ");
			code = scan.nextLine();
		}
		System.out.print("Enter An Input (000 to quit): ");
		code = scan.nextLine();
		
		while(!code.equals("000"))
		{
			try
			{
				input2 = code.substring(7);
				if(input2.equals("CS122"))
					System.out.println("In Class");
				else
					System.out.println("Not In Class");
			}
			catch(IndexOutOfBoundsException exception)
			{
				System.out.println("Input Not Long Enough");
			}
			
			System.out.print("Enter An Input (000 to quit): ");
			code = scan.nextLine();
		}
	}
}
