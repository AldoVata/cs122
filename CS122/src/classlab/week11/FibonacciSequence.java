package classlab.week11;

public class FibonacciSequence {
	
	public static int solve(int num)
	{
		if(num == 0)
			return 0;
		if(num <= 2)
			return 1;
		else
			return solve(num-1) + solve(num-2);
	}
}
