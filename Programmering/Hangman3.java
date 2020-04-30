import java.util.ArrayList;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Hangman3 {

	private static Scanner _input = new Scanner(System.in);
	
	private static ArrayList<String>_wordList = new ArrayList<String>();

	public static void main(String[] args) {
		printWelcomeMessage();
		play();
		printGoodbyeMessage();
	}

	private static void play() {// om input inte lika med 0 så körs metoden startGame
		while (true) {
			int difficulty = getDifficulty();
			if (difficulty != 0) {  
				startGame(difficulty);
			}
			break;
		}
	}

	private static void startGame(int difficulty) {

		switch (difficulty) {
		case 1:
			easyGame();
		case 2:
			normalGame();
		case 3:
			hardGame();
			default:
				System.out.println("Needs to be between 1-3");
		}
		

		// TODO Gör defualt och skriv måste va mellan 1-3

	}

	private static void easyGame() {

		populateEasyWordList();
		
		String answer = getRandomWord();
		System.out.println(answer);
	
		for (int tries = 0; tries < 10; tries++) {
			String guess = getGuess();
			System.out.println(guess);
			if (guess.contains(guess)) {
				System.out.println("GJ");
				
			} else {
				System.out.println("Wrong");
			}

			// TODO läxa! ta reda på hur jag kollar om guess finns i answer, Måndag på
			// programmering färdig. w3 school

		}
	}

	private static String getRandomWord() {
		int range = _wordList.size();
		int randomIndex = (int) (Math.random() * range);
		return _wordList.get(randomIndex);
	}

	private static void populateEasyWordList() {
		_wordList.clear();
		_wordList.add("Hello");
		_wordList.add("Danger");
		_wordList.add("Chart");
		_wordList.add("error");
		_wordList.add("saint");
	}

	private static String getGuess() {

		String letterThatHasBeenGuessed = " ";
		Scanner input = new Scanner(System.in);
		letterThatHasBeenGuessed = input.nextLine();

		return letterThatHasBeenGuessed;
		// TODO. Läxa!! get char from console
	}

	private static void normalGame() {

	}

	private static void hardGame() {

	}

	private static int getDifficulty() {
		return getValidIntegerInput(); //Skickar det den fick av getValidIntegerInput till Play
	}

	private static int getValidIntegerInput() { //tar emot input och sedan skickar tbx till get getDifficulty
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
		System.out.println("Good Bye!");
	}

}
