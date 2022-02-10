//Zaid Abu Jumaiza - CS113004

import java.util.Scanner;

public class TestEvens {
	
	public static int SmallEven(int[] numArray, int target) {
		int count = 0;
		for (int i = 0; i<numArray.length;i++) {
			if (numArray[i]<target && numArray[i]%2==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		
		int[] nums = {2,7,8,3,4,10};
		
		System.out.println("Enter a target value: ");
		int target = bot.nextInt();
		
		System.out.println(SmallEven(nums,target));
		
	}

}
