
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Arrays.RemoveDuplicatesFromSortedArray;
import Arrays.RotateArray;
import Arrays.SingleNumber;

public class SingleNumberTest {
	@Test
	public void getNonDblicateTest() {
		assertEquals(100, SingleNumber.singleNumber(new int[] {5, 8, 5, 8, 100}));
		assertEquals(-1, SingleNumber.singleNumber(new int[] {5, 8, 5, 8}));
		assertEquals(1, SingleNumber.singleNumber(new int[] {5, 8, 1, 5, 8}));
	}

	@Test
	public void removedublicatesTest() {
		RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
		assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new Integer[] {10, 10, 7, 7}));
		assertEquals(3, removeDuplicatesFromSortedArray.removeDuplicates(new Integer[] {10, 10, 7, 7, 9}));
		assertEquals(3, removeDuplicatesFromSortedArray.removeDuplicates(new Integer[] {10, 10, 7, 7, 9, 9}));
	}

	@Test
	public void rotateArrayTest() {
		RotateArray at = new RotateArray();
		int nums[] = new int[] {70, 80, 10, 20, 30, 40, 50, 60};
		int[] numms1 = {10, 20, 30, 40, 50, 60, 70, 80};
		at.rotate(numms1, 2);
		assertTrue(Arrays.equals(nums, numms1));

		int nums2[] = new int[] {60, 70, 80, 10, 20, 30, 40, 50};
		int[] numms3 = {10, 20, 30, 40, 50, 60, 70, 80};
		at.rotate(numms3, 3);
		assertTrue(Arrays.equals(nums2, numms3));

		int[] ex = new int[] {2, 1};
		int[] n = new int[] {1, 2};
		at.rotate(n, 3);
		assertTrue(Arrays.equals(ex, n));

	}
}