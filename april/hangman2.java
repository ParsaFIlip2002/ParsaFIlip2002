import java.util.Random;
import java.util.Scanner;

public class hangman2 {

	public static void main(String[] args) {

		Welcome();

		Scanner input = new Scanner(System.in);// Skannar input som kommer ifrån konsolen
		int choice = 0;
		try {
			choice = input.nextInt(); // Deklarer den till int choice
		} catch (Exception e) {
			input.next();
			System.out.println("Need to be an integer between 1-4");
			System.out.println(e);
		}

		String UnknownWord;

		if (choice == 1) {

			UnknownWord = RandomWord1();// Resultat av RandomWord blir till UnknownWord
		} else if (choice == 2) {

			UnknownWord = RandomWord2();
		} else if (choice == 3) {

			UnknownWord = RandomWord3();
		} else {
			UnknownWord = "hej";
		}

		ReplaceLetter(UnknownWord, LetterChecker(UnknownWord)); // Skickar två variabler till metoden ReplaceLetter
		String StarWord = StarMaker(UnknownWord);
	}

	public static void Welcome() {
		System.out.println("Welcome to Hangman! To win you have to guess the right word");
		System.out.println("There are three different levels:");
		System.out.println("The level deppends on how many letters the word contains");
		System.out.println("The first level has a word with five letters");
		System.out.println("The second level has a word with seven letters");
		System.out.println("The third level has a word with nine letters");
		System.out.println("There is also an game mood called own word where you choose your own word");
		System.out.println("Write 1-3 is the level and 4 is own word");

	}

	public static String RandomWord1() {

		String[] arr = { "saint", "error", "danger", "chant", "chart" }; // array
		Random r = new Random(); // Inbygd method som slumpar
		int randomIndex = r.nextInt(arr.length); // arr.length för att slumpa 0-4
		System.out.println(arr[randomIndex]);

		return arr[randomIndex]; // returnerar arr[randomIndex]
	}

	public static String RandomWord2() {

		String[] arr = { "betrays", "beaches", "boutons", "mondays", "advised" }; // array
		Random r = new Random(); // Inbygd method som slumpar
		int randomIndex = r.nextInt(arr.length); // arr.length för att slumpa 0-4
		System.out.println(arr[randomIndex]);

		return arr[randomIndex]; // returnerar arr[randomIndex]
	}

	public static String RandomWord3() {

		String[] arr = { "abbotship", "worldwide", "unriddled", "unguarded", "transform" }; // array
		Random r = new Random(); // Inbygd method som slumpar
		int randomIndex = r.nextInt(arr.length); // arr.length för att slumpa 0-4
		System.out.println(arr[randomIndex]);// Skriver ut metod

		return arr[randomIndex]; // returnerar arr[randomIndex]

	}

	public static String LetterChecker(String UnknownWord) {

		Scanner input = new Scanner(System.in);
		String Gissning = input.nextLine(); // initeierar input till String Gissning

		if (UnknownWord.contains(Gissning)) { // kollar om Gissning finns i UnknownWord
			System.out.println("Right letter!");
		} else {
			System.out.println("Wrong letter! ");

		}

		return Gissning;

	}

	public static String StarMaker(String UnknownWord) {

		String StarWord = "";

		for (int i = 0; i < UnknownWord.length(); i++) {

			StarWord += "*";

		}
		System.out.print(StarWord);
		return StarWord;
	}

	public static void ReplaceLetter(String UnknownWord, String Gissning) {

		for (int i = 0; i < UnknownWord.length(); i++) {

			String txt = UnknownWord;
			System.out.println(txt.indexOf(Gissning));
			System.out.println(StarWord.replace(txt.indexOf(Gissning), Gissning));
			break;

		}

	}

}
