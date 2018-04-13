import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Strings.FirstUniqueCharacter;

public class FirstUniqueCharacterTest {
	private FirstUniqueCharacter fisrtUniqueCharacter = new FirstUniqueCharacter();

	@Test
	public void FisrtUniqueCharacterTest() {
		assertEquals(-1, fisrtUniqueCharacter.firstUniqChar("vv"));
		assertEquals(0, fisrtUniqueCharacter.firstUniqChar("pvv"));
		assertEquals(0, fisrtUniqueCharacter.firstUniqChar("klppp"));
		assertEquals(2, fisrtUniqueCharacter.firstUniqChar("kklppp"));
		assertEquals(-1, fisrtUniqueCharacter.firstUniqChar(""));
	}
}
