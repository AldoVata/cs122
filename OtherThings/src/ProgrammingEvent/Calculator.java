package ProgrammingEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double input1= 0;
		double input2 = 0;
		double output = 0;
		String operation = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		try{
			input1 = scan.nextDouble();
		}
		catch(InputMismatchException e)
		{
			throw e;
		}
		
		System.out.println("Enter Another Number: ");
		try{
			input2 = scan.nextDouble();
		}
		catch(InputMismatchException e)
		{
			throw e;
		}
		
		System.out.println("Enter an Operation: ");
		operation = scan.next();
		
		//System.out.println(input1+" "+operation+" "+input2);
		
		if(operation.equalsIgnoreCase("add") || operation.equalsIgnoreCase("plus") || operation.equalsIgnoreCase("addition") || operation.equalsIgnoreCase("+"))
			{
				output = input1+input2;
				System.out.println(output);
			}
		else if(operation.equalsIgnoreCase("subtract") || operation.equalsIgnoreCase("minus") || operation.equalsIgnoreCase("subtraction") || operation.equalsIgnoreCase("-"))
			{
				output = input1-input2;
				System.out.println(output);
			}
		else if(operation.equalsIgnoreCase("multiply") || operation.equalsIgnoreCase("times") || operation.equalsIgnoreCase("multiplication") || operation.equalsIgnoreCase("*") || operation.equalsIgnoreCase("x"))
			{
				output = input1*input2;
				System.out.println(output);
			}
		else if(operation.equalsIgnoreCase("divide") || operation.equalsIgnoreCase("division") || operation.equalsIgnoreCase("/"))
			{
				output = input1/input2;
				System.out.println(output);
			}
		else
			System.err.println("Operation Input Is Not Valid");
		
	}

}
