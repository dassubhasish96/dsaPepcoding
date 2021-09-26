package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		while (n > 0) {
			System.out.println(n % 10);
			n /= 10;
		}
	}
}
