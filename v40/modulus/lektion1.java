package modulus;

public class lektion1 {

	public static void main(String[] args) {

			
		
		// % == modulus 
		
		int tal1 = 47;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;
		
		System.out.println(tal1%3); // testar ifall tal 1 är delbart med 3 
									// är den det blir svart 0 om inte så anges rest.
	
	
	int summa= 0;
	for( int i = 0; i < 101 ; i++){
		
		if(i%3== 0) {
			System.out.println("Talet" + i + " är delbart med 3");
			summa+= i;
			
		 
		}
	}
	System.out.println("The total sum of all integers divisble by 3 is:" + summa);

	int turn = 0; 
	while (true) {
		
		turn++;
		
		if (turn%3 == 0) {
			System.out.println("Davids tur");
			
			}
		
		else if(turn%3== 1) {
			System.out.println("Johans tur");
		}
		else if(turn%3== 2) {
			System.out.println("Lucas tur");
			}
		if (turn == 100) {
			break;
		}
		}
	}

}
