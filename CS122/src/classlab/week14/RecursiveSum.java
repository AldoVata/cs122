package classlab.week14;

public class RecursiveSum {

	public static void main(String[] args) {

		System.out.println(recursiveSum(10));
	}


	public static int recursiveSum(int i)
	{
		if(i == 1)
			return 1;
		else
			return i + recursiveSum(i-1);
	}
}
