//Zaid Abu Jumaiza - CS113-004

import java.util.Scanner;

public class ExecutiveRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		System.out.println("Enter number of executives: ");
		int num = Integer.parseInt(bot.next());
		
		Executive2and3 executives[] = new Executive2and3[num];

		for (int i= 0; i<executives.length; i++) {

			System.out.printf("Enter the name of the executive:");
			String name = bot.next();

			System.out.printf("Enter address of the executive:");
			String address = bot.next();

			System.out.printf("Enter the phone number of the executive:");
			String phoneNum = bot.next();

			System.out.printf("Enter the social security number of the executive:");
			String social = bot.next();

			System.out.printf("Enter the pay rate of the executive:");
			double rate = Double.parseDouble(bot.next());

			executives[i] = new Executive2and3(name, address, phoneNum, social, rate);

			System.out.printf("Enter the bonus awarded to this executive:");
			double execBonus = Double.parseDouble(bot.next());

			try {
				executives[i].awardBonus(execBonus);

			} catch (BonusTooLowException e) {
				System.out.println(e.getMessage());

				try {
					executives[i].awardBonus(0);

				} catch (BonusTooLowException e1) {
					
				}
			}

			System.out.println();

		}
		
		int count = 0;
		
		for (int i = 0; i < num; i++) {

			if (executives[i].getBonus() > 0) {
				
				count++;
				double bonus = executives[i].getBonus();
				System.out.printf("Employee %d: Average Pay with Bonus: $%.2f, Bonus: $%.2f\n", (i + 1),
						executives[i].pay(), bonus);

			}

		}

		System.out.println("Total number of executives with valid bonuses: "+count);
		bot.close();

	}

}
