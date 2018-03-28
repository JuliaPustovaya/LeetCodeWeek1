package Arrays;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(Integer[] nums) {
		int element, number = 0;
		int length = nums.length;
		for (int i1 = 0; i1 < length - 1; i1++) {
			element = nums[i1];
			for (int i = i1 + 1; i < length - 1; i++) {
				if (nums[i] == element) {
					number = i;
					break;
				}
			}
			for (int j = number; j < length - 1; j++) {
				nums[j] = nums[j + 1];
			}
			length--;
		}
		System.out.println(length);
		return length;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
		removeDuplicatesFromSortedArray.removeDuplicates(new Integer[] {10, 10, 7, 7});
	}
}
