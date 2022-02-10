//Zaid Abu Jumaiza - CS113004


import java.util.Scanner;

public class GramsToPounds {

	public static void main(String[] args) {
		
		float grams;
		float pounds;
		float conversion = 453.592f;
		
		Scanner bot = new Scanner(System.in);
		System.out.println("Enter grams to convert to pounds.");
		grams = bot.nextFloat();
		
		
		pounds = grams/conversion;
		
		if (pounds == 1.0){
			System.out.println("This is 1 pound.");
		}else {
			System.out.println("This is "+pounds+" pounds.");

	}

}
}