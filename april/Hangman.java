import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	private static String answer;
	private static String[] word;
	private static String[] NoWord;

			
	public static void main(String[] args) {

		System.out.println("Welcome to Hangman! To win you have to guess the right word");
		System.out.println("There are three different levels:");
		System.out.println("The level deppends on how many letters the word contains");
		System.out.println("The first level has a word with five letters");
		System.out.println("The second level has a word with seven letters");
		System.out.println("The third level has a word with nine letters");
		System.out.println("There is also an game mood called own word where you choose your own word");
		System.out.println("Write 1-3 is the level and 4 is own word");

		
		Scanner input = new Scanner(System.in);// Skannar input som kommer ifrån konsolen
		int choice = 0;
		try {
			choice = input.nextInt(); // Deklarer den till int choice
		} catch (Exception e) {
			input.next();
			System.out.println("Need to be an integer between 1-3");
			System.out.println(e);
		}

		if (choice == 1) {
			wordsLevelOne(choice);
			Stars (NoWord);	
			Guess(word);
					
			

		}
	}

	public static void wordsLevelOne(int choice) {
		String[] arr = { "saint", "error", "danger", "chant", "chart" };
		Random r = new Random(); // Inbygd method som slumpar
		int randomIndex = r.nextInt(arr.length); // arr.length för att slumpa 0-4
		System.out.println(arr[randomIndex]);
		answer = arr[randomIndex];

	}

	public static void Guess(String[] word) {
		
		for (int i = 0; i < answer.length(); i++) {

			Scanner input = new Scanner(System.in);
			String Guess = input.next();

			if (answer.contains(Guess)) {
				System.out.println("GJ");
			} 
			else {
				System.out.println("sad");
			}
		}
	}
	
	public static void Stars(String[] NoWord) {
		
		for (int i = 0; i < NoWord.length; i++) {
			String string = NoWord[i];
			
		
			System.out.println("*****");
		}
		return;
		}
	
	

}


