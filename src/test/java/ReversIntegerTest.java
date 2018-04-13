import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Strings.ReverseInteger;

public class ReversIntegerTest {
	private ReverseInteger reverseInteger = new ReverseInteger();

	@Test
	public void reversIntegerTest() {
		assertEquals(-321, reverseInteger.reverse(-12300));
		assertEquals(321, reverseInteger.reverse(12300));
		assertEquals(-321, reverseInteger.reverse(-123));
		assertEquals(321, reverseInteger.reverse(123));
		assertEquals(0, reverseInteger.reverse(0));
		assertEquals(0, reverseInteger.reverse(1534236469));
	}
}

