package classlab.week2;

public class FortnitePlayer extends Player{
	
	public String armorColor;
	
	public FortnitePlayer() {
		armorColor = "White";
	}
	public FortnitePlayer(String userName, String userSuperPower, String color) {
		name = userName;
		superPower = userSuperPower;
		armorColor = color;
	}
	
	public void showcase() {
		System.out.println("Hello, this is the information for your player: \nName: "+name+"\nSuperpower: "+superPower+"\nArmor color is: "+armorColor);
	}
}
