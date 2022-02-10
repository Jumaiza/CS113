//Zaid Abu Jumaiza CS113004

package cs113;

import java.util.Scanner;

public class TestMethods {
	
	static MyMethods methods = new MyMethods();

	public static void main(String[] args) {
		
		Scanner bot = new Scanner(System.in);
		
		System.out.println("Enter width: ");
		int width  = bot.nextInt();
		System.out.println("Enter length: ");
		int length = bot.nextInt();
		System.out.println("Enter height: ");
		int height = bot.nextInt();

		System.out.println(methods.Surface(width,length,height));
		System.out.println();
		
		Die die1 = new Die();
		Die die2 = new Die();
		
		System.out.println("1st "+die1+"\n2nd "+die2);
		
		methods.swapFaceValues(die1, die2);
		System.out.println();
		
		System.out.println("After Swap");
		System.out.println("1st "+die1+"\n2nd "+die2);
		
		
		
	}


}
