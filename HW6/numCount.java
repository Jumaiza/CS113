//Zaid Abu Jumaiza - CS113004

import java.util.Scanner;

public class numCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		
		int[] numbers = new int[51];
		
		System.out.println("Enter any integer between 0 and 50 inclusive. Enter -1 to end and display results.");
		System.out.println("Enter an integer: ");
		
		int integer = bot.nextInt();
		
		while(integer<=51 && integer>=0) {
			
			numbers[integer] = numbers[integer]+1;
			
			System.out.println("Enter an integer: ");
			integer = bot.nextInt();
		}
		
		for (int i = 0; i<numbers.length;i++) {
			if(numbers[i]>0) {
				System.out.println(i+": "+numbers[i]+ " time(s)");
			}
		}
	}

}
