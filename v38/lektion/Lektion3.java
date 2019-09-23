package lektion;

import java.util.Scanner;

public class Lektion3 {

	public static void main(String[] args) {
		
		// villkor
		
		boolean again = true; 
		int age = 0; // initierat variabel
		int svar2 = 0;
		Scanner input= new Scanner(System.in); // Gör det möjligt att få input från
			
		System.out.println("Hur gammal är du?"); 
		age = input.nextInt();
		
		if (age >= 18) { // (vilkor) dvs  man jämför i detta fal två heltal
			
			System.out.println("Du är gammal nog för att köra bil! Grattis ditt smuts.");
			System.out.println("Bara så du vet får du åka moppe också");
			
			
		}
		
		else if (age > 14 && age <18) {
			
			System.out.println("Du är för ung för att köra bil men du får åka moppe");
		}
	
			
			
		else {  // om vilkoret inte uppfylls kör else
			System.out.println("Tyvärr, du får vänta ett tag till!");
			{
			
			if (svar == input.nextInt) //variabeln svar finns inte vilket leder till error.
			{
				again = false;
			}
		
				System.out.println("again= "+ again);
			}
		}

	}
}
