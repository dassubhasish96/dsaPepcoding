package dsaPepcoding.level1.basicsOfProgramming.gettingStarted;

import java.util.*;

public class LargestNumber {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] nums = new int[n];
			for (int i = 0; i < n; i++)
				nums[i] = scanner.nextInt();
			l: for (int i = 0; i < nums.length - 1; i++) {
				int max = -1;
				int idx = -1;
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] > nums[i]) {
						if (nums[j] > max) {
							max = nums[j];
							idx = j;
						}
					}
				}
				if (max != -1) {
					int temp = nums[i];
					nums[i] = nums[idx];
					nums[idx] = temp;
					break l;
				}
			}
			for (int i = 0; i < nums.length; i++)
				System.out.print(nums[i] + " ");
			System.out.println();
		}
	}

}