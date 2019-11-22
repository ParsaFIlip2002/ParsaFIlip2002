
public class laxav46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fahrenheitToKelvin(85));
		System.out.println(KelvintoCelcius(200));
		System.out.println(km(200)); // km/h till m/s
		System.out.println(massa1(2, 2)); // massa o hastighet
		System.out.println(höjd(5, 10)); // massa o höjd
		System.out.println(värden(2, 5, 3)); // potentiel energi
		System.out.println(smallletters("PaParaZZi"));
		System.out.println(bigletters("Jag vill bli godkänd i programmering!"));
		System.out.println(värden2(2, 10)); // tiden
		System.out.println(arbete(10, 2));// A=F*s
		System.out.println(energi(10, 9.82)); // 10=massa = ,g=9,82
		System.out.println(radie(2)); // volym på sfär
		System.out.println(bmi(75 , 1.7)); // räkna ut bmi, längd*längd/vikt
		System.out.println(låda(20, 10, 5)); // räkna ut volym för en låda

	}
	
	
	
	

	public static double låda(double b, double l, double h) {
		return b * l * h;
	}

	public static double bmi(double v, double l) {
		return v/(l*l);
		
	}

	public static double radie(double r) {
		return 4 * 3.14 * Math.pow(r, 3) / 3;
	}

	public static double energi(double a, double b) {
		return a / b;
	}

	public static double arbete(double a, double b) {
		return a * b; // ger ut svar med Nm
	}

	public static double värden2(double s, double h) {
		return s / h; // retunerar tiden

	}

	public static String bigletters(String meaning) {
		String lowerMeanig = meaning.toLowerCase();
		return lowerMeanig.replace('o', '0');
	}

	public static String smallletters(String ord) {
		return ord.toLowerCase();
	}

	public static double värden(double A, double B, double C) {
		return 2 * 5 * 3 / 3;
	}

	public static double höjd(double M, double H) {
		return M * H * 9.82;
	}

	public static double massa1(double M, double V) {
		return M * V * V / 2;
	}

	public static double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit + 459.67) * 5 / 9; // Räknar ut och skickar tillbaka i kelvin
	}

	public static double KelvintoCelcius(double Kelvin) {
		return Kelvin - 273.15; // Räknar ut och skickar tillbaka i celsius
	}

	public static double km(double m) {
		return (m) / 3.6; // Tar km/h och omvandlar till m/s
	}

}
