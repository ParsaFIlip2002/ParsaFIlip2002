import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangan {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Hangman! To win you have to guess the right word");
		System.out.println("There are three different levels:");
		System.out.println("The level deppends on how many letters the word contains");
		System.out.println("The first level has a word with five letters");
		System.out.println("The second level has a word with seven letters");
		System.out.println("The third level has a word with nine letters");
		System.out.println("There is also an game mood where you choose your own word");
		
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
		}
	}
	
	public static void wordsLevelOne(int choice) {
		String[] arr = {"saint", "error", "danger", "chant", "chart" };
		 Random r=new Random();
	        int randomNumber=r.nextInt(arr.length);
	        System.out.println(arr[randomNumber]);
		
	}
	
	

}
