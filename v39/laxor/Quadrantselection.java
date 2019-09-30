package laxor;

import java.util.Scanner;

public class Quadrantselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Skriv ett x-värde");
		
		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		
		System.out.println("Skriv ett y-värde");
		
		int y = input.nextInt();
		if (x>0 && y>0) {
		System.out.println("B");
		}
		
		if (x<0 && y>0) {
		System.out.println("A");
		}
		
		if (x>0 && y<0) {
			System.out.println("C");
			}
		
		if (x<0 && y<0) {
			System.out.println("D");
			}
		
			
		
		 
		
		
		

			

	}

}
