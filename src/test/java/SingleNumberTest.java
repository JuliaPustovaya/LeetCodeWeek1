
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Arrays.SingleNumber;

public class SingleNumberTest {
	@Test
	public void getNonDblicateTest() {
		assertEquals(1, SingleNumber.getNonDblicate(new Integer[] {1, 5, 8, 5, 8}).get(0));
		assertEquals(0, SingleNumber.getNonDblicate(new Integer[] {5, 8, 5, 8}).size());
	}
}