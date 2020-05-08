import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

//import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Hangman3 {
	// TODO restarta
	// TODO grafiska
	// TODO skriv ut felgissningar

	private static String progressWord = "_"; // G�r s� att progressWord �r globalt

	private static Scanner _input = new Scanner(System.in);// globalt

	private static ArrayList<String> _wordList = new ArrayList<String>();// globalt

	public static void main(String[] args) {
		printWelcomeMessage(); // K�r metod
		play();// K�r metod
		printGoodbyeMessage();// K�r metod
	}

	private static void play() {
		while (true) {
			int difficulty = getDifficulty();// h�mtar en int fr�n metoden getDifficulty och ger den variabel namnet
												// difficulty
			if (difficulty != 0) { // om input inte lika med 0 s� k�rs metoden startGame
				startGame(difficulty);

			}
			if (difficulty == 4) {
				play();

			}
			break; // breakar
		}
	}

	private static void startGame(int difficulty) { // V�ljer sv�righetsgrad med hj�lp av int difficulty

		switch (difficulty) {
		case 1:
			System.out.println("you have choosen level one");
			System.out.println("to continue guess a letter");
			easyGame();// K�r metod
			break;

		case 2:
			System.out.println("you have choosen level two");
			System.out.println("to continue guess a letter");
			normalGame();// K�r metod
			break;

		case 3:
			System.out.println("you have choosen level three");
			System.out.println("to continue guess a letter");
			hardGame();// K�r metod
			break;

		default: // Skriver ut detta om inget av de ovanst�ende blir uppfyllda
			System.out.println("Needs to be between 1-3");

			break;
		}

		// TODO G�r defualt och skriv m�ste va mellan 1-3

	}

	private static void easyGame() {

		populateEasyWordList(); // K�r metod

		String answer = getRandomWord();// K�r metod och h�mtar ett enkelt ord med hj�lp av populateEasyWordList();
											// och wordList som �r global
	//	System.out.println(answer);

		progressWord(answer);// K�r metod

		for (int tries = 0; tries < 15; tries++) {// For loop som skapar variabel inte tries. F�r inte blir mer �n 10
													// och varje g�ng loopen k�rs s� �kar tries

			String guess = getGuess(); // initierar en variabel till metoden getGuess
			
			if (answer.contains(guess.toLowerCase())) { // om det man gissar finns i ordet s� k�rs denna if sats
				tries--; // om man har r�tt s� ska inte tries �ka

				char[] tempWord = progressWord.toCharArray(); //

				for (int i = 0; i < answer.length(); i++) { // En loop som k�rs s� m�nga g�nger som lengten p� answer

					if (answer.charAt(i) == guess.charAt(0)) { // kollar om charen p� i �r det samma som guess. Loopen
																// kollar varje index p� ordet stegvis.

						tempWord[i] = guess.charAt(0); // Ers�tter tempWord till guess

					}
				}

				progressWord = String.copyValueOf(tempWord); //

			} else {
				System.out.println("Wrong");
				System.out.println(tries);
			}

			System.out.println(progressWord);

		}
		printYouWon();

	}

	private static void progressWord(String answer) { // Skapar en String med hj�lp av answer.length() s� att
														// Stringen med str�ck �r lika l�ng som answer
		// g�r till array
		for (int i = 1; i < answer.length(); i++) {

			progressWord += "_"; // concatinera plus text

		}

	}

	private static void normalGame() {
		populateNormalWordList(); // K�r metod

		String answer = getRandomWord();// K�r metod och h�mtar ett enkelt ord med hj�lp av
												// populateEasyWordList(); och wordList som �r global
		//System.out.println(answer);

		progressWord(answer);// K�r metod

		

		for (int tries = 0; tries < 15; tries++) {// For loop som skapar variabel inte tries. F�r inte blir mer �n 10
													// och varje g�ng loopen k�rs s� �kar tries

			String guess = getGuess(); // K�r metod och ger den namnet String guess

			if (answer.contains(guess.toLowerCase())) { // om det man gissar finns i ordet s� k�rs denna if sats
				tries--; // om man har r�tt s� ska inte tries �ka

				char[] tempWord = progressWord.toCharArray(); //

				for (int i = 0; i < answer.length(); i++) { // En loop som k�rs s� m�nga g�nger som lengten p� answer

					if (answer.charAt(i) == guess.charAt(0)) { // kollar om charen p� i �r det samma som guess. Loopen
																// kollar varje index p� ordet stegvis.

						tempWord[i] = guess.charAt(0); // Ers�tter tempWord till guess

						// System.out.print(newWord);
						// System.out.print(progressWord.replace("-", guess));

					}
				}

				progressWord = String.copyValueOf(tempWord); //

			} else {
				System.out.println("Wrong");
				System.out.println(tries);
			}

			System.out.println(progressWord);

		}

	}

	private static void hardGame() {
		populateHardWordList(); // K�r metod

		String answer = getRandomWord();// K�r metod och h�mtar ett enkelt ord med hj�lp av populateEasyWordList();
											// och wordList som �r global
		//System.out.println(answer);

		progressWord(answer);// K�r metod


		for (int tries = 0; tries < 15; tries++) {// For loop som skapar variabel inte tries. F�r inte blir mer �n 10
													// och varje g�ng loopen k�rs s� �kar tries

			String guess = getGuess(); // K�r metod och ger den namnet String guess

			if (answer.contains(guess.toLowerCase())) { // om det man gissar finns i ordet s� k�rs denna if sats
				tries--; // om man har r�tt s� ska inte tries �ka

				char[] tempWord = progressWord.toCharArray(); //

				for (int i = 0; i < answer.length(); i++) { // En loop som k�rs s� m�nga g�nger som lengten p� answer

					if (answer.charAt(i) == guess.charAt(0)) { // kollar om charen p� i �r det samma som guess. Loopen
																// kollar varje index p� ordet stegvis.

						tempWord[i] = guess.charAt(0); // Ers�tter tempWord till guess

						// System.out.print(newWord);
						// System.out.print(progressWord.replace("-", guess));

					}
				}

				progressWord = String.copyValueOf(tempWord); //

			} else {
				System.out.println("Wrong");
				System.out.println(tries);
			}

			System.out.println(progressWord);

		}

	}

	private static String getRandomWord() {
		int range = _wordList.size(); //
		int randomIndex = (int) (Math.random() * range);
		return _wordList.get(randomIndex);
	}

	

	private static void populateEasyWordList() {
		_wordList.clear();
		_wordList.add("hello");
		_wordList.add("hello");
		_wordList.add("hello");
		_wordList.add("error");
		_wordList.add("saint");
	}

	private static void populateNormalWordList() {
		_wordList.clear();
		_wordList.add("betrays");
		_wordList.add("beaches");
		_wordList.add("boutons");
		_wordList.add("mondays");
		_wordList.add("advised");
	}

	private static void populateHardWordList() {
		_wordList.clear();
		_wordList.add("abbotship");
		_wordList.add("worldwide");
		_wordList.add("unriddled");
		_wordList.add("unguarded");
		_wordList.add("transform");
	}

	private static String getGuess() {

		String letterThatHasBeenGuessed = " ";
		Scanner input = new Scanner(System.in);
		letterThatHasBeenGuessed = input.nextLine();

		return letterThatHasBeenGuessed;
		
	}

	private static int getDifficulty() {
		return getValidIntegerInput(); // Skickar det den fick av getValidIntegerInput till Play
	}

	private static int getValidIntegerInput() { // tar emot input och sedan skickar tbx till get getDifficulty
		while (true) {
			if (!_input.hasNextInt()) {
				_input.nextLine();
				continue;
			}
			return _input.nextInt();
		}
	}

	private static void printWelcomeMessage() {

		System.out.println("Welcome to Hangman! To win you have to guess the right word");
		System.out.println("There are three different levels:");
		System.out.println("The level deppends on how many letters the word contains");
		System.out.println("The first level has a word with five letters");
		System.out.println("The second level has a word with seven letters");
		System.out.println("The third level has a word with nine letters");
		System.out.println("choose a level!");

	}

	private static void printGoodbyeMessage() {
		System.out.println("Hope you enjoyed this game, good bye! Press 4 to play again.");
		play();
	}

	private static void printYouWon() {
		System.out.println("Congratiolation you won!");
	}

}
