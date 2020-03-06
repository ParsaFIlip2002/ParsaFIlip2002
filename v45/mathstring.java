import java.util.Scanner;

public class mathstring {

	public static void main(String[] args) {
		
		double svar = Math.sqrt(Math.pow(3, 2) + 4);	
	// bSystem.out.println(svar);
	
		Math.max(3, 7);
	
			String mening = "Tommas är dum men taskig";
			System.out.println(mening);

			Scanner input = new Scanner(System.in);
			
			String mening2 = input.nextLine();
			
			if(mening.equals(mening2)) {
				System.out.println("Samma mening");
			}
			
		
			System.out.println(mening.length());
			System.out.println(mening.toLowerCase());
	}

}
