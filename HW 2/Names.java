//Zaid Abu Jumaiza - CS113004

import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		
		Scanner bot = new Scanner(System.in);
		System.out.println("Enter the first student name.");
		String firstName = bot.nextLine();
		System.out.println("Enter the second student name.");
		String secondName = bot.nextLine();
		System.out.println("Enter the third student name.");
		String thirdName = bot.nextLine();
		
		double average = (firstName.length()+secondName.length()+thirdName.length())/3.0;
		
		System.out.println(average);
		System.out.println(firstName.substring(0,1).toUpperCase()+secondName.substring(0,1).toUpperCase()+thirdName.substring(0,1).toUpperCase());
		
		
	}

}
