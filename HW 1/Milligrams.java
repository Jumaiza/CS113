//Zaid Abu Jumaiza - CS113004

public class Milligrams {

	public static void main(String[] args) {
		
		int milligrams = 65425345;
		
		int kilograms = milligrams/1000000;
		int grams = (milligrams%1000000)/1000;
		int milligram = (milligrams%1000000)%1000;
		
		System.out.println(milligrams+" milligrams is equivalent to "+kilograms+" kilogram(s), "
		+grams+" gram(s), and "+milligram+" milligram(s).");

	}

}
