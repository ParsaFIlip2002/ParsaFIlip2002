package laxor;
import java.util.Scanner;

public class laxa2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int tal1;
		int tal2;
		int tal3;
		int tal4;
		int tal5;
		 
		
		int highest = 0;
		int lowest = 0;
		double mean;
		System.out.println("Skriv 5 heltal:");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		tal3= input.nextInt();	
		tal4 = input.nextInt();
		tal5 = input.nextInt();
		if (tal1 >=tal2 && tal1 >=tal3 && tal1 >=tal4 && tal1 >=tal5) {
			System.out.println("Highest Number: "+tal1);
	    }

		if (tal2 >=tal1 && tal2 >=tal3 && tal2 >=tal4 && tal2 >=tal5) {
			System.out.println("Highest Number "+tal2);
			
		}
		
		if (tal3 >=tal1 && tal3 >=tal2 && tal3 >=tal4 && tal3 >=tal5) {
		    System.out.println("Highest Number "+tal3);
		
		}
		
		if (tal4 >=tal1 && tal4 >=tal2 && tal4 >=tal3 && tal4 >=tal5) {
			System.out.println("Highest Number "+tal4);
		
		}
		
		if (tal5 >=tal1 && tal5	>=tal2 && tal5 >=tal3 && tal5 >=tal4) {
			System.out.println("Highest Number "+tal5);
		
	}
		

		if (tal1 <=tal2 && tal1 <=tal3 && tal1 <=tal4 && tal1 <=tal5) {
			System.out.println("Lowest Number: "+tal1);
		}
		
		if (tal2 <=tal1 && tal2 <=tal3 && tal2 <=tal4 && tal2 <=tal5) {
			System.out.println("Lowest Number: "+tal2);
		}
		
		if (tal3 <=tal1 && tal3 <=tal2 && tal3 <=tal4 && tal3 <=tal5) {
			System.out.println("Lowest Number: "+tal3);
		}
		
		if (tal4 <=tal1 && tal4 <=tal2 && tal4 <=tal3 && tal4 <=tal5) {
			System.out.println("Lowest Number: "+tal4);
		}
		
		if (tal5 <=tal1 && tal5 <=tal2 && tal5 <=tal3 && tal5 <=tal4) {
			System.out.println("Lowest Number: "+tal5);
		}
		
		mean = (tal1 + tal2 + tal3 + tal4 + tal5) /5.0 ;
				System.out.println("Mean value is " + mean);
	}

}
