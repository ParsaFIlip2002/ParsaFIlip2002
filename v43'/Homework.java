
public class Homework {

	public static void main(String[] args) {
		;
		System.out.println(max(5,2));
	}

	/**
	 * Tar ut st�rsta talet
	 * @return skickar st�rsta talet 
	 */
	public static int max(int tal1, int tal2) {
		
		if (tal1 <= tal2) {
			return tal2;
		}
		else {
			return tal1;
		}
		
		
	}
}
