package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class CuriousCaseOfBenjaminBulbs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 1;
		while (i * i <= n) {
			System.out.println(i * i);
			i++;
		}
	}
}
