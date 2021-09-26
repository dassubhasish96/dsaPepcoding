package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class RotateANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int len = countDigits(n);

		k = k % len;

		if (k < 0)
			k += len;

		int firstPart = n / (int) Math.pow(10, k);
		int secondPart = n % (int) Math.pow(10, k);

		int ans = secondPart * (int) Math.pow(10, len - k) + firstPart;

		System.out.println(ans);
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
