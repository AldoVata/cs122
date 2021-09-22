package classlab.week2;

public class Player {
	protected String name;
	public String superPower;
	
	public Player() {
		name = "Joe";
		superPower = "X-ray Vision";
	}
	
	public Player(String userName, String userSuperPower) {
		name = userName;
		superPower = userSuperPower;
	}
	
	public void printPlayerName() {
		System.out.println("Player name is: "+name);
	}
	
	public String playerSuperPower() {
		return superPower;
	}
}
