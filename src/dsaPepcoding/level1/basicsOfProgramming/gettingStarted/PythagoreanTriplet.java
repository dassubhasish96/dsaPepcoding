package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
	}
}
