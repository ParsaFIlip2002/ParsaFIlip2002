import java.util.Scanner;

public class laxa {

	public static void main(String[] args) {

		int choice = 6;

		Scanner input = new Scanner(System.in);
		
		while (choice == 6) {
		
			System.out.println("V�lkommen till Stadium! V�lj ett kl�desplagg s� h�nivsar jag dig till olika m�rken");
		System.out.println("(1) - Tr�jor");
		System.out.println("(2) - Byxor");
		System.out.println("(3) - Skor");
		System.out.println("(4) - Jackor");
		System.out.println("(5) - Avsluta");
		System.out.println("(6) - Tillbaka till huvud menyn");
		System.out.println(); //Huvudmenyn 

		try {
			choice = input.nextInt(); // G�r s� att man kan svara p� fr�gan ovan.
		} catch (Exception e) {
			System.out.println();
		}

		String genre; //Skapar en variable med string som heter genre

		switch (choice) { // Switch case f�r att det �r ett best�mt antal fall som ska ske
		case 1:
			genre = "Tr�jor";
			System.out.println("Du valde " + genre + "! H�r �r n�gra exemple p� m�rken");
			System.out.println();
			System.out.println("1. Peak Performance");
			System.out.println("2. Sail Racing");
			System.out.println("3. SOC");
			System.out.println(); // N�r man v�ljer siffran 1 f�r man fram denna menyn
			break;
		case 2:
			genre = "Byxor";
			System.out.println("Du valde " + genre + "! H�r �r n�gra exemple p� m�rken!");
			System.out.println();
			System.out.println("1. Hagl�fs");
			System.out.println("2. Nike");
			System.out.println("3. Adidas");
			System.out.println(); // Ger alternativ f�r byxor
			break;
		case 3:
			genre = "Skor";
			System.out.println("Du valde  "  + genre + "! H�r �r n�gra exemple p� m�rken!");
			System.out.println();
			System.out.println("1. Timmberland");
			System.out.println("2. Nike");
			System.out.println("3. Everest");
			System.out.println(); //Alternativ f�r skor
			break;
		case 4:
			genre = "Jackor";
			Scanner case4 = new Scanner(System.in);
			System.out.println("Du valde " + genre + "! H�r �r n�gra exemple p� m�rken!");
			System.out.println();
			System.out.println("1. Nike ");
			System.out.println("2. Adidas");
			System.out.println("3. Hagl�fs");
			Scanner case41 = new Scanner(System.in);
			System.out.println(); 
			break;
		case 5:
			System.out.println("Tack f�r idag!"); // Skrivs n�r programmet avslutas 
			break;
		default:
			genre = "Fel";
			
			System.out.println();
			System.out.println("Du har valt en " + genre + " siffra!");
			System.out.println();
			break;
		case 6:	
			
		Scanner case6 = new Scanner(System.in);
		System.out.println("V�lkommen till Stadium! V�lj ett kl�desplagg s� h�nivsar jag dig till olika m�rken");
		System.out.println("(1) - Tr�jor");
		System.out.println("(2) - Byxor");
		System.out.println("(3) - Skor");
		System.out.println("(4) - Jackor");
		System.out.println("(5) - Avsluta");
		System.out.println("(6) - Tillbaka till huvud menyn");
		System.out.println();
		System.out.println();
			
		
		}
}

	}

}