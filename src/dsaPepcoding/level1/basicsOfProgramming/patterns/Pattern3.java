package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print('\t');
			for (int j = 1; j <= i; j++)
				System.out.print("*\t");
			System.out.println();
		}

	}
}
