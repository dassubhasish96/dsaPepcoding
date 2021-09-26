package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class PrintFibonacciNumbersTillN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int n1 = 0;
		int n2 = 1;
		while (n-- > 0) {
			System.out.println(n1);
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp;
		}
	}
}
