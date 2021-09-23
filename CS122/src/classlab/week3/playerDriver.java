package classlab.week3;

public class playerDriver {

	public static void main(String[] args) {
		
		Players bot = new CPU("Botty","Green",90,3);
		Players hooman = new Human("Greggory","Blue",65);
		
		System.out.println(bot);
		System.out.println("--------------------------------------");
		bot.decreaseLife(5);
		System.out.println("Botty After Taking 5 Damage: \n"+bot);
		System.out.println("--------------------------------------");
		
		System.out.println(hooman);
		System.out.println("--------------------------------------");
		hooman.decreaseLife(10);
		System.out.println("Hooman After Taking 10 Damage:\n"+hooman);
		System.out.println("--------------------------------------");
		((CPU)bot).attack(hooman);
		System.out.println("Hooman After Being Attacked By Botty For 15 Additional Damage:\n"+hooman);
	}

}