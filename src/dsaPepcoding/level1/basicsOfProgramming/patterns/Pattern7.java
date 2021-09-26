package dsaPepcoding.level1.basicsOfProgramming.patterns;

import java.util.*;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print('\t');
			System.out.println("*");
		}
	}
}
