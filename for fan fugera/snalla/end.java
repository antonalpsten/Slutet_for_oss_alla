

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class end {
	public static void main(String[] args) {
		Scanner takein = new Scanner(System.in);
		start();
		nollställ();
		int man = nollställ();
		String Theword = randomto();
		makeunderskors(Theword);
		printhangman(man);
		

	}
	public static void start() {
		System.out.println("Hej mitt namn är hängagubben. Jag skulle villja spela ett spel med dig.");
		System.out.println("Så här går det till du ska gisa en bokstav till ett ord du bara vet hur långt det är.");
		System.out.println("Jag ska säga om det är rätt eller fel. du ska även se till så att gubben inte hängs. Vill du spela så kör vi?");
	}
	public static int nollställ() {
	 int man = 0;
	 
	 return man;
		
	}
	public static String randomto() {
		
	ArrayList<String> Wordgen = new ArrayList<>(
			Arrays.asList("träd", "Ark", "Bok", "Sten", "Banan", "Nintendo", "Yxa", "El", "Grönsaker", "Palm", "Ubåt", "Ljus" )
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
