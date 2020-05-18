import java.util.ArrayList;
import java.util.Scanner;


public class Hangman3 {
	// TODO restarta
	// TODO grafiska
	// TODO skriv ut felgissningar

	private static String progressWord = "_"; // Gör så att progressWord är globalt

	private static Scanner _input = new Scanner(System.in);// globalt
	
	private static String guessedLetters = "";

	private static ArrayList<String> _wordList = new ArrayList<String>();// globalt
	


	public static void main(String[] args) {
		printWelcomeMessage(); // Kör metod
		play();// Kör metod
		thanksForPlayin();// Kör metod
	}

	private static void play() {
		while (true) {
			int difficulty = getDifficulty();// hämtar en int från metoden getDifficulty och ger den variabel namnet
												// difficulty
			if (difficulty != 0) { // om input inte lika med 0 så körs metoden startGame
				startGame(difficulty);

			}
			if (difficulty == 4) {	
				restartGame();

			}
			break; // breakar
		}
	}

	private static void guessedLetters(String guess) {
		
		guessedLetters += guess;
		
		
	}
	
	private static void restartGame() {
		
		progressWord = "_";
		guessedLetters = "";
		play();

	}

	private static void startGame(int difficulty) { // Väljer svårighetsgrad med hjälp av int difficulty

		switch (difficulty) {
		case 1:
			System.out.println("you have choosen level one");
			System.out.println("to continue guess a letter");
			easyGame();// Kör metod
			break;

		case 2:
			System.out.println("you have choosen level two");
			System.out.println("to continue guess a letter");
			normalGame();// Kör metod
			break;

		case 3:
			System.out.println("you have choosen level three");
			System.out.println("to continue guess a letter");
			hardGame();// Kör metod
			break;

		default: // Skriver ut detta om inget av de ovanstående blir uppfyllda
			System.out.println("Needs to be between 1-3");
			break;
		}

		// TODO Gör defualt och skriv måste va mellan 1-3

	}

	private static void easyGame() {

		populateEasyWordList(); // Kör metod

		String answer = getRandomWord();// Kör metod och hämtar ett enkelt ord med hjälp av populateEasyWordList();
										// och wordList som är global
		
		progressWord(answer);// Kör metod

		for (int tries = 0; tries < 16; tries++) {// For loop som skapar variabel tries. Får inte blir mer än 15
													// och varje gång loopen körs så ökar tries

			String guess = getGuess(); // initierar en variabel till metoden getGuess

			guessedLetters(guess);
			
			System.out.println("Your guessed letters: " + guessedLetters);
			
			if (answer.contains(guess.toLowerCase())) { // om det man gissar finns i ordet så körs denna if sats
				// om man har rätt så ska inte tries öka
				System.out.println("Right letter");
				System.out.println("Guesses made:" + tries);

				char[] tempWord = progressWord.toCharArray();

				for (int i = 0; i < answer.length(); i++) { // En loop som körs så många gånger som lengten på answer

					if (answer.charAt(i) == guess.charAt(0)) { // kollar om charen på i är det samma som guess. Loopen
																// kollar varje index på ordet stegvis.

						tempWord[i] = guess.charAt(0); // Ersätter tempWord till guess

					}

				}

				progressWord = String.copyValueOf(tempWord);

			}

			else {
				System.out.println("Wrong letter");
				System.out.println(tries);
				
				
			}

			System.out.println(progressWord);

			if (tries > 14) {
				printYouLost();
			}

			if (progressWord.equals(answer)) {
				printYouWon();
				printRestartMessage();

			}

		}

	}

	private static void progressWord(String answer) { // Skapar en String med hjälp av answer.length() så att
														// Stringen med sträck är lika lång som answer
		// gör till array
		for (int i = 1; i < answer.length(); i++) {

			progressWord += "_"; // concatinera plus text

		}

	}

	private static void normalGame() {
		populateNormalWordList(); // Kör metod

		String answer = getRandomWord();// Kör metod och hämtar ett enkelt ord med hjälp av
										// populateEasyWordList(); och wordList som är global
		// System.out.println(answer);

		progressWord(answer);// Kör metod

		for (int tries = 0; tries < 16; tries++) {// For loop som skapar variabel inte tries. Får inte blir mer än 10
													// och varje gång loopen körs så ökar tries

			String guess = getGuess(); // Kör metod och ger den namnet String guess
			
			guessedLetters(guess);
			
			System.out.println("Your guessed letters: " + guessedLetters);
			

			if (answer.contains(guess.toLowerCase())) { // om det man gissar finns i ordet så körs denna if sats
				// om man har rätt så ska inte tries öka
				System.out.println("Right letter");
				System.out.println("Guesses made:" + tries);

				char[] tempWord = progressWord.toCharArray(); //

				for (int i = 0; i < answer.length(); i++) { // En loop som körs så många gånger som lengten på answer

					if (answer.charAt(i) == guess.charAt(0)) { // kollar om charen på i är det samma som guess. Loopen
																// kollar varje index på ordet stegvis.

						tempWord[i] = guess.charAt(0); // Ersätter tempWord till guess

						// System.out.print(newWord);
						// System.out.print(progressWord.replace("-", guess));

					}
				}

				progressWord = String.copyValueOf(tempWord); //

			}

			else {
				System.out.println("Wrong letter");
				System.out.println(tries);
			}

			System.out.println(progressWord);

			if (tries > 14) {
				printYouLost();
			}

			if (progressWord.equals(answer)) {
				printYouWon();
				printRestartMessage();

			}

		}

	}

	private static void hardGame() {
		populateHardWordList(); // Kör metod

		String answer = getRandomWord();// Kör metod och hämtar ett enkelt ord med hjälp av populateEasyWordList();
										// och wordList som är global
		// System.out.println(answer);

		progressWord(answer);// Kör metod

		for (int tries = 0; tries < 16; tries++) {// For loop som skapar variabel inte tries. Får inte blir mer än 10
													// och varje gång loopen körs så ökar tries

			String guess = getGuess(); // Kör metod och ger den namnet String guess
			
			guessedLetters(guess);
			
			System.out.println("Your guessed letters: " + guessedLetters);
			

			if (answer.contains(guess.toLowerCase())) { // om det man gissar finns i ordet så körs denna if sats
				// om man har rätt så ska inte tries öka
				System.out.println("Right letter");
				System.out.println("Guessed made:" + tries);

				char[] tempWord = progressWord.toCharArray(); //

				for (int i = 0; i < answer.length(); i++) { // En loop som körs så många gånger som lengten på answer

					if (answer.charAt(i) == guess.charAt(0)) { // kollar om charen på i är det samma som guess. Loopen
																// kollar varje index på ordet stegvis.

						tempWord[i] = guess.charAt(0); // Ersätter tempWord till guess

					}
				}

				progressWord = String.copyValueOf(tempWord); //

			}

			else {
				System.out.println("Wrong letter");
				System.out.println(tries);
			}

			System.out.println(progressWord);

			if (tries > 14) {
				printYouLost();
			}

			if (progressWord.equals(answer)) {
				printYouWon();
				printRestartMessage();

			}

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
		System.out.println("There are three different levels and you have 15 tries:");
		System.out.println("The level deppends on how many letters the word contains");
		System.out.println("The first level has a word with five letters");
		System.out.println("The second level has a word with seven letters");
		System.out.println("The third level has a word with nine letters");
		System.out.println("choose a level by picking 1,2 or 3 and end game with 5!");

	}

	private static void printRestartMessage() {
		System.out.println("Hope you enjoyed this game! Press 4 to play again. ");
		System.out.println("Or press 5 to end game!");
		
		if (_input.nextInt() == 4) {
			System.out.println("Pick a level");
			restartGame();
			
		} if (_input.nextInt() == 5) {
			thanksForPlayin();
			
		}
		else {
			System.out.println("Pick 4 or 5");
			printRestartMessage();
		}
		
		
		
	}
	private static void thanksForPlayin() {
		System.out.println("Thanks for playing!");
		System.out.println("Good bye");
		
	}

	private static void printYouWon() {
		System.out.println(" ");
		System.out.println("Congratiolation you won!");
	}

	private static void printYouLost() {
		System.out.println("You lost!");
	}

}
