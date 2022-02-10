//Zaid Abu Jumaiza - CS113004

import java.util.Scanner;

public class NameApp {

	public static void main(String[] args) {
		
		Scanner bot = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = bot.nextLine();
		System.out.println("What is your last name?");
		String lastName = bot.nextLine();
		
		String username = firstName.substring(0,1) + firstName.substring(firstName.length()-5)
		+ ((int)(Math.random()*99)+1);
		
		System.out.println(username);
	}

}
