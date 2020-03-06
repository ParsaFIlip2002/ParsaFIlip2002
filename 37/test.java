import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("WELCOME TO MY GAME! To win you have to guess the right number.");
		System.out.println("CHOOSE WHAT LEVEL YOU WOULD LIKE TO PLAY. ");
		System.out.println("(1)	- Level one has 20 guesses in between the nummbers 1>20");
		System.out.println("(2)	- Level two has 15 guesses in between the nummbers 1>40");
		System.out.println("(3)	- Level three has 12 guesses in between the nummbers 1>60");
		System.out.println("(4) - If you want to quit!");
		
		System.out.println();

		choice = input.nextInt();

		switch (choice) {
		case 1:
			int min = 1;
			int max = 20;

			int randomnumber = (int) (Math.random() * (max - min + 1) + min);

			int guesses = 0;

			Scanner input1 = new Scanner(System.in);

			int tal1 = input1.nextInt();

			for (guesses = 1; guesses <= 20; guesses++) {

				tal1 = input1.nextInt();

				if (tal1 == randomnumber) {
					System.out.println("congratulations you won! The random number is:" + randomnumber);
				}

				else if (randomnumber > tal1) {
					System.out.println("Bigger");
				}

				else if (randomnumber < tal1) {
					System.out.println("Lower");

				}

				if (guesses == 20) {
					System.out.println("You lost!");
					break;

				}
			}
		

		case 2:

			int min2 = 1;
			int max2 = 40;

			int randomnumber2 = (int) (Math.random() * (max2 - min2 + 1) + min2);

			int guesses2 = 0;

			Scanner input2 = new Scanner(System.in);

			int tal2 = input2.nextInt();

			for (guesses = 1; guesses <= 15; guesses++) {

				tal1 = input2.nextInt();

				if (tal1 == randomnumber2) {
					System.out.println("congratulations you won! The random number is:" + randomnumber2);
				}

				else if (randomnumber2 > tal1) {
					System.out.println("Bigger");
				}

				else if (randomnumber2 < tal1) {
					System.out.println("Lower");

				}

				if (guesses == 20) {
					System.out.println("You lost!");
					break;

				}
			}
		
			

		case 3:

			System.out.println("Ljud, kontroller");
			break;

		case 4:
			
			System.out.println("Tomas Weis");
			break;

		case 5:
			
			System.out.println("Spelet avslutas");
			break;

		default:
			
			System.out.println("Välj en siffra din dummer");
			break;
		}
	}
}