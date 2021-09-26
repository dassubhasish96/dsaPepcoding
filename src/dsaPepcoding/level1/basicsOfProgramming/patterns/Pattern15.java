package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int spaceCount = n / 2;
		int numCount = 1;

		int start = 1;
		int temp = n / 2 + 1;
		while (temp-- > 0) {
			printSpace(spaceCount);
			printNum(start, numCount);
			start++;
			spaceCount--;
			numCount += 2;
			System.out.println();
		}
		start -= 2;
		temp = n / 2;
		spaceCount = 1;
		numCount = n - 2;
		while (temp-- > 0) {
			printSpace(spaceCount);
			printNum(start, numCount);
			start--;
			spaceCount++;
			numCount -= 2;
			System.out.println();
		}
	}

	public static void printSpace(int count) {
		while (count-- > 0)
			System.out.print("\t");
	}

	public static void printNum(int start, int count) {
		int temp = count / 2 + 1;
		while (temp-- > 0) {
			System.out.print(start++ + "\t");
		}
		start--;
		temp = count / 2;
		while (temp-- > 0) {
			System.out.print(--start + "\t");
		}
	}
}
