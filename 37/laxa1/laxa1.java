package laxa1;

import java.util.Scanner;

public class laxa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vad heter du?");
		
		
		Scanner namnInput = new Scanner (System.in);
		String namn = namnInput.nextLine();
		
		
		System.out.println("Hur gammal �r du?");
		
		Scanner �lderInput = new Scanner (System.in);
		String �lder = �lderInput.nextLine();
		
		System.out.println("Vart bor du?");
		
		Scanner adressInput = new Scanner (System.in);
		String adress = adressInput.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		
		Scanner postnummerInput = new Scanner (System.in);
		String postnummer = postnummerInput.nextLine();
		
		System.out.println("Vad �r ditt telefon nummer?");
		
		Scanner tlfnummerInput = new Scanner (System.in);
		String tlfnummer = tlfnummerInput.nextLine();
	

		
		System.out.println("Information:" + "\n" 		+
						   "Namn:    "     + namn 		+ "\n" +
						   "�lder:   "     + �lder 		+ "\n" +
						   "Adress:  "    + adress 		+ "\n" + 
						   "         "    + postnummer 	+ "\n" + // Finns det ett b�ttre sett att g�ra mellanslag?
						   "Telefon: "   + tlfnummer 	+ "\n"); 
	}

}
