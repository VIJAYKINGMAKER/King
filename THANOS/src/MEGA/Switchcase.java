package MEGA;

public class Switchcase {

	public static void main(String[] args) {
		int games = 4;
		String playGames ="";

		// switch statement with int data type
		switch (games) {
		case 1:
			playGames = "Cricket";
			break;
		case 2:
			playGames = "Football";
			break;
		case 3:
			playGames = "MLB";
			break;
		case 4:
			playGames = "Volley ball";
			break;
		default:
			playGames = "Unknown Game";
		}
		System.out.println("Selectedgame:" + playGames);
	}

}
