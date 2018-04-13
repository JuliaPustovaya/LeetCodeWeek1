import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Strings.Reverse;

public class ReverseStringTest {
	private Reverse r = new Reverse();

	@Test
	public void reverseStringTest() {
		assertEquals("", r.reverseString(""));
		assertEquals("dcba", r.reverseString("abcd"));
		assertEquals("dc", r.reverseString("cd"));
		assertEquals("AAaa", r.reverseString("aaAA"));
		assertEquals("dcA", r.reverseString("Acd"));
	}
}

