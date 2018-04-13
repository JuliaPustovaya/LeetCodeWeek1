package Strings;

public class Reverse {
	public String reverseString(String s) {
		int length = s.toCharArray().length;
		char arrayOfChars[] = s.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			char temp = arrayOfChars[i];
			arrayOfChars[i] = arrayOfChars[length - 1 - i];
			arrayOfChars[length - 1 - i] = temp;
		}
		return new String(arrayOfChars);
	}
}

