package classlab.week9;

public class SumOf1ToNClasswork {

	public static void main(String[] args) {
		System.out.println(sumOf1toN(10));
	}
	public static int sumOf1toN(int n)
	{
		if(n == 1)
			return 1;
		else
			return n + sumOf1toN(n-1);
	}

}
