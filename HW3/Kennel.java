//Zaid Abu Jumaiza CS113004

import java.util.Scanner;

public class Kennel {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		Scanner bot = new Scanner(System.in);
		
		System.out.print("What is the first dog's name?: ");
		dog1.setName(bot.nextLine());
		System.out.print("What is their age?:");
		dog1.setAge(bot.nextInt());
		bot.nextLine();
		
		System.out.print("\nWhat is the second dog's name?: ");
		dog2.setName(bot.nextLine());
		System.out.print("What is their age?: ");
		dog2.setAge(bot.nextInt());
			
		double average = (dog1.toPersonYears()+dog2.toPersonYears())/2.0;
		
		System.out.println("\n");
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		
		System.out.println(dog1.getName()+" and "+dog2.getName()+"have an average of "+average+" person years");
		

	}

}
