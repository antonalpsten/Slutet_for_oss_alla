
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class slutet_om_ni_vill {
	public int man;
	static String theword;
	static Scanner takein = new Scanner(System.in);
	static char[] wronggueses = new char[7];
	public static void main(String[] args) {
		do {
			start();
			theword = randomto();
			gueses();
		} while (true);
	}

	private static void gueses() {
		for (int i = 0; i < 6; i++) {
			System.out.println("nu kan du gissa");
			String thegues = takein.nextLine();
			if (theword.contains(thegues)) {
				makeunderskors(thegues);
				i--;
			}else {
				System.out.println("you guest wrong!");
				wronggueses[i] = thegues.charAt(0);
				makeunderskors();
			}
			
		}

	}

	private static void makeunderskors(String thegues) {
		for (int i = 0; i < theword.length(); i++) {

			if (theword.charAt(i) == thegues.charAt(0)) {
				System.out.print(thegues);
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void start() {
		System.out.println("Hej mitt namn �r h�ngagubben. Jag skulle villja spela ett spel med dig.");
		System.out.println("S� h�r g�r det till du ska gisa en bokstav till ett ord du bara vet hur l�ngt det �r.");
		System.out.println(
				"Jag ska s�ga om det �r r�tt eller fel. du ska �ven se till s� att gubben inte h�ngs. Vill du spela s� k�r vi?");
	}

	public static String randomto() {

		ArrayList<String> Wordgen = new ArrayList<>(
				Arrays.asList("tr�d", "hypernervokustiskadiafragmakontravibrationer", "Ark", "Bok", "Sten", "Banan",
						"Nintendo", "Yxa", "El", "Gr�nsaker", "Palm", "Ub�t", "Ljus"));

		Random rand = new Random();
		int i = rand.nextInt(Wordgen.size());
		return Wordgen.get(i);
	}

	public static void makeunderskors() {
		for (int i = 0; i < theword.length(); i++) {

			System.out.println("*");

		}
	}



	public static void printhangman(int man) {
		man++;
		if (man == 1) {
			System.out.println(" ");
			System.out.println(
					" " + " +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |");
		} else if (man == 2) {
			System.out.println(" ");
			System.out
					.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n" + "      |");
		} else if (man == 3) {
			System.out.println(" ");
			System.out
					.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n" + "      |");
		} else if (man == 4) {
			System.out.println(" ");
			System.out.println("+---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n" + "      |");

		} else if (man == 5) {
			System.out.println(" ");
			System.out
					.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n" + "      |");

		} else if (man == 6) {
			System.out.println(" ");
			System.out
					.println(" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n" + "      |");

		} else if (man == 7) {
			System.out.println(" ");
			System.out.println(
					" +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n" + "      |");

		}
	}

}
