package V38;

import java.lang.reflect.Array;
import java.util.Scanner;

public class laxa23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Skriv in 5 heltal(kan vara negativa också.)");


		Scanner input = new Scanner(System.in);
		int total = 0;
		int average;
		int grade;
		int counter = 0;
		
		while (counter < 5) {
			grade = input.nextInt();
					total = total + grade;
					counter++;
		}
		
		
				
			
		average = total/5;
		
		System.out.println("Medelvärde:"+ average);
		
	}

}
