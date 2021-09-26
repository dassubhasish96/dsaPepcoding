package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int starCount = n / 2 + 1;
		int spaceCount = 1;

		int temp = n / 2 + 1;
		while (temp-- > 0) {
			printStar(starCount);
			printSpace(spaceCount);
			printStar(starCount);
			System.out.println();

			starCount--;
			spaceCount += 2;
		}

		starCount = 2;
		spaceCount = n - 2;

		temp = n / 2;
		while (temp-- > 0) {
			printStar(starCount);
			printSpace(spaceCount);
			printStar(starCount);
			System.out.println();

			starCount++;
			spaceCount -= 2;
		}

	}

	public static void printStar(int count) {
		while (count-- > 0)
			System.out.print("*\t");
	}

	public static void printSpace(int count) {
		while (count-- > 0)
			System.out.print("\t");
	}
}
