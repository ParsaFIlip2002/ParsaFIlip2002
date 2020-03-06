import java.util.Arrays;
import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Skriv in ett intervall!");
		int intervall = input.nextInt();
		
		System.out.println("Skriv in antal tal!");
		int antaltal = input.nextInt();

		int[] numbers = new int[antaltal];
		boolean swapped;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) { //slumpar 37 heltal mellan 0-1000
			numbers[i] = (int) (Math.random()*intervall);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		int iteration = 0;
		do {

			swapped = false; // nollställer swapped i början på jämförelsen
			
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande tal
					temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
					iteration++;
					
				}

			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Antal iterationer:"+ iteration);
	}
	
}