import java.util.Scanner;

public class övningar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Skriv ut två heltal!");
		
		Scanner input= new Scanner(System.in);
		
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		
		
		if (tal1>tal2 ) {
		System.out.println(tal2);
		}
		
		if (tal2>tal1) {
			System.out.println(tal1);
		}
	

	}
	
}
