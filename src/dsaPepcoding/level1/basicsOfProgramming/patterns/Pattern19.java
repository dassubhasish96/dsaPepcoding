package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n / 2 + 1 || j == n / 2 + 1 || (i == 1 && j <= n / 2 + 1) || (i == n && j >= n / 2 + 1)
						|| (j == 1 && i >= n / 2 + 1) || (j == n && i <= n / 2 + 1))
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}
