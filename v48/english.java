
public class english {

	public static void main(String[] args) {
	
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };
		
		System.out.println(mostNumbers(numbers));
	} 
	/**
	 */
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

}
