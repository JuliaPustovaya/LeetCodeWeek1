package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			boolean isSingleEl = true;
			if (i + 1 < nums.length) {
				isSingleEl = nums[i] != nums[i + 1];
			}
			if (i - 1 >= 0) {
				isSingleEl = nums[i] != nums[i - 1] && isSingleEl;
			}
			if (isSingleEl) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Integer[] mas = {5, 8, 100, 5, 8};
		Integer[] todelete = {5, 8};
		List<Integer> list = new ArrayList<>(Arrays.asList(mas));
		list.removeAll(Arrays.asList(todelete));
		System.out.println(list);
	}

			/*List<Integer> list  = Arrays.stream(nums)
				.boxed()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());

		List<Integer> listOfOddElements = IntStream
				.range(0, list.size())
				.filter(i -> i % 2 != 0)
				.mapToObj(list::get)
				.collect(Collectors.toList());
		list.removeAll(listOfOddElements);    */
}

