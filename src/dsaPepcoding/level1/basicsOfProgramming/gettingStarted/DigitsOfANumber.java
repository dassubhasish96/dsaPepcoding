package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class DigitsOfANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int len = countDigits(n);
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(n / (int) Math.pow(10, i) % 10);
		}

	}

	public static int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}