import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tal1;
		int tal2;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Skriv ut två olika heltal med enter i mellan!");
		
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		if (tal1 <= tal2) {
			System.out.println("Minsta talet är;" + tal1);
		}
		else {
			System.out.println("Minsta talet är;" + tal2);
		}
		
		}
	

}
