package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionoftwoarraArrays {

	public static int[] intersect(int[] nums1, int[] nums2) {
		if (nums2.length == 0) {
			return new int[] {};
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> resultList = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < nums1.length && p2 < nums2.length) {
			if (nums1[p1] < nums2[p2]) {
				p1++;
			} else if (nums1[p1] > nums2[p2]) {
				p2++;
			} else {
				resultList.add(nums1[p1]);
				p1++;
				p2++;
			}
		}
		int[] result = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			result[i] = resultList.get(i);
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		int nums1[] = new int[] {-24584, 1, 2, 3};
		int nums2[] = new int[] {1, -24584, -24584};
		intersect(nums1, nums2);
	}
}
