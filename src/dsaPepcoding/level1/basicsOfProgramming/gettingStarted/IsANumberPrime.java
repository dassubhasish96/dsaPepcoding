package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class IsANumberPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			if (isPrime(n))
				System.out.println("prime");
			else
				System.out.println("not prime");
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
