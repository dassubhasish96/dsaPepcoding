package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int spaceCount = n / 2;
		int starCount = 1;

		int temp = n / 2 + 1;
		while (temp-- > 0) {
			for (int i = 1; i <= spaceCount; i++)
				System.out.print('\t');
			for (int i = 1; i <= starCount; i++)
				System.out.print("*\t");
			System.out.println();
			spaceCount--;
			starCount += 2;
		}

		temp = n / 2;
		spaceCount = 1;
		starCount = n - 2;
		while (temp-- > 0) {
			for (int i = 1; i <= spaceCount; i++)
				System.out.print('\t');
			for (int i = 1; i <= starCount; i++)
				System.out.print("*\t");
			System.out.println();
			spaceCount++;
			starCount -= 2;
		}

	}
}
