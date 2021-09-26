package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class MaxMin2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int val1 = scanner.nextInt();
		int max = val1, max2 = val1;
		int min = val1, min2 = val1;

		while (n-- > 1) {
			int val = scanner.nextInt();

			if (val > max) {
				max2 = max;
				max = val;
			} else if (val > max2) {
				max2 = val;
			}

			if (val < min) {
				min2 = min;
				min = val;
			} else if (val < min2) {
				min2 = val;
			}

		}

		System.out.println(max2 + " " + min2);

	}
}
