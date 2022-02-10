//Zaid Abu Jumaiza - CS113004

import java.util.Arrays;
import java.util.Scanner;

public class TestRecursion {

	public static void printDigits(int n) {
		if (n < 10) {
			System.out.println(n);
		} else {
			printDigits(n / 10);
			System.out.println(n % 10);
		}
	}

	public static int sumArray(int[] nums) {
		
		int sum = 0;
		
		if (nums.length == 1) {
			sum = nums[0];
		} else {
			sum = nums[0] + sumArray(Arrays.copyOfRange(nums, 1, nums.length));
		}
		return sum;
	}

	public static void pascalTriangle(int rows) {
		for (int i = 0;i<rows;i++) {
			for (int j = 0;j<=i;j++) {
				System.out.print(printPascal(i,j)+" ");
			}
			System.out.println();
		}
	}
	
	public static int printPascal(int i, int j) {
		
		if (j==0) {
			return 1;
		}else if (j==i) {
			return 1;
		}else {
			return printPascal(i-1,j-1)+printPascal(i-1,j);
		}

	}

	public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
		System.out.println("Problem 3: ");
		System.out.println("Enter the amount of rows for your triangle: ");
		int rows = bot.nextInt();
		pascalTriangle(rows);
		System.out.println();
		
		int[] numbers = { 1, 2, 3};
		System.out.println("Problem 2: ");
		System.out.println(sumArray(numbers));
		System.out.println();
		
		System.out.println("Problem 1: ");
		printDigits(23145);

		bot.close();
	}

}
