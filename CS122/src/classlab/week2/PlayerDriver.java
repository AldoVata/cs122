package classlab.week2;

public class PlayerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		FortnitePlayer fp1 = new FortnitePlayer("John","Flying","Red");
		
		String p1SuperPower = p1.playerSuperPower();
		System.out.println("p1's superpower is: "+p1SuperPower);
		p1.printPlayerName();
		fp1.showcase();
	}

}
