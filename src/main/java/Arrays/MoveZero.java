package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZero {
	public static void moveZeroes(int[] nums) {
		List<Integer> listWithNo0 = Arrays.stream(nums.clone()).boxed().filter(s -> s != 0).collect(Collectors.toList());
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
		for (int i = 0; i < listWithNo0.size(); i++) {
			nums[i] = listWithNo0.get(i);
		}
	}

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		moveZeroes(nums);
	}
}
