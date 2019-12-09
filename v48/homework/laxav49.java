package homework;

import java.util.Arrays;

public class laxav49 {

	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		

		System.out.println(numberOfSevens(numbers));
		System.out.println(numberOfToms(names));
		System.out.println(mostPopAndLeastPop(numbers));
		System.out.println(indexOfDrusilla(names));
		System.out.println(sumOfEvenNumbers(numbers));
		System.out.println(amountOfIndividualNumbers(numbers));
		System.out.println(numberOfNamesThatStartWithL(names));
		System.out.println(amountOfFiveLetterNames(names));
		System.out.println(numberOfUniqueNames(names));
		System.out.println(mostPopularName(names));
	
		
	}

	/**
	 * Hittar 7or
	 * @param numbers
	 * @return result
	 */
	public static String numberOfSevens(int[]numbers) {
		
		int antal7 = 0;
		String result = "";

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				antal7++;
			}

		}
		result = "Amount of \"7\": " + antal7 + "\n";
		return result;

	}
	
	/**
	 * Hittar Toms
	 * @param names
	 * @return result
	 */
	public static String numberOfToms(String[]names){
		
		int antalTom = 0;
		String result;
		
		for (int i = 0; i < names.length; i++) {
			
			if(names[i] == "Tom") {
				antalTom++;
			}
		}
		result = "Amount of \"Tom\": " + antalTom + "\n";
		return result;
	}

	/**
	 * Hittar högst och lägst numret
	 * @param numbers
	 * @return mostAndLeast
	 */
	public static String mostPopAndLeastPop(int[]numbers){
		
		int most = 0;
		int least = numbers.length;
		int counter = 0;
		int mostItem = 0;
		int leastItem = 0;

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers.length; j++) {

				if (numbers[i] == numbers[j]) {
					counter++;
				}
				
				if (most < counter) {
					most = counter;
					mostItem = numbers[i];
				}
			}
			
			if (counter <= least) {
				least = counter;
				leastItem = numbers[i];
			}
			
			counter = 0;
		}

		String mostItemS = Integer.toString(mostItem);
		String leastItemS = Integer.toString(leastItem);
		String mostAndLeast ="Most popular number: " + mostItemS + "\n" + "Least popular number: " + leastItemS + "\n";
		return mostAndLeast;
		
		
		
		
	}


	/**
	 * Hittar position i arrayn för Drusilla
	 * @param names
	 * @return result
	 */
	public static String indexOfDrusilla(String[]names){

		int index = 0;
		String result = "";

		for (int i = 0; i < names.length; i++) {

			if(names[i].contains("Drusilla")) {
				index = i;
			}
		}
		result = "Index of \"Drusilla\": " + index + "\n";
		return result;

	}


	/**
	 * Adderar alla jämna tal
	 * @param numbers
	 * @return result
	 */
	public static String sumOfEvenNumbers(int[]numbers) {

		int sum = 0;
		String result = "";
	
		for (int i = 0; i < numbers.length; i++) {
			
				if(numbers[i] % 2 == 0) {
					sum = sum + numbers[i];
				}
		}
		result = "Sum of even numbers: " + sum + "\n";
		return result;				//0 (7)
									//2 (6)
									//4 (14)
									//6 (8)
									//8 (12)
									// summa = 212
	}
	
	
	/**
	 * Hur många av varje nummer 
	 * @param numbers
	 * @return result
	 */
	public static String amountOfIndividualNumbers(int[]numbers) {
		
		int counter = 0;
		String result = "Number \tAmount \n";
		
		Arrays.sort(numbers);


		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers.length; j++) {

				if (numbers[i] == numbers[j]) {
					counter++;
				}
				
				
			}
			result = result + numbers[i] + "\t" + counter + "\n";
			i = i + counter;
			counter = 0;
		}
			
		return result;
	}
	
	
	/**
	 * Hittar namn som starta på "L"
	 * @param names
	 * @return result
	 */
	public static String numberOfNamesThatStartWithL(String[]names) {

		int L = 0;
		String result = "";
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].contains("L")) {
				L++;
			}
		}
		result = "Amount of names that start with the letter \"L\": " + L + "\n";
		return result;
	}
	
	
	/**
	 * Hittar hur många namn som har 5 bokstäver 
	 * @param names
	 * @return result
	 */
	public static String amountOfFiveLetterNames(String[]names) {

		int fiveLetter = 0;
		String result = "";
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() == 5) {
				fiveLetter++;
			}
		}
		result = "Amount of names that has five letters: " + fiveLetter + "\n";
		return result;
	}
	
	
	/**
	 * Räknar hur många unika namn
	 * @param names
	 * @return result
	 */
	public static String numberOfUniqueNames(String[]names) {

		int counter = 0;
		int unique = 0;
		String result = "";
		
		for (int i = 0; i < names.length; i++) {
				counter = 0;
			for (int j = 0; j < names.length; j++) {
				
				if(names[i] == names[j]) {
					counter++;
				}
				
			}
			
			if(counter == 1) {
				unique++;
			}
		}
		result = "Amount of unique names: " + unique + "\n";
		return result;
	}
	
	
	/**
	 * Hittar och skickar tillbaka det mest populara namnet
	 * @param names
	 * @return result
	 */
	public static String mostPopularName(String[]names) {
		
		int counter = 0;
		int most = 0;
		String currentPop = "";
		String result = "";
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names.length; j++) {
				if(names[i] == names[j]) {
					counter++;
				}
				if(most < counter) {
					most = counter;
					currentPop = names[i];
				}
			}
			counter = 0;
		}
		result = "The most popular name: " + currentPop + "\n";
		return result;
	}
}
