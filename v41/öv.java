import java.util.Scanner;

public class �v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int digit;
		int sum = 0;
		int number;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Skriv ett heltal!:");
		
		number=input.nextInt();
		
		while (number != 0) {
			
			digit = number % 10;
			
			sum += digit;
			number /=  10;

		
			
			
			
	
	
		}
		
	System.out.println(sum);
	


	}	
}
