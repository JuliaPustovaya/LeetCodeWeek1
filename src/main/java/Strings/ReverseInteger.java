package Strings;

public class ReverseInteger {
	public int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		int isNegative = x < 0 ? -1 : 1;
		String stringInt = isNegative == 1 ? String.valueOf(x) : String.valueOf(x * (-1));
		stringInt = removeZeroFromString(stringInt);
		int length = stringInt.toCharArray().length;
		char arrayOfChars[] = stringInt.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			char temp = arrayOfChars[i];
			arrayOfChars[i] = arrayOfChars[length - 1 - i];
			arrayOfChars[length - 1 - i] = temp;
		}
		try {
			return
					Integer.parseInt(String.valueOf(arrayOfChars)) * isNegative;
		}
		catch (NumberFormatException ex) {
			return 0;
		}
	}

	public String removeZeroFromString(String s) {
		if (s.charAt(s.length() - 1) != '0') {
			return s;
		} else {
			return removeZeroFromString(s.substring(0, s.length() - 1));
		}
	}
}
