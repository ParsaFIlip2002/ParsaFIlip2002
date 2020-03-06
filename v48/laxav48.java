
public class laxav48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println(numberOfToms(names));
		System.out.println(mostNumbers(numbers));
		sevens(numbers);
		System.out.println(find(names));
		System.out.println(even(number));
		System.out.println(hitta(siffra));
	}

	/**
	 * Söker igenom ett antal siffror och letar efter 7. När den hittar 7 så adderar
	 * den AmoutOfSevens med 1.
	 * @return 
	 * 
	 * 
	 */
	public static int hitta(int[] siffra) {
		int nummer = 0;
		int ettor = 0;
		int tvåor = 0;
		int treor = 0;
		int fyror = 0;
		int femor = 0;
		int sexor = 0;
		int sjuor = 0;
		int åtter = 0;
		int nior = 0;
		for (int i = 0; i < siffra.length; i++) {
			if(siffra[i]==1);
			ettor++;
			
		}
		for (int i = 0; i < siffra.length; i++) {
			if(siffra[i]==2); 
			tvåor++;
			
		}
		
		return ettor;
		return tvåor;
		return treor;
		return fyror;
		return femor;
		return sexor;
		return sjuor;
		return åtter;
		return nior;
		
		
		
		
	}
	public static int even(int[] number) {
		int behållare = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 2 || number[i] == 4 || number[i] == 6 || number[i] == 8) {
				behållare = behållare + number[i];
			}
		}
		return behållare;
	}

	public static int find(String[] names) {
		int number = 0; // Initerar en variable
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Drusilla")) { // Kollarom i är lika med Drusilla
				return i;

			}

		}

		return 0;
	}

	private static int mostNumbers(int[] numbers) {
		int most = 0; // Initierar två variabler
		int max = 0;

		for (int i = 0; i < 10; i++) { // Alla tal 0-9
			int amount = 0; // Initierar variable
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) { //
					amount++;
				}
			}

			if (amount > max) {
				most = i;
				max = amount;
			}
		}
		return most;
	}

	public static void sevens(int[] numbers) {

		int AmountOfSevens = 0; // Initierar Variabel
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				AmountOfSevens++;
				/**
				 * Söker igenom ett antal siffror och letar efter 7. När den hittar 7 så adderar
				 * den AmoutOfSevens med 1
				 */
			}

		}
		System.out.println(AmountOfSevens); // Skickar ut hur många 7or den hittat

	}

	private static int numberOfToms(String[] names) {
		int howManyToms = 0; // Initierar en variabel

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Tom")) { // Om loopen hittar en Tom så adderas den i Variabel jag skapat(HowManyToms)
				howManyToms++;
			}
		}
		return howManyToms; // Skickar ut hur många Toms
	}
}
