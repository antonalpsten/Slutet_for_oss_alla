
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class slutet_om_ni_vill {
	static String word = "";
	static String guess = "";
	static Scanner input = new Scanner(System.in);
	static String progression = "";
	static ArrayList<String> incorrectGuesses = new ArrayList<>();
	static ArrayList<String> wordList = new ArrayList<String>();
	static ArrayList<String> theMan = new ArrayList<String>();
	
	public static void main(String[] args) {
		sayWelcome();
		printInstructions();
		initwordList();
		initTheMan();
		playGame();
		sayGoodBye();
	}

	private static void initTheMan() {
		
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |");
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n" + "      |");
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n" + "      |");
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n" + "      |");
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n" + "      |");
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n" + "      |");
		theMan.add("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n" + "      |");
		
	}

	private static void initwordList() {
		wordList.add("appa");
		wordList.add("barn");
		wordList.add("volvo");
		wordList.add("hosta");
		wordList.add("dator");
		wordList.add("senap");
		wordList.add("groda");
		wordList.add("hypernervokustiskadiafragmakontravibrationer");
		wordList.add("biografi");
		
	}

	private static void sayGoodBye() {
			System.out.println("hej då vi ses aldrig igen.");
	}

	private static void playGame() {
		do {
			setUpGame();
			makeGuesses();

			System.out.println("vill du spela igen? skriv y för ja. allt anat stänger av programet.");
			String spelaIgen = input.nextLine();
			if (!spelaIgen.equals("y")) {
				break;
			}
		} while (true);
	}

	private static void setUpGame() {
		randomizeWord();
		guess = "";
		progression = initprogresion();

	}

	private static String initprogresion() {
		char[] returnValue = new char[word.length()];
		
		for (int i = 0; i < returnValue.length; i++) {
			returnValue[i] = '*';
		}
		
		return new String(returnValue);
	}

	private static void makeGuesses() {
		for (int i = 0; i < 6; i++) {
			System.out.println("gissa på en bokstav");
			guess = input.nextLine();
			printProgression();
			System.out.println(theMan.get(i));
			if (word.equals(progression)) {
				return;
			} else if (word.contains(guess)) {
				i--;
				continue;
			}
			incorrectGuesses.add(guess);
			System.out.println("du har gissat fel försök igen");
			System.out.println(incorrectGuesses);
		}
		System.out.println(theMan.get(6));
		System.out.println("wala bror du är dum i huvet!! hur kan man vara så dålig.");
	}

	private static void printProgression() {
		char[] tempArray = progression.toCharArray();
			
		 for (int i = 0; i < tempArray.length; i++) {
			if (word.toLowerCase().charAt(i) == guess.toLowerCase().charAt(0)) {
				tempArray[i] = guess.toLowerCase().charAt(0);
			}
		}
		
		progression = new  String(tempArray);
		System.out.println(progression);
		
		}

	private static void randomizeWord() {
			Random random = new Random();
			int randomIndex = random.nextInt(wordList.size());
			word = wordList.get(randomIndex);
	}

	private static void printInstructions() {
		System.out.println("Jag kommer vissa ett antal stjärnor och så många det är så många bokstäver är det i ordet. du kommer då få gissa bokstav för bokstav. så kommer jag säga till om den är med. gubben har 6 gånger på sig inan den hängs. Lycka till!");
	}

	private static void sayWelcome() {
		System.out.println("hej och välkomen till hängagubben");
	}
}
