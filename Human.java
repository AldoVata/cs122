package classlab.week3;

public class Human extends Players{
	
	public Human(String hName, String hTeam, int hLife)
	{
		super(hName, hTeam, hLife);
	}
	
	public void decreaseLife(int d)
	{
		if(life>=d)
			life-=d;
	}
}
