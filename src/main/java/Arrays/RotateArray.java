package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
	public static ArrayList<Integer> resultRotedArr = new ArrayList<>();

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		if (nums.length <= 1) {
			return;
		}
		int ar[] = Arrays.copyOf(nums, nums.length - k);
		for (int i = 0; i < nums.length; i++) {
			if (i < k) {
				int head = nums[i];
				nums[i] = nums[nums.length - k + i];
				nums[nums.length - k + i] = head;
			} else {
				nums[i] = ar[i - k];
			}
		}
	}

	public static void main(String[] args) {
		RotateArray at = new RotateArray();
		at.rotate(new int[] {10, 20, 30, 40, 50, 60, 70, 80}, 2);
	}
}
