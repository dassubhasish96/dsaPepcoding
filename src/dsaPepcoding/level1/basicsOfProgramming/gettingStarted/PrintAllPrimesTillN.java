package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class PrintAllPrimesTillN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int low = scanner.nextInt();
		int high = scanner.nextInt();
		for (int i = low; i <= high; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}