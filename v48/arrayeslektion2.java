
public class arrayeslektion2 {

	public static void main(String[] args) {
		
		double[] numbers = new double[20];
		double[] numbers2 = {12,34,45.11};
		
		String[] namn= {"Erik", "Alfred", "Abdi", "Ida"};
		
		for (int i = 0; i < namn.length; i++) {
			int antalA = 0;
			
			for (int j = 0; j < namn.length; j++) {
				if (namn[j].contains("a")) {
				
				antalA++;

				}
			}

			

			
			
		}
		System.out.println("antal A:n är " + antalA );
	}
	

}
