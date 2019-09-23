package lektion;

import java.util.Scanner;

public class Laxa2 {

	public static void main(String[] args) {

		System.out.println("Skriv fem olika heltal(kan vara negativa också)!");
		
		
		
		Scanner Input = new Scanner (System.in);
		
		int total= 0;
		int average;
		int grade;
		int counter= 0;
		
		
		while(counter < 5) {
			grade = Input.nextInt();
			total = total + grade;
					counter++;
		}
	average= total/5;
	
	
			System.out.println("Medelvärde:"+ average);
	}

}