package v40;

import java.util.Scanner;

public class laxav40 {

	public static void main(String[] args) {
		System.out.println("What time would you like to wake up?");
		Scanner konsol =new Scanner(System.in);
		
		int x = konsol.nextInt();
		int y = konsol.nextInt();

		System.out.println();
		
		if (y>=45) { // om antal minuter är större än 44 då behöver man inte minska timma med ett
			System.out.println(x + ":" + (y-45));
			
		}
		
		if (y<45) { 
			System.out.println((x-1) + ":" + (y-45)/(-) );
		}
	
	
	}
		
	
}
	
	


		
		
		
	

