

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class end {
	public static void main(String[] args) {
		Scanner takein = new Scanner(System.in);
		start();
		nollst�ll();
		int man = nollst�ll();
		String Theword = randomto();
		makeunderskors(Theword);
		printhangman(man);
		

	}
	public static void start() {
		System.out.println("Hej mitt namn �r h�ngagubben. Jag skulle villja spela ett spel med dig.");
		System.out.println("S� h�r g�r det till du ska gisa en bokstav till ett ord du bara vet hur l�ngt det �r.");
		System.out.println("Jag ska s�ga om det �r r�tt eller fel. du ska �ven se till s� att gubben inte h�ngs. Vill du spela s� k�r vi?");
	}
	public static int nollst�ll() {
	 int man = 0;
	 
	 return man;
		
	}
	public static String randomto() {
		
	ArrayList<String> Wordgen = new ArrayList<>(
			Arrays.asList("tr�d", "Ark", "Bok", "Sten", "Banan", "Nintendo", "Yxa", "El", "Gr�nsaker", "Palm", "Ub�t", "Ljus" )
			);
	
		Random rand = new Random();
		int i = rand.nextInt(Wordgen.size());
		return Wordgen.get(i);
	}
	public static void makeunderskors(String Theword) {
		for (int i = 0; i < Theword.length() * 2; i++) {
			
			if(i % 2 == 0) {
				System.out.print("_");
			}else {
				System.out.print(" ");
			}
		}
	}
	public static void printhangman(int man) {
		man++;
		if(man == 1) {
			System.out.println(" ");
			System.out.println(" "
					+ " +---+\r\n" + 
					"  |   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |");
		}
		else if (man == 2) {
			System.out.println(" ");
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					"      |\r\n" + 
					"      |\r\n" + 
					"      |");
		}
		else if(man == 3) {
			System.out.println(" ");
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					"  |   |\r\n" + 
					"      |\r\n" + 
					"      |");
		}
		else if(man == 4) {
			System.out.println(" ");
			System.out.println("+---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|   |\r\n" + 
					"      |\r\n" + 
					"      |");
			
		}
		else if(man == 5) {
			System.out.println(" ");
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					"      |\r\n" + 
					"      |");
			
		}
		else if(man == 6) {
			System.out.println(" ");
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					" /    |\r\n" + 
					"      |");
			
		}
		else if(man == 7) {
			System.out.println(" ");
			System.out.println(" +---+\r\n" + 
					"  |   |\r\n" + 
					"  O   |\r\n" + 
					" /|\\  |\r\n" + 
					" / \\  |\r\n" + 
					"      |");
			
		}
	}
}
