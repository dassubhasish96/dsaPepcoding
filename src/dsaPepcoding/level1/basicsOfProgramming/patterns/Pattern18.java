package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int temp = n;
		while (temp-- > 0)
			System.out.print("*\t");
		System.out.println();
		int leftSpaceCount = 1;
		int midSpaceCount = n - 4;
		temp = n / 2 - 1;
		while (temp-- > 0) {
			printSpace(leftSpaceCount);
			System.out.print("*\t");
			printSpace(midSpaceCount);
			System.out.println("*\t");
			leftSpaceCount++;
			midSpaceCount -= 2;
		}
		temp = n / 2 + 1;
		for (int i = 1; i <= temp; i++) {
			printSpace(temp - i);
			printStar(2 * i - 1);
			System.out.println();
		}

	}

	public static void printSpace(int count) {
		while (count-- > 0)
			System.out.print("\t");
	}

	public static void printStar(int count) {
		while (count-- > 0)
			System.out.print("*\t");
	}
}
