import java.util.Scanner;

public class övni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int product = 1;
		int number = 1;
		int loops = 1;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Skriv talen du vill multiplicera!");
		
		
		while(loops < 11 && product < 100000) { 

			
			number= input.nextInt();
			
			product = product * number;
			loops ++;
			
		}
		
		System.out.println(product);
		
		System.out.println( loops);

		
		
		

		
		
	}

}
