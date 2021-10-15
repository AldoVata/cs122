package RandomPractice;

public class StringMeldPractice {

	public static void main(String[] args) {
		String[] a = new String[3];
		a[0] = "very";
		a[1] = "astonishingly";
		a[2] = "surprisingly";
		
		String[] b = new String[3];
		b[0] = "large";
		b[1] = "good";
		b[2] = "spicy";
		
		String[] result = stringMeld(a,b);
		printStringArray(result);
	}
	
	public static String[] stringMeld(String[] a, String[] b)
	{
		String[] answer = new String[a.length];
		for(int i = 0; i<a.length; i++)
		{
			answer[i] = a[i]+" "+b[i];
		}
		return answer;
	}
	public static void printStringArray(String[] a)
	{
		for(int i = 0; i<a.length; i++)
		{
			System.out.println("["+a[i]+"]");
		}
	}
}
