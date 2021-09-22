package classlab.week3;

public class Players extends Items{
	
	String team;
	int life;
	final int MAX_HEALTH = 100;
	
	public Players(String u, String t, int l)
	{
		super(u);
		team = t;
		life = l;
	}

	public String getName() {
		return name;
	}
	
	public String getTeam()
	{
		return team;
	}
	
	public void decreaseLife(int d)
	{
		if(life>=d)
			life-=d;
	}
	public String toString()
	{
		return "Name: "+name+"\nTeam: "+team+"\nLife: "+life+"\nMax Health: "+MAX_HEALTH;
	}
}
