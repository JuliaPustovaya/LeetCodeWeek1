package Arrays;

public class PlusOnes {
	/*public static int[] plusOne(int[] digits) {

		try {
			String res = "";
			for (int i = 0; i < digits.length; i++) {
				res = res + digits[i];
			}
			long resInt = Long.parseLong(res) + 1;

			int[] r = new int[String.valueOf(resInt).toCharArray().length];
			for (int i = 0; i < r.length; i++) {
				r[i] = 0;
			}
			for (int i = 0; i < r.length; i++) {
				r[i] = Integer.parseInt((String.valueOf(resInt)).charAt(i)+"");
			}
			return r;
		}
		catch (NumberFormatException ex){
			System.out.println("ghh");
			return  new int[] {};
		}
	}*/
	public static int[] plusOne(int[] digits) {
		if ((1 + digits[digits.length - 1]) < 9) {
			int temp1 = 1 + digits[digits.length - 1];
			digits[digits.length - 1] = temp1;
			return digits;
		}
		else
		{
			int newAr[]= new int[digits.length-1];
			for (int i = 0; i <digits.length-1 ; i++) {
				newAr[i]=digits[i];
			}
			plusOne(newAr);
			return newAr;
		}

	}

	public static void main(String[] args) {
		int[] arrayInitial = new int[] {7, 2, 8, 5, 9};
		for (int i = 0; i <plusOne(arrayInitial).length ; i++) {
			System.out.println(plusOne(arrayInitial)[i]);
		}

	}
}
