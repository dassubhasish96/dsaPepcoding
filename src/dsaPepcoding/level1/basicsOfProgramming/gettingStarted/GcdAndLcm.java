package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class GcdAndLcm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int temp1 = num1, temp2 = num2;

		while (temp1 % temp2 != 0) {
			int rem = temp1 % temp2;
			temp1 = temp2;
			temp2 = rem;
		}

		int gcd = temp2;
		int lcm = (num1 * num2) / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
}