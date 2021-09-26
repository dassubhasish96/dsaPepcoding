package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int spaceCount = 2 * n - 3;
		for (int i = 1; i <= n; i++) {
			printIncrement(i);
			printSpace(spaceCount);
			if (i == n)
				printDecrement(i - 1);
			else
				printDecrement(i);
			System.out.println();
			spaceCount -= 2;
		}

	}

	public static void printIncrement(int count) {
		for (int i = 1; i <= count; i++)
			System.out.print(i + "\t");
	}

	public static void printDecrement(int count) {
		for (int i = count; i >= 1; i--)
			System.out.print(i + "\t");
	}

	public static void printSpace(int count) {
		while (count-- > 0)
			System.out.print("\t");
	}
}
