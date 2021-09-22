package classlab.week3;

public class CPU extends Players{
	private int strength;
	
	public CPU(String cpuName, String cpuTeam, int cpuLife, int s) {
		super(cpuName, cpuTeam, cpuLife);
		strength = s;
	}
	
	public void attack(Players p)
	{
		int damage = 5*strength;
		p.decreaseLife(damage);
	}

	public void defense()
	{
		life+=5;
	}
	
	public void decreaseLife(int d)
	{
		if(life>=d)
			life-=d;
	}
}
