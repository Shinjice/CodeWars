public class ReverseNumber {
	public static int reverse(int number) {
		return number < 0 ? -reverse(-number) : Integer.parseInt(new StringBuilder("" + number).reverse().toString());
	}
}

//https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5/train/java