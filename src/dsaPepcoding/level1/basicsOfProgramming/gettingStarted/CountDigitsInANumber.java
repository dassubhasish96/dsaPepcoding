package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(countDigits(n));
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