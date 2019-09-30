package laxor;

import java.util.Scanner;

public class Stuck {
	
	static Scanner input;
	
	public static void main(String[] args) {
		input=new Scanner(System.in);
		
		System.out.println("Skriv in ett maxtal mellan 1-100");
		
		int maxTal= input.nextInt();
		
		boolean invalid = maxTal < 1 && maxTal>100;
				
		for(int i = 1; i <= maxTal && !invalid; i++)
			System.out.println(i +  " Abracadabra");
		
		if (invalid)
			System.out.println("Talet är utanför gränserna.");
		
	}

}
