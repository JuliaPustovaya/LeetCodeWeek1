package Strings;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.google.common.primitives.Chars;

public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
		s.toLowerCase();
		if (s.isEmpty()) {
			return -1;
		}
		List<Character> inputCharacters = Chars.asList(s.toCharArray());
		Map<Object, Long> characterCounts = inputCharacters
				.stream()
				.collect(groupingBy(s1 -> s1, counting()));
		char resultChar = inputCharacters
				.stream()
				.filter(s1 -> characterCounts.get(s1) == 1)
				.findFirst()
				.orElse((char) -1);
		return Objects.isNull(resultChar) ? -1 : s.indexOf(resultChar);
	}
}
