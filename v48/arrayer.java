import java.util.Arrays;
import java.util.Scanner;

public class arrayer {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int[] siffror1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //skapar en arrray och fyller den med 10 tal 
	
		int [] siffror2 = new int[10]; //skapar en array med 10 tomma l�dor
	
		for (int i = 0; i < siffror1.length; i++) {
			siffror2[i] = input.nextInt();
			System.out.print(siffror1[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(siffror1));
		
		for (int i : siffror2) {
			System.out.print(siffror1[i]);
		}
	}
}
