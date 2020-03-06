import java.util.Scanner;

public class laxa {

	public static void main(String[] args) {

		int choice = 6;

		Scanner input = new Scanner(System.in);
		
		while (choice == 6) {
		
			System.out.println("Välkommen till Stadium! Välj ett klädesplagg så hänivsar jag dig till olika märken");
		System.out.println("(1) - Tröjor");
		System.out.println("(2) - Byxor");
		System.out.println("(3) - Skor");
		System.out.println("(4) - Jackor");
		System.out.println("(5) - Avsluta");
		System.out.println("(6) - Tillbaka till huvud menyn");
		System.out.println(); //Huvudmenyn 

		try {
			choice = input.nextInt(); // Gör så att man kan svara på frågan ovan.
		} catch (Exception e) {
			System.out.println();
		}

		String genre; //Skapar en variable med string som heter genre

		switch (choice) { // Switch case för att det är ett bestämt antal fall som ska ske
		case 1:
			genre = "Tröjor";
			System.out.println("Du valde " + genre + "! Här är några exemple på märken");
			System.out.println();
			System.out.println("1. Peak Performance");
			System.out.println("2. Sail Racing");
			System.out.println("3. SOC");
			System.out.println(); // När man väljer siffran 1 får man fram denna menyn
			break;
		case 2:
			genre = "Byxor";
			System.out.println("Du valde " + genre + "! Här är några exemple på märken!");
			System.out.println();
			System.out.println("1. Haglöfs");
			System.out.println("2. Nike");
			System.out.println("3. Adidas");
			System.out.println(); // Ger alternativ för byxor
			break;
		case 3:
			genre = "Skor";
			System.out.println("Du valde  "  + genre + "! Här är några exemple på märken!");
			System.out.println();
			System.out.println("1. Timmberland");
			System.out.println("2. Nike");
			System.out.println("3. Everest");
			System.out.println(); //Alternativ för skor
			break;
		case 4:
			genre = "Jackor";
			Scanner case4 = new Scanner(System.in);
			System.out.println("Du valde " + genre + "! Här är några exemple på märken!");
			System.out.println();
			System.out.println("1. Nike ");
			System.out.println("2. Adidas");
			System.out.println("3. Haglöfs");
			Scanner case41 = new Scanner(System.in);
			System.out.println(); 
			break;
		case 5:
			System.out.println("Tack för idag!"); // Skrivs när programmet avslutas 
			break;
		default:
			genre = "Fel";
			
			System.out.println();
			System.out.println("Du har valt en " + genre + " siffra!");
			System.out.println();
			break;
		case 6:	
			
		Scanner case6 = new Scanner(System.in);
		System.out.println("Välkommen till Stadium! Välj ett klädesplagg så hänivsar jag dig till olika märken");
		System.out.println("(1) - Tröjor");
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