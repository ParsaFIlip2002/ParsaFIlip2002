
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LOL();
		System.out.println(max(5,2));
	}
	public static void LOL() {
		System.out.println("HAHAHAHAHAH");
	}

	/**
	 * Tar ut största talet
	 * @param tal1
	 * @param tal2
	 * @return skickar största talet 
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
