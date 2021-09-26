package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class InverseOfANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		int count = 1;
		while (n > 0) {
			map.put(n % 10, count);
			count++;
			n /= 10;
		}
		int res = 0;
		for (int i = count - 1; i >= 1; i--) {
			res = res * 10 + map.get(i);
		}
		System.out.println(res);
	}
}
