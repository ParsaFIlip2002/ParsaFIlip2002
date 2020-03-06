import java.util.Scanner;

public class talspelet {

	public static void main(String[] args) {

		do {
			System.out.println("WELCOME TO MY GAME! To win you have to guess the right number.");
			System.out.println("CHOOSE WHAT LEVEL YOU WOULD LIKE TO PLAY. ");
			System.out.println("(1)	- Level one has 20 guesses in between the nummbers 1>20");
			System.out.println("(2)	- Level two has 15 guesses in between the nummbers 1>40");
			System.out.println("(3)	- Level three has 8 guesses in between the nummbers 1>60");

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
				LevelOne(choice);
			}

			else if (choice == 2) {
				LevelTwo(choice);
			}

			else if (choice == 3) {
				LevelThree(choice);
			} 
			else if (choice != 1) {
				System.out.println("Integer must be between 1-3");

			} 
			
		} while (true);
	}

	
	
	/** 
	 * Metoden har en for-loop som gör att guesses inte bestiger 20 och så att guesses adderas varje gång loopen körs. 
	 * 
	 * Jag har en try catch för inputen i loppen så om input blir error skriver den ut att att den måste vara en integer
	 * 
	 * 
	 * @param choice
	 */
	public static void LevelOne(int choice) {

		String LevelOne; // Kallar LevelOne som finns i mainen

		switch (choice) {
		case 1:
			System.out.println("You have choosen level 1. Guees the number!"); // Skriver ut att man valt level ett

			int min = 1;
			int max = 20;// gör så att slumpgeneratorn slumpar mellan 1-20

			int randomnumber = (int) (Math.random() * (max - min + 1) + min); // Slumpgenerator som använder int min och
																				// int max

			int guesses = 0; // Sätter guesses till 0

			Scanner input1 = new Scanner(System.in); // skannar gissningen
			int tal1 = 0;

			for (guesses = 1; guesses <= 20; guesses++) { // Vilkor för loopen. Sätter guesses till 1, guesses får inte
															// bli mer än 20.
				// Lägger till en på guesses varje gång loopen körs.

				try {
					tal1 = input1.nextInt(); // Skannar input och deklarer den till tal1
				} catch (Exception e) {

					input1.next();
					System.out.println("Index must be an integer");
					System.out.println(e);
					guesses--;
				}

				System.out.println("Guesses:" + guesses);
				if (tal1 == randomnumber) { // om man gissar ut skriver den ut detta och visar randomnumber
					System.out.println("Congratulations you won! The random number is:" + randomnumber);
					break;
				}

				else if (randomnumber > tal1) { // Om man gissar för lågt så skriver den ut Bigger
					System.out.println("Bigger");
				}

				else if (randomnumber < tal1) { // Om man gissar för högt skriver den ut Lower
					System.out.println("Lower");

				}

				if (guesses == 20) {
					System.out.println("You lost. Follow the instructions to play again!"); // Om man gissar mer än 20 gånger skriver den ut You lost!
					break;

				}

			}
		}

	}
	/** 
	 * Metoden har en for-loop som gör att guesses inte bestiger 22 och så att guesses adderas varje gång loopen körs. 
	 * 
	 * Jag har en try catch för inputen i loppen så om input blir error skriver den ut att att den måste vara en integer
	 * Metoderna är nästan indentiska 
	 * 
	 * @param choice
	 */
	public static void LevelTwo(int choice) {

		String LevelTwo;

		switch (choice) {
		case 2:
			System.out.println("You have choosen level 2. Guess the number.");

			int min = 1;
			int max = 40;

			int randomnumber = (int) (Math.random() * (max - min + 1) + min);

			int guesses = 0;

			Scanner input1 = new Scanner(System.in);

			int tal1 = 0;

			for (guesses = 1; guesses <= 15; guesses++) {

				try {
					tal1 = input1.nextInt(); // Skannar input och deklarer den till tal1
				} catch (Exception e) {

					input1.next();
					System.out.println("Index must be an integer");
					System.out.println(e);
					guesses--;
				}

				System.out.println("Guesses:" + guesses);
				if (tal1 == randomnumber) {
					System.out.println("congratulations you won! The random number is:" + randomnumber);
					break;
				}

				else if (randomnumber > tal1) {
					System.out.println("Bigger");
				}

				else if (randomnumber < tal1) {
					System.out.println("Lower");

				}

				if (guesses == 15) {
					System.out.println("You lost. Follow the instructions to play again!");
					break;

				}

			}
		}
	}
	/** 
	 * Metoden har en for-loop som gör att guesses inte bestiger 8 och så att guesses adderas varje gång loopen körs. 
	 * 
	 * Jag har en try catch för inputen i loppen så om input blir error skriver den ut att att den måste vara en integer
	 * 	  Metoderna är nästan indentiska 
	 * Metoden är den samma som 1 och 2 men skillnaden är int min och max som kontrolerar intervallet på slumpgeneratorn
	 * och hur många guesses man har 
	 * @param choice
	 */
	public static void LevelThree(int choice) {

		String LevelThree;

		switch (choice) {
		case 3:
			System.out.println("You have choosen level 3. Guess the number");

			int min = 1;
			int max = 60;

			int randomnumber = (int) (Math.random() * (max - min + 1) + min);

			int guesses = 0;

			Scanner input1 = new Scanner(System.in);

			int tal1 = 0;
			for (guesses = 1; guesses <= 8; guesses++) {
				
				try {
					tal1 = input1.nextInt(); // Skannar input och deklarer den till tal1
				} catch (Exception e) {

					input1.next();
					System.out.println("Index must be an integer");
					System.out.println(e);
					guesses--;
				}
				
				if (tal1 == randomnumber) {
					System.out.println("congratulations you won! The random number is:" + randomnumber);
					break;
				}

				else if (randomnumber > tal1) {
					System.out.println("Bigger");
				}

				else if (randomnumber < tal1) {
					System.out.println("Lower");

				}

				if (guesses == 8) {
					System.out.println("You lost. Follow the instructions to play again!");
					break;

				}
				System.out.println("Guesses:" + guesses);
				

			}

		}

	}
}