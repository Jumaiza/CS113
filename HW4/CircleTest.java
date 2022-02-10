//Zaid Abu Jumaiza - CS113004

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		
		Scanner bot = new Scanner(System.in);
		
		Point point1 = new Point((int)((Math.random()*10)+1),(int)((Math.random()*10)+1));
		Point point2 = new Point(0,0);
		
		System.out.println("Radius of the first Circle:");
		float r1 = bot.nextFloat();
		Circle circle1 = new Circle(point1,r1);
		float r2 = 5.5f;
		Circle circle2 = new Circle(point2,r2);
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
		double distance = point2.distance(point1);
		
		System.out.println();
		System.out.println("The distance between their centers is "+distance);

	}

}
