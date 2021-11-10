package classlab.week11;

public class FilePart {
	private final int PART_NUMBER;
	
	public FilePart(int newPartNumber)
	{
		PART_NUMBER = newPartNumber;
	}
	public String toString() {
		return ""+PART_NUMBER;
	}
}
