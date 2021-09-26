package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class PrimeFactorisation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 2; i * i < n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		if (n != 1)
			System.out.print(n);
	}
}
