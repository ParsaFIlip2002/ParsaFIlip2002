import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("0");
		nameList.add("1");
		nameList.add("2");
		nameList.add("3");
		nameList.add("4");
		nameList.add("5");
		nameList.add("6");
		nameList.add("7");
		nameList.add("8");
		nameList.add("9");
		nameList.add("10");
		nameList.add(9 , "5");
		nameList.add(4 , "10");
		nameList.remove(5);
		nameList.remove(10);
		System.out.println(nameList);
		
		
	}

}
