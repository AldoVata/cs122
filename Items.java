package classlab.week3;

abstract class Items {
	String name;
	
	public Items(String name)
	{
		this.name = name;
	}
	
	public abstract String getName();
	
	public String toString()
	{
		return "Item: "+name;
	}
}
