package lektion;

import java.util.Scanner;

public class Lektion3 {

	public static void main(String[] args) {
		
		// villkor
		
		boolean again = true; 
		int age = 0; // initierat variabel
		int svar2 = 0;
		Scanner input= new Scanner(System.in); // G�r det m�jligt att f� input fr�n
			
		System.out.println("Hur gammal �r du?"); 
		age = input.nextInt();
		
		if (age >= 18) { // (vilkor) dvs  man j�mf�r i detta fal tv� heltal
			
			System.out.println("Du �r gammal nog f�r att k�ra bil! Grattis ditt smuts.");
			System.out.println("Bara s� du vet f�r du �ka moppe ocks�");
			
			
		}
		
		else if (age > 14 && age <18) {
			
			System.out.println("Du �r f�r ung f�r att k�ra bil men du f�r �ka moppe");
		}
	
			
			
		else {  // om vilkoret inte uppfylls k�r else
			System.out.println("Tyv�rr, du f�r v�nta ett tag till!");
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
