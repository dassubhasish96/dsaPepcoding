package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int leftSpaceCount = n / 2;
		int midSpaceCount = -1;

		int temp = n / 2 + 1;
		while (temp-- > 0) {
			printSpace(leftSpaceCount);
			System.out.print("*\t");
			printSpace(midSpaceCount);
			if (temp != n / 2)
				System.out.print("*\t");

			leftSpaceCount--;
			midSpaceCount += 2;

			System.out.println();
		}

		temp = n / 2;
		leftSpaceCount = 1;
		midSpaceCount = n - 4;

		while (temp-- > 0) {
			printSpace(leftSpaceCount);
			System.out.print("*\t");
			printSpace(midSpaceCount);
			if (temp != 0)
				System.out.print("*\t");

			leftSpaceCount++;
			midSpaceCount -= 2;

			System.out.println();
		}

	}

	public static void printSpace(int count) {
		while (count-- > 0)
			System.out.print("\t");
	}
}