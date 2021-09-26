package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int starCount = 1;
		for (int i = 1; i <= n; i++) {
			if (i < n / 2 + 1) {
				printSpace(n / 2);
				printStar(starCount);
				starCount++;
			} else if (i == n / 2 + 1) {
				printStar(n);
			} else {
				printSpace(n / 2);
				starCount--;
				printStar(starCount);
			}
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
